package com.mycompany.food_order_demo;


public class FoodOrder {
    
    //private fields (encapsulation)
    //Syntax: accessSpecifier dataType fieldName;
    private String itemName;
    private int quantity;
    private double price;
    private boolean isPaid;
    
    private static int totalOrders = 0; //belongs to the FoodOrder Class
    
    //parameterised constructor (itemName, quantity, price)
    public FoodOrder(String itemName, int quantity, double price) {
        this.itemName = itemName; //'this' refers to the current object being created/used
        this.quantity = quantity;
        this.price = price;
        
        this.isPaid = false; //default value assigned to every FoodOrder object
        totalOrders++; //increment (add one more) everytime a FoodOrder object is created
        //totalOrders = totalOrders + 1; 
    }

    public String getItemName() {
        return itemName;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public boolean isIsPaid() {
        return isPaid;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setIsPaid(boolean isPaid) {
        this.isPaid = isPaid;
    }

//Static method
    public static int getTotalOrders() {
        return totalOrders;
    }
    
//Behaviour Methods
    //Method 1 - Calculate Total (qty * price)
    public double calculateTotal()
    {
        return quantity * price; 
    }
        
    //Method 2 - Check if payment is made
    public void makePayment()
    {
        isPaid = true;
        System.out.println("Payment successful!");
    }
    
    //Method 3 - Reduce the number of FoodOrders
    public void decreaseQuantity()
    {
        quantity--; //decrement by 1
        System.out.println("Qty has been reduced by 1. New qty: " + quantity);
    }
    
    
}
