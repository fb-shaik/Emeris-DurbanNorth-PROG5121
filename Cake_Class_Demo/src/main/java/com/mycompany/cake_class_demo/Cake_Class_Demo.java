
package com.mycompany.cake_class_demo;

public class Cake_Class_Demo {

    public static void main(String[] args) {
 
   //Syntax: ClassName objectName = new Constructor(parameters);

   //Using the parameterised constructor to build my objects
   Cake myCake = new Cake("Chocolate", 3); //we shared data for flavour & layer
   Cake yourCake = new Cake ("Vanilla", 7);
   Cake ourCake = new Cake ("Caramel", 4);
   Cake someCake = new Cake ("Rainbow Sprinkles", 12);
   
   //lets find out how many cake objects has been created:
   //Static method call: We invoke the static method by the Class Name & not object name
        System.out.println("Total number of cakes created: " + Cake.getTotalCakes());
      
   //Using Getters (Read the values in the objects)
        System.out.println("My cake flavour: " + myCake.getFlavour());
        System.out.println("My cake has " + myCake.getLayers() + " layers.");
        System.out.println("Your cake flavour: " + yourCake.getFlavour());
        System.out.println("Your cake has " + yourCake.getLayers() + " layers.");
        System.out.println("Our cake flavour: " + ourCake.getFlavour());
        System.out.println("Our cake has " + ourCake.getLayers() + " layers.");
        System.out.println("Some cake flavour: " + someCake.getFlavour());
        System.out.println("Some cake has " + someCake.getLayers() + " layers.");
        
        //Using Setter (Modify/Change values of a field)
        myCake.setFlavour("Strawberry"); //myCake object is called & the field for flavour is changed
        myCake.setLayers(5);
        System.out.println("My updated cake flavour is: " + myCake.getFlavour());
        System.out.println("My cake now has " + myCake.getLayers() + " layers.");
        
        
        
        
       
       
    }


}
