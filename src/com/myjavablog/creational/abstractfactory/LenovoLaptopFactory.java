package com.myjavablog.creational.abstractfactory;

public class LenovoLaptopFactory extends LaptopFactory{


    public Lenovo createLenovoLaptop() {
        return new Lenovo();
    }
}
