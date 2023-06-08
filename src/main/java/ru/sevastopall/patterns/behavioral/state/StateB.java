package ru.sevastopall.patterns.behavioral.state;

public class StateB implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("Выполнено действие в состоянии B");
        context.setState(new StateA());
    }
}
