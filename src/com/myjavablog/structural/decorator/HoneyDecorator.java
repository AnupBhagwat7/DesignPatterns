package com.myjavablog.structural.decorator;

public class HoneyDecorator extends IcecreamDecorator {

    public HoneyDecorator(Icecream specialIcecream) {
        super(specialIcecream);
    }

    public String makeIceCream() {
        return specialIcecream.makeIcecream() + addHoney();
    }

    public String addHoney() {
        return "+ Honey sweetner ";
    }
}
