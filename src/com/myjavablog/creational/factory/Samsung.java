package com.myjavablog.creational.factory;

public class Samsung implements ILaptop {


    @Override
    public void processor() {
        System.out.println("Processor available in I3, I5, I7");
    }

    @Override
    public void cost() {
        System.out.println("Cost starts from 20k");

    }

    @Override
    public void ramSize() {
        System.out.println("RAM size starts from 2 GB");
    }
}
