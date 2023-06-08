package ru.sevastopall.patterns.behavioral.strategy;

public class BubbleSort implements Strategy.SortingStrategy {

    @Override
    public void sort(int[] array) {
        System.out.println("Реализация сортировки пузырьком");
    }
}
