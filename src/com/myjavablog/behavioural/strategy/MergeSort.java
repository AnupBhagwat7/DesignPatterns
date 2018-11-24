package com.myjavablog.behavioural.strategy;

public class MergeSort implements Strategy {
    @Override
    public void sort(int[] numbers) {
        System.out.println("Sorted using Merge sort!!");
    }
}
