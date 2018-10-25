package com.myjavablog.abstractfactory;

public class TestAbstractFactory {

    public static void main(String[] args) {

        System.out.println("Lenovo Configuration");
        LaptopFactory factory = new LaptopFactory();
        LenovoLaptopFactory llf = (LenovoLaptopFactory) factory.createLaptop("lenovo");
        Lenovo len = (Lenovo) llf.createLenovoLaptop();
        len.processor();
        len.cost();

        System.out.println("Dell Configuration");
        DellLaptopFactory dlf = (DellLaptopFactory) factory.createLaptop("dell");
        Dell dell = (Dell) dlf.createDellLaptop();
        dell.processor();
        dell.cost();

    }
}
