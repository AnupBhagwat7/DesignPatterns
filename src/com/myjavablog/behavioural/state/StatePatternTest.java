package com.myjavablog.behavioural.state;

public class StatePatternTest {

    public static void main(String[] args) {

        MobileContext context = new MobileContext(new Ringing());
        context.getState();
        context.getState();
        context.setMobileState(new Vibrate());
        context.getState();
        context.getState();
        context.getState();
        context.setMobileState(new Silent());
        context.getState();
        context.getState();

    }
}
