package mishra.buxar.springintegration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringIntegrationApiApp {
	private static Logger logger = LoggerFactory.getLogger("mainLogger");
    static AbstractApplicationContext context;
	public static void main(String[] args) {
		    context = new ClassPathXmlApplicationContext("classpath:int-config.xml");
	        context.registerShutdownHook();
	        
	        logger.info("\\nSelect your option (1-Egyptian Theater / 2-Pantages Theater / 0-quit):\\n");
	   
	}
}
