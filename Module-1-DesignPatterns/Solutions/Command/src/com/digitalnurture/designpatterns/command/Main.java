package com.digitalnurture.designpatterns.command;

/**
 * Test runner for Command Design Pattern.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=== Testing Command Pattern ===");

        // Create Receiver
        Light livingRoomLight = new Light("Living Room");

        // Create Commands
        Command lightOn = new LightOnCommand(livingRoomLight);
        Command lightOff = new LightOffCommand(livingRoomLight);

        // Create Invoker
        RemoteControl remote = new RemoteControl();

        // 1. Turn light ON
        System.out.println("Invoker: Setting 'Turn ON' command...");
        remote.setCommand(lightOn);
        remote.pressButton();

        System.out.println();

        // 2. Turn light OFF
        System.out.println("Invoker: Setting 'Turn OFF' command...");
        remote.setCommand(lightOff);
        remote.pressButton();
    }
}
