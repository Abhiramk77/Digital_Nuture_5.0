package com.digitalnurture.designpatterns.command;

/**
 * Concrete Command implementing Command to turn off a light.
 */
public class LightOffCommand implements Command {
    private final Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOff();
    }
}
