package com.example.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoggingController {
 
    Logger logger = LoggerFactory.getLogger(LoggingController.class);
 
    @RequestMapping("/")
    public String index() {

        int a[]= new int[10];
        try {
            int x= a[11];
        }
        catch (Exception e){
            logger.error(" message", e );
        }

        logger.trace("A TRACE Message");
        logger.debug("A DEBUG Message");
        logger.info("An INFO Message");
        logger.warn("A WARN Message");
        logger.error("An ERROR Message");
 
        return "Logging Example";
    }
}