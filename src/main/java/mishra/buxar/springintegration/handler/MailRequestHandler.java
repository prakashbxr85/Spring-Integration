package mishra.buxar.springintegration.handler;

import javax.mail.MessagingException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.mail.MailMessage;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Component;

@Component("mailRequestHandler")
public class MailRequestHandler {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    
    @Autowired
    private TheaterResolver theaterResolver;
    
    @ServiceActivator
    public MailMessage handle(MessagingException exc) {
        logger.error("Request failed. Sending mail");
        
        MailMessage mailMsg = new SimpleMailMessage();
        mailMsg.setFrom("Theater.System");
        mailMsg.setTo("prakashbxr85@gmail.com");
        mailMsg.setSubject("theater request failed");
        
        String theater = theaterResolver.resolve(exc);
        StringBuilder textMessage = new StringBuilder("Invocation to ").append(theater).append(" failed\\n\\n")
                .append("Error message was: ").append(exc.getMessage());
        mailMsg.setText(textMessage.toString());
        
        return mailMsg;
    }
}
