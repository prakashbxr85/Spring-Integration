package mishra.buxar.springintegration.handler;

import java.util.Date;

import javax.mail.MessagingException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import mishra.buxar.springintegration.model.FailedMessage;

@Component("mongodbRequestHandler")
public class MongodbRequestHandler {
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private TheaterResolver theaterResolver;

	public FailedMessage handle(MessagingException exc) {
		logger.error("Request failed. Storing to the database");

		String theater = theaterResolver.resolve(exc);
		FailedMessage failedMsg = new FailedMessage(new Date(), exc.getMessage(), theater);

		return failedMsg;
	}
}