package com.myjavablog.behavioural.mediator;

public class ColleagueA extends Colleague{

    ColleagueA(IMediator mediator){
        this.mediator = mediator;
        this.mediator.registerA(this);
    }

    @Override
    public void doSomething() {
        this.mediator.talk();
    }
}
