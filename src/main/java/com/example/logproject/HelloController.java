package com.example.logproject; // <--- IMPORTANT: Change this to your project's package name

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    /**
     * This method handles all HTTP GET requests sent to the
     * root URL ("/") of the application.
     */
    @GetMapping("/")
    public String home() {
        // You can return any message you want
        return "Application is running successfully!";
    }
}