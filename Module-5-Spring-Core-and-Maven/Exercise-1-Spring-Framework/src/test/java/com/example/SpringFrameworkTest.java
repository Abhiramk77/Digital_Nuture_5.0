package com.example;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SpringFrameworkTest {

    @Test
    public void testGreetingServiceRetrieval() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        GreetingService service = context.getBean(GreetingService.class);
        
        assertNotNull(service);
        assertTrue(service.getGreeting().contains("Spring Framework"));
        
        context.close();
    }
}
