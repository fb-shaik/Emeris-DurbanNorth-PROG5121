package com.mycompany.paymentsystem;

public class PaymentSystem {
    //Method 1 - Calculate the price for ONE item
    public static double calculatePrice(double price)
    {//Simply return the price
        return price;
    }
    
    //Method 2 - Calculate price for Multiple items (2 parameters)
    public static double calculatePrice(double price, int quantity)
    {//Calculate: price * qty
            double cost;
            cost = price * quantity; 
            return cost;
    }
    
    //Method 3 - Calculate price with discount (3 parameters)
    public static double calculatePrice(double price, int quantity, double discount)
    {  double total = price * quantity; //calculate the total before discount
        double discountAmount = total * discount;// calculate the discount amount
        double finalTotal = total - discountAmount; //subtract the discount from the total  
        
       return finalTotal;  
    }

    public static void main(String[] args) {
        //Case 1 - Buying 1 item
        double result1 = calculatePrice(100.00); //method call
        System.out.println("Single item price: " + result1);
        
        //Case 2 - Buying multiple items
        double result2 = calculatePrice(50.0, 3); //method call with 2 arguments
        System.out.println("Multiple items price: " + result2);
    
        //Case 3 - Buying with a discount
        double result3 = calculatePrice(150.00, 4, 0.25);
        System.out.println("Final Total with discount: " + result3);
        
    }
}
