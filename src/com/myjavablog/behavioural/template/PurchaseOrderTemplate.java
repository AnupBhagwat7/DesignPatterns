package com.myjavablog.behavioural.template;

public abstract class PurchaseOrderTemplate {

    public abstract void doSelect();
    public abstract void doPayment();
    public final void doPack(){
        System.out.println("Gift wrapping done.");
    }
    public abstract void doDelivery();
    public final void processOrder(){
        doSelect();
        doPayment();
        doPack();
        doDelivery();
    }

}
