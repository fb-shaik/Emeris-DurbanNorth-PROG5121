
package com.mycompany.methods_parameters_dbn;


import javax.swing.JOptionPane;  //this statement will bring the GUI components to the app

public class Methods_Parameters_DBN {
//user defined methods
    //method that does addition of num1 & num2 & will return the result back to main for display
    //Method Signature: accessSpecifier static/non-static dataReturnType MethodName(parameterList)
    //num1 & num2 are parameters that the methods accepts when the method is called
    public static int addition(int num1, int num2) 
    {
    
        return num1 + num2; //the result of the data being sent out of the method
    }
    

    public static void main(String[] args) {
     //prompt the user for 2 numbers 
     String inputNum1 = JOptionPane.showInputDialog("Enter your first number: ");
     int num1 = Integer.parseInt(inputNum1); //convert the above user input to a numeeric variable
     
     
     String inputNum2 = JOptionPane.showInputDialog("Enter your second number: ");
     int num2 = Integer.parseInt(inputNum2); //convert the above user input to a numeeric variable
     
     //invoke or call the method that will accept the parameters & return the value from the method 
    int sum = addition(num1, num2); 
    
    //display the result of the method. 
     
    }
}

/*
    This app will show how a method with parameters works


*/