package com.myjavablog.structural.composite;

public class CompositeTest {


    public static void main(String[] args) {

        Employee e1 = new Developer("Jack", 87000);
        Employee e2 = new Developer("Steve", 97000);
        Employee manager1 = new Manager("Bill", 100000);

        manager1.add(e1);
        manager1.add(e2);

        Employee e3 = new Developer("Daniel", 50000);
        Manager gereralManager = new Manager("Mark", 80000);
        gereralManager.add(e3);
        gereralManager.add(manager1);
        gereralManager.print();

    }
}
