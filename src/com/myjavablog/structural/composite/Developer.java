/*
Developer is a leaf node so many methods are not applicable to this class
 */
package com.myjavablog.structural.composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Developer implements Employee {

    private String name;
    private double salary;

    public Developer(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public void add(Employee e) {
        //This is a leaf node so this method is not applicable to this class
    }

    @Override
    public void remove(Employee e) {
        //This is a leaf node so this method is not applicable to this class
    }

    @Override
    public Employee getChild(int i) {
        //This is a leaf node so this method is not applicable to this class
        return null;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getSalary() {
        return this.salary;
    }

    @Override
    public void print() {

        System.out.println("=======================================");
        System.out.println("Name = "+ this.getName());
        System.out.println("Salary = "+ this.getSalary());
        System.out.println("=======================================");

    }



}
