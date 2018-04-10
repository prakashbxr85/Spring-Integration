package mishra.buxar.springintegration.handler;

import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import mishra.buxar.springintegration.model.Film;

@Component("restResponseHandler")
public class RestResponseHandler {
    private static final String NEW_LINE = "\\n";

    @ServiceActivator
    public String handle(Message<Film[]> msg) {
        Film[] films = msg.getPayload();
        
        StringBuilder response = new StringBuilder(NEW_LINE);
        if (films.length > 0) {
            response.append("Returned films:" + NEW_LINE);
        }
        else {
            response.append("No films returned" + NEW_LINE);
        }
        
        for (Film f:films) {
            response.append(f.getName()).append(NEW_LINE);
        }
        
        return response.toString();
    }
}