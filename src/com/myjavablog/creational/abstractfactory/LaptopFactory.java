package com.myjavablog.creational.abstractfactory;

public class LaptopFactory implements ILaptopFactory{


    @Override
    public ILaptopFactory createLaptop(String type) {

        ILaptopFactory laptop = null;

        if("Lenovo".equalsIgnoreCase(type))
            laptop = new LenovoLaptopFactory();
        else if("dell".equalsIgnoreCase(type))
            laptop = new DellLaptopFactory();

        return laptop;
    }
}
