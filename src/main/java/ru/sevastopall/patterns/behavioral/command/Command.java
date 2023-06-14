package ru.sevastopall.patterns.behavioral.command;

public interface Command {
    void execute();
}

class LightOnCommand implements Command {
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
    }
}

class LightOffCommand implements Command {
    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOff();
    }
}

class LightChangeColorCommand implements Command {
    private Light light;

    public LightChangeColorCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.changeColor();
    }
}

class Light {
    public void turnOn() {
        System.out.println("Light is on");
    }

    public void turnOff() {
        System.out.println("Light is off");
    }

    public void changeColor() {
        System.out.println("Light color has been changed");
    }
}

class RemoteControl {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
    }
}

class Client {
    public static void main(String[] args) {
        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);
        LightChangeColorCommand lightChangeColorCommand = new LightChangeColorCommand(light);

        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommand(lightOnCommand);
        remoteControl.pressButton();
        remoteControl.setCommand(lightChangeColorCommand);
        remoteControl.pressButton();
        remoteControl.setCommand(lightOffCommand);
        remoteControl.pressButton();
    }
}