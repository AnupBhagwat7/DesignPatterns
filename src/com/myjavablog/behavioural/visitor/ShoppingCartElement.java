package com.myjavablog.behavioural.visitor;

public interface ShoppingCartElement {

    //accept method takes Visitor argument
    public int accept(ShoppingCartVisitor visitor);
}
