package com.digitalnurture.designpatterns.command;

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
