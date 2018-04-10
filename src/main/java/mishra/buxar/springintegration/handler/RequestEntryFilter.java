package mishra.buxar.springintegration.handler;

import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

@Component("entryFilter")
public class RequestEntryFilter {

    public boolean filterInvalidEnteries(Message<String> msg) {
    	String payload = msg.getPayload();
    	if (!"1".equals(payload) && !"2".equals(payload))  {
            return false;
        }
        
        return true;
    }
}
