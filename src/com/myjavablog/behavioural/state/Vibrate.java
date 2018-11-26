package com.myjavablog.behavioural.state;

public class Vibrate implements MobileState {
    @Override
    public void getState() {
        System.out.println("Mobile in Vibrate mode");
    }
}
