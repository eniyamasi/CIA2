package com.cia.cicd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "Hello from CIA 2 CI/CD Pipeline!";
    }

    @GetMapping("/health")
    public String health() {
        return "Application is running!";
    }
}