package com.myjavablog.behavioural.visitor;

public class VisitorPatternTest {

    public static void main(String[] args) {

        ShoppingCartElement[] items = new ShoppingCartElement[]{new Book(100, "You can win"),
        new Fruit(100, 2, "Apple" ), new Book(200, "Five Point Someone"),
        new Fruit(40, 4, "Gauva")};

        System.out.println("Total cost:  "+ VisitorPatternTest.calculatePrice(items));
    }

    public static int calculatePrice(ShoppingCartElement[] items){

        ShoppingCartVisitor visitor = new ShoppingCartVisitorImpl();
        int sum = 0;

        for(ShoppingCartElement element : items){
            sum = sum + element.accept(visitor);
        }

        return sum;
    }
}
