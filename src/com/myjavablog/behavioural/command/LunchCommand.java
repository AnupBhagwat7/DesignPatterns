package com.myjavablog.behavioural.command;

//LunchCommand implements Command. It contains reference to Lunch ,a receviver.
//Its execute method invokes appropriate action on receiver
public class LunchCommand implements Command{

    Lunch lunch;

    public LunchCommand(Lunch lunch){
        this.lunch = lunch;
    }


    @Override
    public void execute() {
        lunch.makeLunch();
    }
}
