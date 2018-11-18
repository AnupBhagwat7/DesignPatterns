package com.myjavablog.structural.composite;

/*
First we will create component interface.
It reresents objects in composition.
It has all common operations applicable to both Manager and Developer.
 */

/*
Employee - Component
Developer - Leaf
Manager - Composite
 */

public interface Employee {

    public void add(Employee e);
    public void remove(Employee e);
    public Employee getChild(int i);
    public String getName();
    public double getSalary();
    public void print();
}
