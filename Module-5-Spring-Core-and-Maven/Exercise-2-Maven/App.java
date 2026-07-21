package com.example;

import org.apache.commons.lang3.StringUtils;

public class App {
    public static void main(String[] args) {
        String input = "maven is resolving dependencies correctly!";
        String capitalized = StringUtils.capitalize(input);
        System.out.println("Original: " + input);
        System.out.println("Capitalized via Commons-Lang3: " + capitalized);
    }

    public String formatText(String text) {
        return StringUtils.upperCase(text);
    }
}
