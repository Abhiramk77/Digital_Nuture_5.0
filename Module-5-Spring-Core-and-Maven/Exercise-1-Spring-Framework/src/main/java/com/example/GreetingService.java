package com.example;

import org.springframework.stereotype.Service;

public interface GreetingService {
    String getGreeting();

    @Service
    class GreetingServiceImpl implements GreetingService {
        @Override
        public String getGreeting() {
            return "Welcome to Spring Framework with Java Config! Inversion of Control is active.";
        }
    }
}
