package com.myjavablog.behavioural.template;

public class TemplateMethodPatternTest {

    public static void main(String[] args) {

        PurchaseOrderTemplate offline = new StorePurchaseOrder();
        System.out.println("=======Shopping Offline========");
        offline.processOrder();
        PurchaseOrderTemplate online = new OnlinePurchaseOrder();
        System.out.println("\n=======Shopping Online========");
        online.processOrder();
    }
}
