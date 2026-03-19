
package com.mycompany.methods_demo_dbn;


public class Methods_Demo_DBN {

    //place methods here
    public static void userDetails()
    {
        System.out.println("My name is Alice");
        System.out.println("Welcome to PROG5121");
        System.out.println("Its is Tuesday");
        System.out.println("\n===================\n");
    }
    
    public static void main(String[] args) 
    {
        //we will not place a method block here
        //we can only call a method / invoke a method within the main-method {}
        //we call a method by its name: methodName();
        displayAddress(); //the method instructions are now visible to the main method
        userDetails();  
        displayAddress(); //the method instructions are now visible to the main method
        userDetails();
        displayAddress(); //the method instructions are now visible to the main method
        userDetails();
        displayAddress(); //the method instructions are now visible to the main method
        userDetails();
    }
    
    //place methods here
    
    //1. method signature
    public static void displayAddress()
    {//2. method body - Hold all the code/instructions that the method will be able to complete
        System.out.println("ABC TECH-WORLD");
        System.out.println("123 Happy Place");
        System.out.println("Lego World");
        System.out.println("\n**************************\n");
        //3. return keyword; for this app there will not be any return value as we are using void in the method header 
    }
    
}


/*
Methods - A block of code designed to complete a set of instructions

A methods has 3 parts:
    1. Method Header / Signature
    2. Method Body
    3. Method Return


1. Method Header / Signature
    access                  version                     returnType           MethodName(dataType parameterName)
    public/private      static/non-static     void/Datatype     nameOfMethod( stuff the method is accepting to use)

2.Method Body
    {
        code live in here / task that method is going to complete
    }

3. Method Return
    you will find this in the method signature

There are two types of methods - User Created & Built-in 
Built -in methods come from the import statements (java.util; javax.swing, java.lang)
User defined: Developers create these
    

*/