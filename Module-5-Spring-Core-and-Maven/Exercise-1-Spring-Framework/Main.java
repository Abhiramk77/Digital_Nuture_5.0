package com.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        
        GreetingService service = context.getBean(GreetingService.class);
        System.out.println(service.getGreeting());
        
        context.close();
    }
}
