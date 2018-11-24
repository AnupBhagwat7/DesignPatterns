package com.myjavablog.behavioural.observer;

import java.util.ArrayList;
import java.util.List;

//Concrete Subject
public class Blog implements Subject {

    List<Observer> observerList;
    private boolean stateChange;

    public Blog(){
        this.observerList = new ArrayList<>();
        stateChange = false;
    }

    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void notifyObserver() {
        if(stateChange){
            for(Observer observer: observerList){
                observer.update();
                System.out.println("Observer notified!!");
            }
        }
    }

    @Override
    public void unregisterObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public Object getUpdate() {

        Object changedState = null;

        //Should have a logic to send state change to the querying observer
        if(stateChange){
            changedState = "Observer Design Pattern";
        }

        return changedState;
    }

    public void postNewArticle(){
        stateChange = true;
        notifyObserver();
    }
}
