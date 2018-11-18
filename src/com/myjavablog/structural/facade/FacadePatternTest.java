package com.myjavablog.structural.facade;

import java.util.Scanner;

//Client class
public class FacadePatternTest {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int x = sc.nextInt();

        Facade facade = new Facade();
        System.out.println("Cube is "+facade.cubeX(x));
        System.out.println("Double of cube is "+facade.cubeXTimes2(x));
        System.out.println("Multiplication of both is "+facade.multiplyBoth(x));

    }
}
