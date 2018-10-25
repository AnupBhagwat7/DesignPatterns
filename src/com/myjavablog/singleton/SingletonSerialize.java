package com.myjavablog.singleton;

import java.io.*;

public class SingletonSerialize implements Serializable {

    private static SingletonSerialize instance = new SingletonSerialize();

    private static SingletonSerialize getInstance() {

        return instance;
    }

    private SingletonSerialize() {

        System.out.println("Creating Object.......");
    }

    public static void print(String name, SingletonSerialize obj){
        System.out.println("Object Name :  "+ name +" Hashcode: "+ obj.hashCode());
    }

    private Object readResolve(){

        System.out.println("Applying read Resolve .......");
        return instance;
    }

    public static void main(String[] args) throws Exception {

        SingletonSerialize sr1 = SingletonSerialize.getInstance();
        SingletonSerialize sr2 = SingletonSerialize.getInstance();

        print("S1", sr1);
        print("S2", sr2);

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\anupb\\IdeaProjects\\DesignPatterns\\tmp\\s2.ser"));
        oos.writeObject(sr2);

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\anupb\\IdeaProjects\\DesignPatterns\\tmp\\s2.ser"));
        SingletonSerialize sr3 = (SingletonSerialize) ois.readObject();

        print("S3", sr3);


    }
}