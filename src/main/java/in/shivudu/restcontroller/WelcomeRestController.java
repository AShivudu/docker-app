
package in.shivudu.restcontroller;

import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import ch.qos.logback.classic.Logger;

@RestController
public class WelcomeRestController {

	private Logger logger = (Logger) LoggerFactory.getLogger(WelcomeRestController.class);
	
	
	public  WelcomeRestController() {
		logger.info("** WelcomeRestController : Constructor **");
	}
	
	@GetMapping("/{name}")
	public String welcomeMsg(@PathVariable("name") String name) {
		logger.info("** WelcomeRestController()  : exicution start **");
		String msg= name +"  :"+" Welcome To Docker..!";
		logger.info("** WelcomeRestController()  : exicution End **");
	return msg;
	}
	
}


