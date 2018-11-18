package com.myjavablog.structural.facade;

public class Calculator3 {

    //Calculator3 doMoreStuff() method takes Calculator1 and Calculator2 objects and multiplies it
    public float doMoreStuff(Calculator1 c1, Calculator2 c2 , int x){

        return c1.doSomethingComplex(x) * c2.doAnotherThing(c1, x) ;
    }
}
