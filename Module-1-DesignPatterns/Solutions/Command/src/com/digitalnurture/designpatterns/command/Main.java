package com.digitalnurture.designpatterns.command;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Testing Command Pattern ===");

        Light livingRoomLight = new Light("Living Room");

        Command lightOn = new LightOnCommand(livingRoomLight);
        Command lightOff = new LightOffCommand(livingRoomLight);

        RemoteControl remote = new RemoteControl();

        System.out.println("Invoker: Setting 'Turn ON' command...");
        remote.setCommand(lightOn);
        remote.pressButton();

        System.out.println();

        System.out.println("Invoker: Setting 'Turn OFF' command...");
        remote.setCommand(lightOff);
        remote.pressButton();
    }
}
