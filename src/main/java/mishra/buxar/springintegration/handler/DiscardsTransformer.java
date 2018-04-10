package mishra.buxar.springintegration.handler;

import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

@Component("discardsTransformer")
public class DiscardsTransformer {

    public String transform(Message<String> msg) {
        return  msg.getPayload();
    }
}