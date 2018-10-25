package com.myjavablog.factory;

public class LaptopFactory {


    public ILaptop createLaptop(String type) {

        ILaptop laptop = null;

        if("sam".equalsIgnoreCase(type)){
            laptop = new Samsung();
            System.out.println("Samsung laptop created");
        }else if("len".equalsIgnoreCase(type)){
            laptop = new Lenovo();
            System.out.println("Lenovo laptop created");
        }if("dell".equalsIgnoreCase(type)){
            laptop = new Dell();
            System.out.println("Dell laptop created");
        }
        return laptop;
    }
}
