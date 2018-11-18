package com.myjavablog.behavioural.template;

public class StorePurchaseOrder extends PurchaseOrderTemplate{


    @Override
    public void doSelect() {
        System.out.println("Customer selects item from shelf");
    }

    @Override
    public void doPayment() {
        System.out.println("Pay at counter through Cash/POS");
    }

    @Override
    public void doDelivery() {
        System.out.println("Item delivered to delivery counter");
    }
}
