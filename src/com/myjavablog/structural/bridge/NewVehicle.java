package com.myjavablog.structural.bridge;

//Concrete implementation 1 for bridge pattern
public class NewVehicle implements VehicleType {

    @Override
    public void book() {
        System.out.println("New vehicle");
    }
}
