package com.digitalnurture.designpatterns.command;

/**
 * Concrete Command implementing Command to turn on a light.
 */
public class LightOnCommand implements Command {
    private final Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
    }
}
