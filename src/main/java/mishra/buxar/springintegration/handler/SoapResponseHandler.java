package mishra.buxar.springintegration.handler;

import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import mishra.buxar.springintegration.model.Film;
import mishra.buxar.springintegration.model.FilmResponse;

@Component("soapResponseHandler")
public class SoapResponseHandler {
    private static final String NEW_LINE = "\\n";

    @ServiceActivator
    public String handle(Message<FilmResponse> msg) {
        FilmResponse response = msg.getPayload();
        
        StringBuilder resp = new StringBuilder(NEW_LINE);
        if (response.getFilm().size() > 0) {
            resp.append("Returned films:" + NEW_LINE);
        }
        else {
            resp.append("No films returned" + NEW_LINE);
        }
        
        for (Film f : response.getFilm()) {
            resp.append(f.getName()).append(NEW_LINE);
        }
        
        return resp.toString();
    }
}