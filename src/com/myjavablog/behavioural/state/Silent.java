package com.myjavablog.behavioural.state;

public class Silent implements MobileState {
    @Override
    public void getState() {
        System.out.println("Mobile in Silent mode");
    }
}
