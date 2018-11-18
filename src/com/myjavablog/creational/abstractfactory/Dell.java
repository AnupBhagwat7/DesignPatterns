package com.myjavablog.creational.abstractfactory;

public class Dell implements ILaptop {


    @Override
    public void processor() {
        System.out.println("Processor available in AMD, I3, I5, I7");
    }

    @Override
    public void cost() {
        System.out.println("Cost starts from 18k");

    }

    @Override
    public void ramSize() {
        System.out.println("RAM size starts from 1 GB");
    }
}
