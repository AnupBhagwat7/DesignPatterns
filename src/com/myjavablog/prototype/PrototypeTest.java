package com.myjavablog.prototype;

public class PrototypeTest {

    public Bike makeJaguar(Bike basicBike){

        basicBike.makeAdvanced();
        return basicBike;
    }
    public static void main(String[] args) {

        Bike bike = new Bike();
        Bike basicBike = bike.clone();
        PrototypeTest pt = new PrototypeTest();
        Bike advancedBike = pt.makeJaguar(basicBike);

        System.out.println("Advanced Bike model:"+ advancedBike.getModel());
        System.out.println("Advanced Bike :"+ advancedBike.toString());

    }
}
