package com.myjavablog.behavioural.mediator;

public class ColleagueB extends Colleague{

    ColleagueB(IMediator mediator){
        this.mediator = mediator;
        this.mediator.registerB(this);
    }

    @Override
    public void doSomething() {
        this.mediator.fight();
    }
}
