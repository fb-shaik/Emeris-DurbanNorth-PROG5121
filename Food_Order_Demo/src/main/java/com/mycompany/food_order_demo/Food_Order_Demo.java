package com.mycompany.food_order_demo;

//Allows for user input to be captured
import java.util.Scanner; //helps us bring the Scanner class to the app

public class Food_Order_Demo {

    public static void main(String[] args) {
        //create a scanner object to capture user input
        Scanner input = new Scanner(System.in);
        
        System.out.println("==== Food Ordering App ====");
        //prompt for user input 
        System.out.println("Enter food item name: ");
        String item = input.nextLine(); 
        
        System.out.println("Enter quantity: ");
        int qty = input.nextInt();
        
        System.out.println("Enter price per item: ");
        double price = input.nextDouble();
        
        //create object (FoodOrder that has been captured based on the user input above)
        //Syntax: ClassName objectName = new Constructor(parameters);
        FoodOrder order = new FoodOrder(item, qty, price);
        
        //Display the order details
        System.out.println("\n--- Order Summary ---");
        System.out.println("Item: " + order.getItemName());
        System.out.println("Quantity: " + order.getQuantity());
        System.out.println("Price per item: R" + order.getPrice());
        System.out.println("Total: R" + order.calculateTotal());
        
        //update using a setter method
        System.out.println("\nEnter a new quantity: ");
        int newQty = input.nextInt();
        
        order.setQuantity(newQty);
        System.out.println("Updated total: R" + order.calculateTotal());

        //use a behaviour method to decrease the qty
        order.decreaseQuantity(); //qty-- does the calculation for us
        
        //payment
        order.makePayment();
        System.out.println("Payment status: " + order.isIsPaid());
        
        //static method
        System.out.println("\nTotal orders created: " + FoodOrder.getTotalOrders());
    }
}
