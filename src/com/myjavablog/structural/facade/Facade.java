package com.myjavablog.structural.facade;

/*
This is the Facade class which interacts with this System of classes
Names of the methods clearly indicates what they do
This methods hides interactions of Calculator1,Calculator2,Calculator3 from client
 */

public class Facade {


    public float cubeX(int x){

        Calculator1 c1 = new Calculator1();
        return c1.doSomethingComplex(x);
    }

    public float cubeXTimes2(int x){
        Calculator1 c1 = new Calculator1();
        Calculator2 c2 = new Calculator2();

        return c2.doAnotherThing(c1,x);
    }

    public float multiplyBoth(int x){
        Calculator1 c1 = new Calculator1();
        Calculator2 c2 = new Calculator2();
        Calculator3 c3 = new Calculator3();

        return c3.doMoreStuff(c1,c2,x);
    }

}
