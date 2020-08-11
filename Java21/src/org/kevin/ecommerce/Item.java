package org.kevin.ecommerce;

public class Item implements Comparable{
    private String id;
    private String name;
    private double retail;
    private int quantity;
    private double price;
    private boolean noDiscount;     //Exercise 1
    
    Item(String idIn, String nameIn, String retailIn, String quanIn){
        id = idIn;
        name = nameIn;
        retail = Double.parseDouble(retailIn);
        quantity = Integer.parseInt(quanIn);
        noDiscount = true;
        if(quantity > 400)
            price = retail * .7D;
        price = Math.floor( price * 100 + .5)/100;
    }
    
    Item(String idIn, String nameIn, String retailIn, String quanIn, double discount){
        id = idIn;
        name = nameIn;
        retail = Double.parseDouble(retailIn);
        quantity = Integer.parseInt(quanIn);
        noDiscount = (discount == 0);
        if(quantity > 400)
            price = retail * .7D;
        if(noDiscount){
            price = Math.floor( price * 100 + .5)/100;
        }else{
            price = (Math.floor( price * 100 + .5)/100) - discount;
        }
    }
    
    @Override
    public int compareTo(Object o) {
        Item temp = (Item)o;
        if(this.price < temp.price)
            return 1;
        else if (this.price > temp.price)
            return -1;
        return 0;
    }
    
    public String getId(){
        return id;
    }
    
    public String getName(){
        return name;
    }
    
    public double getRetail(){
        return retail;
    }
    
    public int getQuantity(){
        return quantity;
    }
    
    public double getPrice(){
            return price;
    }
}