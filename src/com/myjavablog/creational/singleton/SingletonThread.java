package com.myjavablog.creational.singleton;

import java.io.Serializable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingletonThread implements Serializable {

    //Lazy initialization
    private static SingletonThread instance = null;

/*    private static synchronized SingletonThread getInstance() {

        if(instance == null)
            instance = new SingletonThread();

        return instance;
    }*/

    private static SingletonThread getInstance() {

        if(instance == null) { // Check 1
            synchronized (SingletonThread.class) {
                if(instance == null) {// Check 2
                    instance = new SingletonThread();
                }
            }
        }
        return instance;
    }

    private SingletonThread() {

        System.out.println("Creating Object.......");
    }

    public static void print(String name, SingletonThread obj){
        System.out.println("Object Name :  "+ name +" Hashcode: "+ obj.hashCode());
    }

    static void useSingleton(){
    SingletonThread singletonThread = SingletonThread.getInstance();
    print("singletonThread", singletonThread);
    }

    public static void main(String[] args) {

        ExecutorService service = Executors.newFixedThreadPool(2);

        service.submit(SingletonThread::useSingleton);
        service.submit(SingletonThread::useSingleton);
        service.shutdown();
    }
}