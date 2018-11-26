package com.myjavablog.behavioural.command;

//MealInvoker is invoker class
//It contains reference to command to invoke
//Its invoke method calls execute method of command
public class MealInvoker {

    Command command;

    public MealInvoker(Command command){
        this.command = command;
    }

    public void setCommand(Command command){
        this.command = command;
    }

    public void invoke(){
        command.execute();
    }

}
