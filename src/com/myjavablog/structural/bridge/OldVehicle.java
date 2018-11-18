package com.myjavablog.structural.bridge;

//Concrete implementation 2 for bridge pattern
public class OldVehicle implements VehicleType {

    @Override
    public void book() {
        System.out.println("Old vehicle");
    }
}
