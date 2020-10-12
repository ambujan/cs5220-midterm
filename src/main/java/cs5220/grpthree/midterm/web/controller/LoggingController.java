package cs5220.grpthree.midterm.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Profile("professor")
public class LoggingController{
	
	@RequestMapping("/logger")
	public String start() {
		Logger log = LoggerFactory.getLogger(this.getClass());
        
        log.debug("This is a debug message");					
        log.info("This is an info message");
        log.warn("This is a warn message");
        log.error("Error Message from Logger");
        
		return "This is the Logging controller";
	}
}