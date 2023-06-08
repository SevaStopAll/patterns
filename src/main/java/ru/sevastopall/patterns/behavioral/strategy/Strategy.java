package ru.sevastopall.patterns.behavioral.strategy;

public class Strategy {


    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
        ArraySorter sorter = new ArraySorter(new BubbleSort());
        sorter.sort(array);
        sorter.setSortingStrategy(new MergeSort());
        sorter.sort(array);
    }

    interface SortingStrategy {
        void sort(int[] array);
    }
}
