package com.myjavablog.behavioural.strategy;

public class InsertionSort implements Strategy {
    @Override
    public void sort(int[] numbers) {
        System.out.println("Sorted using Insertion sort!!");
    }
}
