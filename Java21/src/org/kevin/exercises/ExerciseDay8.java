package org.kevin.exercises;

import java.util.ArrayList;
import java.util.List;

class ExerciseDay8{
    
    public static void main(String[] args){
        List<Fruit> shoppingCart = new ArrayList<>();
        shoppingCart.add(new Fruit("Apple", 4, 5.0F));
        shoppingCart.add(new Fruit("Orange", 5, 4.0F));
        shoppingCart.add(new Fruit("Watermelon", 1, 12.0F));
        
        float total = 0.00F;
        System.out.println("Shopping cart:");
        for(Fruit fruit: shoppingCart){
            System.out.println("-Fruit: " + fruit.name);
            System.out.println("     Quantity: " + fruit.quantity);
            System.out.println("     Price: $" + fruit.price);
            total+=fruit.price*fruit.quantity;
        }
        
        System.out.println("Total: $" + total);
    }
}

class Fruit{
    String name;
    int quantity;
    float price;
    
    public Fruit(String name, int quantity, float price){
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }
}