package com.myjavablog.behavioural.strategy;

public class BubbleSort implements Strategy {
    @Override
    public void sort(int[] numbers) {
        System.out.println("Sorted using bubble sort!!");
    }
}
