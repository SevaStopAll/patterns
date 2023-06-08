package ru.sevastopall.patterns.behavioral.state;

public class Main {

    public static void main(String[] args) {
        State stateA = new StateA();
        Context context = new Context(stateA);
        context.doAction();
        context.doAction();
    }
}
