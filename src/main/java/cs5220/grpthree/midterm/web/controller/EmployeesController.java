package cs5220.grpthree.midterm.web.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/employees")
public class EmployeesController {

    @GetMapping
    public String simple()
    {
        //Logging starts here -------------
        
        Logger log = LoggerFactory.getLogger(this.getClass());
        
        log.debug("This is a debug message");					
        log.info("This is an info message");
        log.warn("This is a warn message");
        log.error("Error Message from Employee");
        
        //Logging ends here ------------
        
        return "This is the Employee Controller";
    }

    
}
