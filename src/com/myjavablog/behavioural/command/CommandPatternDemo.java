package com.myjavablog.behavioural.command;

public class CommandPatternDemo {

    public static void main(String[] args) {

        Lunch lunch = new Lunch(); //Receiver
        Command lunchCommand = new LunchCommand(lunch); //Concrete command

        Dinner dinner = new Dinner(); //Receiver
        Command dinnerCommand = new DinnerCommand(dinner); //Concrete command

        MealInvoker mealInvoker = new MealInvoker(lunchCommand);  //invoker
        mealInvoker.invoke();

        mealInvoker.setCommand(dinnerCommand);
        mealInvoker.invoke();

    }
}
