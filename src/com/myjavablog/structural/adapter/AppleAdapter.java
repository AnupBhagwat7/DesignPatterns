package com.myjavablog.structural.adapter;

public class AppleAdapter extends Apple {

    //Purpose of sample problem is to orange as Apple
    private Orange orange;

    public AppleAdapter(Orange orange) {
        this.orange = orange;
    }

    public void getColor(String color){
        orange.getOrangeColor(color);
    }
}
