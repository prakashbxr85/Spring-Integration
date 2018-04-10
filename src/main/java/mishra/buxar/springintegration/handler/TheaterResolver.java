package mishra.buxar.springintegration.handler;

import javax.mail.MessagingException;

import org.springframework.stereotype.Component;

@Component("theaterResolver")
public class TheaterResolver {
public String resolve(MessagingException exc){
	return exc.getMessage();
	
}
}
