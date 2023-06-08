package ru.sevastopall.patterns.creational;

public class Singletone {
    private static Singletone instance;

    private Singletone() {

    }

    public static Singletone getInstance() {
        if (instance == null) {
            instance = new Singletone();
        }
        return instance;
    }
    public static void main(String[] args) {
        Singletone sing1 = Singletone.getInstance();
        System.out.println(sing1.toString());

        Singletone sing2 = Singletone.getInstance();
        System.out.println(sing2.toString());
    }
}


