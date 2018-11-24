package com.myjavablog.behavioural.COR;

//This interface acts as a chain link
public interface Chain {

    public void setNext(Chain nextInChain);
    public void process(Number request);
}
