
package com.mycompany.coffeeshop_app;

import java.util.Scanner;

public class CoffeeShop_App {

    public static void main(String[] args) {
        
       
        Scanner userInput = new Scanner(System.in);

        // Capture customer information
        System.out.print("Enter your full name: ");
        String fullName = userInput.nextLine();

        System.out.print("Enter drink name: ");
        String drinkName = userInput.nextLine();

        System.out.print("Enter drink size (Small/Medium/Large): ");
        String drinkSize = userInput.nextLine();

        System.out.print("Enter price of one drink: ");
        double price = userInput.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity = userInput.nextInt();

        System.out.print("Is this order takeaway? (true/false): ");
        boolean isTakeaway = userInput.nextBoolean();

        // Display Order Summary
        System.out.println("\n------ ORDER SUMMARY ------");
        System.out.println("Customer Name: " + fullName);
        System.out.println("Drink: " + drinkSize + " " + drinkName);
        System.out.println("Price per Drink: R" + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Takeaway: " + isTakeaway);
        System.out.println("---------------------------");

        userInput.close();
    }
}