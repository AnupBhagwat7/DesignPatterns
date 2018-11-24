package com.myjavablog.behavioural.COR;

public class CORPatternTest {

    public static void main(String[] args) {

        //Configure chain of responsibility
        Chain c1 = new NegativeNumberProcessor();
        Chain c2 = new ZeroProcessor();
        Chain c3 = new PositiveNumberProcessor();
        c1.setNext(c2);
        c2.setNext(c3);

        //Calling chain of responsibility
        c1.process(new Number(99));
        c1.process(new Number(-76));
        c1.process(new Number(0));
        c1.process(new Number(100));

    }
}
