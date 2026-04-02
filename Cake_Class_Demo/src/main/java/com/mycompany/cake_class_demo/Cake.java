
package com.mycompany.cake_class_demo;

public class Cake {

    /*Access Specifiers: Public, Private, Protected
    Private: 
    - the variables / fields can only be accessed inside this class
    - this protects the data (encapsulation)
    Syntax: accessSpecifier  dataType fieldName;
    */
    
    private String flavour; //be the field to store the cake falvour
    private int layers; //stores the number of cake layers
    private boolean isFrosted; //stores whether a cake is frosted
    
    private static int totalCakes = 0; //Static variable, shared by ALL cake objects

    //this is the default constructor; it has no parameters
    public Cake() 
    {
        //this method body is empty
    }

    //This is a parameterized constructor becaues it takes inputs (parameters) to build the object
    public Cake(String flavour, int layers) {
        this.flavour = flavour; //assigning the parameter to the object field
        this.layers = layers;
        this.isFrosted = false; //default value for all cake objects
        
        totalCakes++; //increment symbol (++); increase the count every time a cake object is created. 
        
        /*this: 
        - Refers to the current object that is being created
        - Without 'this' keyword, Java would confuse the parameter & field
        */
}

    
    //Getters (Access Methods): Used to read private fields/variables. Get values
    public String getFlavour() {
        return flavour;
    }

    public int getLayers() {
        return layers;
    }

    public boolean isIsFrosted() {
        return isFrosted;
    }

    //Setters (Modifier Method): Used to update private fields/variables. Change value
    public void setFlavour(String flavour) {
        //this.parameter = objectVariable
        this.flavour = flavour;
    }

    public void setLayers(int layers) {
        this.layers = layers;
    }

    public void setIsFrosted(boolean isFrosted) {
        this.isFrosted = isFrosted;
    }
    
    //Static Method - A method that belongs to the CLASS & not the objects
    public static int getTotalCakes() {
        return totalCakes;
    }
    
    //Behaviour Methods - Stuff/Actions the object can do
    
    public void frost()
    {
        isFrosted = true;
        System.out.println("The cake is now frosted");
    }
    
    public void cut ()
    {
        layers--; //decrement symbol; decrease layers by 1
        System.out.println("We removed a layer of cake. It now has " + layers + " layers");
    }
    
    
    
    
    
    
}
