package com.mycompany.store_checkout_app; //don't remove/edit/change; doing that will break your app!!!
import javax.swing.JOptionPane;

//Line7 - Represents the Start of the Class called: Store_CheckOut_App
//don't remove/edit/change; doing that will break your app!!!
//The class will have a set of {} (//don't remove/edit/change; doing that will break your app!!!)
public class Store_CheckOut_App {

    //Line12: Represents the main method of the project; this is auto-generated for the project
    //don't remove/edit/change; doing that will break your app!!!
    //Main method has a set of {} (don't remove/edit/change; doing that will break your app!!!)
    public static void main(String[] args) {
        //Constant Syntax: final dataType CONSTANT_NAME = FIXED_VALUE;
        final double TAX_RATE = 0.15; 
        final double DISCOUNT_RATE = 0.10;
        final double SHIPPING_FEE = 5.99; 

//input statements
String priceString = JOptionPane.showInputDialog("Enter the item price: ");
String qtyString = JOptionPane.showInputDialog("Enter the quantity: ");

//Lets Parse the above numeric values to is correct data-type variable
double price = Double.parseDouble(priceString);
int qty = Integer.parseInt(qtyString); 

/*Calculations:
subtotal = price * qty
discount = subtotal * DISCOUNT_RATE
afterDiscount = subtotal - discount
withShipping = afterDiscount + SHIPPING_FEE
tax = withShipping * TAX_RATE
finalTotal = withShipping + tax
costPerItem = finalTotal / qty
reminder = qty % 2
*/
double subtotal = price * qty;
double discount = subtotal * DISCOUNT_RATE;
double afterDiscount = subtotal - discount;
double withShipping = afterDiscount + SHIPPING_FEE;
double tax = withShipping * TAX_RATE;
double finalTotal = withShipping + tax;
double costPerItem = finalTotal / qty;
int remainder = qty % 2;
    
//Output Statements - Generate a Receipt with all of the above
JOptionPane.showMessageDialog(null, "====Receipt====\n\n" +
                                                                  "Price: R" + price + "\n" +        
                                                                  "Quantity: " + qty + "\n\n" +
                                                                  "Subtotal: R" + subtotal + "\n" +
                                                                  "Discount: - R" + discount + "\n" +
                                                                  "Shipping: + R" +  SHIPPING_FEE + "\n" +
                                                                  "With Shipping: R" + withShipping + "\n" +
                                                                  "Tax: + R" + tax + "\n\n" +
                                                                  "Final Total: R" + finalTotal + "\n" +
                                                                  "Cost per item: R " + costPerItem + "\n\n" +
                                                                  "Remainder when divided by 2: " + remainder + "\n(0 = Even, 1 =Odd\n\n)" +
                                                                   "================================="
        
                                                            );
    }
}
