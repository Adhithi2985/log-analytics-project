package com.example.logproject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogController {

    private static final Logger log = LoggerFactory.getLogger(LogController.class);

    @Autowired 
    private LogEntryRepository repository;

    @GetMapping("/log")
    public String generateLog() {
        String infoMessage = "INFO log: Hello, this is a test log!";
        log.info(infoMessage);
        repository.save(new LogEntry("INFO", infoMessage)); // This will now work

        String warnMessage = "WARN log: Something might be wrong.";
        log.warn(warnMessage);
        repository.save(new LogEntry("WARN", warnMessage)); // This will also work

        return "Logs generated and SAVED to database!";
    }

    
    @GetMapping("/error")
    public String generateError() {
        for (int i = 0; i < 10; i++) {
            String errorMessage = "ERROR log: This is a test error! Count: " + i;
            log.error(errorMessage); // This will update Prometheus
            repository.save(new LogEntry("ERROR", errorMessage)); // This saves to DB
        }
        return "10 errors generated and SAVED to database!";
    }
}