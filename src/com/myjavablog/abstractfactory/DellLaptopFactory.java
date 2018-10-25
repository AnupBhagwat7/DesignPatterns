package com.myjavablog.abstractfactory;

public class DellLaptopFactory extends LaptopFactory{


    public Dell createDellLaptop() {
        return new Dell();
    }
}
