package com.digitalnurture.designpatterns.command;

/**
 * Receiver class.
 * Knows how to perform the operations associated with carrying out a request.
 */
public class Light {
    private final String roomName;

    public Light(String roomName) {
        this.roomName = roomName;
    }

    public void turnOn() {
        System.out.println("The " + roomName + " light is ON.");
    }

    public void turnOff() {
        System.out.println("The " + roomName + " light is OFF.");
    }
}
