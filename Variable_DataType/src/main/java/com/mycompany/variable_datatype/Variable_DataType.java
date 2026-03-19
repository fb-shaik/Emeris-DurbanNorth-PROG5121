package com.mycompany.variable_datatype;

public class Variable_DataType 
{//opening brace for the class

    
    //this is a main method - runs the app for you 
    public static void main(String[] args) 
    {
        //sout TAB on your keyboard
        // " double qoutation holds the text to be displayed"
        System.out.println("===Not Using a Variable as Yet===");
        //Try to create 4 separate print lines for Name, Age, Email, Score
        System.out.println("Name: Fatima");
        System.out.println("Age: 100");
        System.out.println("Email: happy@gmail.com");
        System.out.println("Score: 98.50");
 
//Variable: storage container that is delcared in memory to hold info/data for the app
//Datatype - defines what can be stored in the container (String, Numeric)
//Syntax to declare a variable: dataType variableName = initialValue;
         String      name; //declared a variable without an initial value
         String firstName = "Alice";  //String & has to have the values in " "  
         String emailAddress = "happy123@gmail.com";
         String agePerson = "20"; 
         
    //Numeric datatypes: Integer(whole numbers) & Double(decimals)      
    //Syntax to declare a variable: dataType variableName = initialValue;
    int age = 25; //Numeric datatype does not need to have " " to hold its data
    double height = 185.5;
    float weight = 50.525645f;
    double taxRate = 0.15; //15%
    
     /*numeric dataTypes     
        int - will hold whole numbers
        double - decimal point 
        float - floating point (f)
        short & long 
       */ 
         
         
                                                    
        
        
    }

}//closing brace for the class

/*
method signature: accessSpecifier static/non-static  returnDataType methodName()
{
    block of code 
}
*/

