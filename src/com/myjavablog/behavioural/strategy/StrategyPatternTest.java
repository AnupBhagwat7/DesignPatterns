package com.myjavablog.behavioural.strategy;

public class StrategyPatternTest {

    public static void main(String[] args) {

        int[] var = {2, 4, 1, 3 , 9, 6};

        //We can provide any strategy for sorting
        Context ctx = new Context(new BubbleSort());
        ctx.arrange(var);

        //We can change the strategy without changing Context class
        ctx = new Context(new MergeSort());
        ctx.arrange(var);
    }
}
