package com.myjavablog.structural.bridge;

public class BridgePatternTest {


    public static void main(String[] args) {

        Vehicle v1 = new Car(new NewVehicle(), new OldVehicle());
        v1.purchase();


        Bike b1 = new Bike(new NewVehicle(), new OldVehicle());
        b1.purchase();
    }
}
