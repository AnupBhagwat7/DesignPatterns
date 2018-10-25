package com.myjavablog.builder;

public class TestBuilderPattern {

    public static void main(String[] args) {

        //Create object using builder pattern
        Cake chocolateCake = new Cake.CakeBuilder().sugar(1.5).butters(2).milk(6).cherry(3).build();

        //Your choice of Cake is ready
        System.out.println(chocolateCake);


    }
}
