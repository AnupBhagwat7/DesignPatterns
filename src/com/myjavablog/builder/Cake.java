package com.myjavablog.builder;

public class Cake {

    private final double sugar;   //measured by cup
    private final double butters;   //measured by cup
    private final double milk;   //measured by cup
    private final int cherry;

    //Private constructor to enforce object constructor through builder
    private Cake(CakeBuilder builder) {
        this.sugar = builder.sugar;
        this.butters = builder.butters;
        this.milk = builder.milk;
        this.cherry = builder.cherry;
    }

    public static class CakeBuilder
    {
        private double sugar;   //measured by cup
        private double butters;   //measured by cup
        private double milk;   //measured by cup
        private int cherry;


        //Setting object properties
            public CakeBuilder sugar ( double cup){
                this.sugar = cup;
                return this;
            }
            public CakeBuilder butters ( double cup){
                this.butters = cup;
                return this;
            }
            public CakeBuilder milk ( double cup){
                this.milk = cup;
                return this;
            }
            public CakeBuilder cherry ( int number){
                this.cherry = number;
                return this;
            }


            //Return the object created
            public Cake build()  {
                return new Cake(this);
            }
        }

    @Override
    public String toString() {
        return "Cake{" +
                "sugar=" + sugar +
                ", butters=" + butters +
                ", milk=" + milk +
                ", cherry=" + cherry +
                '}';
    }
}
