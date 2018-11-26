package com.myjavablog.behavioural.state;

public class Ringing implements MobileState {
    @Override
    public void getState() {
        System.out.println("Mobile in Ringing state");
    }
}
