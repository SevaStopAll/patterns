package ru.sevastopall.patterns.behavioral.strategy;

public class ArraySorter {
    private Strategy.SortingStrategy sortingStrategy;

    public ArraySorter(Strategy.SortingStrategy sortingStrategy) {
        this.sortingStrategy = sortingStrategy;
    }

    public void setSortingStrategy(Strategy.SortingStrategy sortingStrategy) {
        this.sortingStrategy = sortingStrategy;
    }

    public void sort(int [] array) {
        sortingStrategy.sort(array);
    }
}

