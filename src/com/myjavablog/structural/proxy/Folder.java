package com.myjavablog.structural.proxy;

public class Folder implements IFolder {


    @Override
    public void performOperations() {
        //Access folder and perform various operations like copy or cut
        System.out.println("Performing operation on folder");
    }
}
