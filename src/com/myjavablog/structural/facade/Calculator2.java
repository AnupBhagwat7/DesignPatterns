package com.myjavablog.structural.facade;

public class Calculator2 {

    //Calculator2 doAnotherThing() method takes an integer input and returns double of cube of it
    public float doAnotherThing(Calculator1 c1, int x){

        return 2 * c1.doSomethingComplex(x);
    }
}
