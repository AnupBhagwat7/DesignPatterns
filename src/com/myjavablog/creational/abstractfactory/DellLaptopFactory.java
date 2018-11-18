package com.myjavablog.creational.abstractfactory;

public class DellLaptopFactory extends LaptopFactory{


    public Dell createDellLaptop() {
        return new Dell();
    }
}
