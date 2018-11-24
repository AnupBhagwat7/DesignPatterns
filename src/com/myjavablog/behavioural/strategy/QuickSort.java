package com.myjavablog.behavioural.strategy;

public class QuickSort implements Strategy {
    @Override
    public void sort(int[] numbers) {
        System.out.println("Sorted using Quick sort!!");
    }
}
