package mishra.buxar.springintegration.handler;

import org.springframework.integration.annotation.Transformer;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import mishra.buxar.springintegration.model.FilmRequest;

@Component("soapRequestTransformer")
public class SoapRequestTransformer {

    @Transformer
    public Message<?> createRequestMessage(Message<String> msg) {
        return MessageBuilder.withPayload(new FilmRequest()).copyHeadersIfAbsent(msg.getHeaders()).build();
    }
}