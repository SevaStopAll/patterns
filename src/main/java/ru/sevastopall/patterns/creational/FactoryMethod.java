package ru.sevastopall.patterns.creational;

public class FactoryMethod {
    public Animal adoptAnimal(String animalName) {
        if (animalName.equals("Cat")) {
            return new Cat();
        }
        return new Dog();

    }

    public static void main(String[] args) {
        Animal a = new FactoryMethod().adoptAnimal("Cat");
        System.out.println(a.getName());
        Animal b = new FactoryMethod().adoptAnimal("Dog");
        System.out.println(b.getName());
    }
}

abstract class Animal {
    public abstract String getName();
}

class Cat extends Animal {
    @Override
    public String getName() {
        return "Cat";
    }
}

class Dog extends Animal {
    @Override
    public String getName() {
        return "Dog";
    }
}
