package com.myjavablog.factory;

public class Lenovo implements ILaptop {


    @Override
    public void processor() {
        System.out.println("Processor available in I3, I5");
    }

    @Override
    public void cost() {
        System.out.println("Cost starts from 25k");

    }

    @Override
    public void ramSize() {
        System.out.println("RAM size starts from 4 GB");
    }
}
