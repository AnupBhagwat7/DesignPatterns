package com.myjavablog.behavioural.mediator;

public class ConcreteMediator implements IMediator {

    ColleagueA talk;
    ColleagueB fight;

    @Override
    public void talk() {
        System.out.println("Mediator is talking");
        //Talk colleague doing some stuff
    }

    @Override
    public void fight() {
        System.out.println("Mediator is fighting");
        //Fight colleague doing some stuff
    }

    @Override
    public void registerA(ColleagueA a) {
        this.talk =a;
    }

    @Override
    public void registerB(ColleagueB b) {
        this.fight =b;
    }
}
