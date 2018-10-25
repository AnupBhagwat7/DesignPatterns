package com.myjavablog.factory;

public class TestFactory {

    public static void main(String[] args) {

        LaptopFactory factory = new LaptopFactory();

        Lenovo len = (Lenovo) factory.createLaptop("len");
        len.processor();

        Dell dell = (Dell) factory.createLaptop("dell");
        dell.cost();

    }
}
