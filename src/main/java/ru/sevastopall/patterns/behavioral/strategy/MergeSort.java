package ru.sevastopall.patterns.behavioral.strategy;

public class MergeSort implements Strategy.SortingStrategy {
    @Override
    public void sort(int[] array) {
        System.out.println("Реализация сортировки слиянием");
    }
}

