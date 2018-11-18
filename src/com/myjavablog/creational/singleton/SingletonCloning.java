package com.myjavablog.creational.singleton;

public class SingletonCloning implements Cloneable{

    private static SingletonCloning instance = new SingletonCloning();

    private static SingletonCloning getInstance() {

        return instance;
    }

    private SingletonCloning() {

        System.out.println("Creating Object.......");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        if(instance!= null)
            throw new CloneNotSupportedException("Cant clone singleton objects");

        return super.clone();
    }

    public static void print(String name, SingletonCloning obj){
        System.out.println("Object Name :  "+ name +" Hashcode: "+ obj.hashCode());
    }

    public static void main(String[] args) throws Exception {

        SingletonCloning sr1 = SingletonCloning.getInstance();
        SingletonCloning sr2 = SingletonCloning.getInstance();

        print("S1", sr1);
        print("S2", sr2);

        SingletonCloning sr3 = (SingletonCloning) sr2.clone();

        print("S3", sr3);


    }
}