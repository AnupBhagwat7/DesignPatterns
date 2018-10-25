package com.myjavablog.prototype;

public class Bike implements Cloneable{

    private int gears;
    private String bikeType;
    private String model;

    public Bike() {
        gears = 5;
        bikeType = "Standard";
        model = "BMW";
    }

    public Bike clone(){
        return new Bike();
    }

    public void makeAdvanced(){
        gears = 5;
        bikeType = "Advanced";
        model = "Jauguar";
    }

    public int getGears() {
        return gears;
    }

    public String getBikeType() {
        return bikeType;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "gears=" + gears +
                ", bikeType='" + bikeType + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
