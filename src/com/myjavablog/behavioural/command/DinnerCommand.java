package com.myjavablog.behavioural.command;

//DinnerCommand also implements Command. It contains reference to Dinner ,a receviver.
//Its execute method invokes appropriate action on receiver
public class DinnerCommand implements Command{

    Dinner dinner;

    public DinnerCommand(Dinner dinner){
        this.dinner = dinner;
    }


    @Override
    public void execute()
    {
        dinner.makeDinner();
    }
}
