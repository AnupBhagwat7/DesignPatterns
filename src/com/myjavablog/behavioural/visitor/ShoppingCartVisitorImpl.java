package com.myjavablog.behavioural.visitor;

public class ShoppingCartVisitorImpl implements ShoppingCartVisitor {
    @Override
    public int visit(Book book) {
        int cost = 0;
        //Apply discount if book price is greator than 50
        if(book.getPrice() > 50){
            cost = book.getPrice() - 5;
        }else{
            cost = book.getPrice();
        }
        System.out.println("Book IBSN Number: "+ book.getIsbnNumber() +" Cost : "+ cost  );
        return cost;
    }

    @Override
    public int visit(Fruit fruit) {
        int cost =0;

        cost = fruit.getPricePerKg() * fruit.getWeight();
        System.out.println("Fruit Name: "+ fruit.getName() +" Cost: "+ cost);
        return cost;
    }
}
