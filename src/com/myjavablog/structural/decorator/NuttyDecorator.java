package com.myjavablog.structural.decorator;

public class NuttyDecorator extends IcecreamDecorator {

    public NuttyDecorator(Icecream specialIcecream) {
        super(specialIcecream);
    }

    public String makeIceCream(){
        return specialIcecream.makeIcecream() + addNuts();
    }

    public String addNuts(){
        return "+ Crunchy Nuts ";
    }
}
