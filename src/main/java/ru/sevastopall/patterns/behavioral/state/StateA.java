package ru.sevastopall.patterns.behavioral.state;

public class StateA implements State{
    @Override
    public void doAction(Context context) {
        System.out.println("Выполнено действие в состоянии А");
        context.setState(new StateB());
    }
}
