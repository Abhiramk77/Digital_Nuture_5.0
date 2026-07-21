package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    public void testFormatText() {
        App app = new App();
        String result = app.formatText("hello maven");
        assertEquals("HELLO MAVEN", result);
    }
}
