package com.myjavablog.behavioural.strategy;

public class Context  {

    private Strategy strategy;

    Context(Strategy strategy){
        this.strategy = strategy;
    }

    public void arrange(int[] input) {
        strategy.sort(input);
    }
}
