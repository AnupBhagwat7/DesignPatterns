/*
Manager is composite class.
Key point here is all common methods delegates its operations to child objects
It has methods to access and modify its children.
 */
package com.myjavablog.structural.composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Manager implements Employee {

    private String name;
    private double salary;

    List<Employee> employeeList = new ArrayList<>();

    public Manager(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public void add(Employee e) {
        employeeList.add(e);
    }

    @Override
    public void remove(Employee e) {
        employeeList.remove(e);
    }

    @Override
    public Employee getChild(int i) {
        return employeeList.get(i);
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

        Iterator<Employee> employeeIterator = employeeList.iterator();
        while(employeeIterator.hasNext()){
            Employee emp = employeeIterator.next();
            emp.print();
        }

    }



}
