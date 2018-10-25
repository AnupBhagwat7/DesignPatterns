package com.myjavablog.singleton;

import java.lang.reflect.Constructor;

public class SingletonReflection {

    private static SingletonReflection instance = new SingletonReflection();

    private static SingletonReflection getInstance() {

        return instance;
    }

    private SingletonReflection(){

        if(instance!= null)
            throw new RuntimeException("Can't create an object . Use getIntance method to create the objects ");

        System.out.println("Creating Object.......");
    }

    public static void print(String name, SingletonReflection obj){
        System.out.println("Object Name :  "+ name +" Hashcode: "+ obj.hashCode());
    }

    public static void main(String[] args) throws Exception {

        SingletonReflection sr1 = SingletonReflection.getInstance();
        SingletonReflection sr2 = SingletonReflection.getInstance();

        print("S1", sr1);
        print("S2", sr2);

        Class clazz = Class.forName("com.myjavablog.singleton.SingletonReflection");
        Constructor<SingletonReflection> constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible(true);
        SingletonReflection sr3 = constructor.newInstance();

        print("S3", sr3);


    }
}