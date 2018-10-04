/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cartester;

/**
 *
 * @author himel9675
 */
public class Car {
    
   //variables for characteristics
   private String make, model,state,type;
   private double price;
   private int year;

   //default constructor 
   public Car() {
   make = "Jeep"; 
   model = "Jeep Wrangler JK Rubicon";
   state = "new";
   type = "convertible";
   year = 2018;
   price = 27045;
}
   //Constructor 2
   public Car(String makeC, String modelC, String stateC,
           String typeC,int yearC, double priceC) {
       
       make = makeC;
       model = modelC;
       state = stateC;
       type = typeC;
       year = yearC;
       price = priceC;
   }
   
   //Constructor 3
   public Car (String makeC, String modelC,String stateC,String typeC){
      make = makeC;
      model = modelC; 
      state = stateC;
      type = typeC;
      year = (int) (Math.random() * 19) + 2000 ;
      price = (int)(Math.random() * ((33464 - 22400) + 1));
      
   }
   
   public void honkTheHorn()
   {
       System.out.println("HONK!");
   }
   
   public String toString()
   {
      String output = "Make: " + make + "\n";
      output += "Model: " + model + "\n";
      output += "State: " + state + "\n";
      output += "type: " + type + "\n";
      output += "Year: " + year + "\n";
      output += "Price: $" + price + "\n";
      
      return output;
       
   }
   
   
   
    
    
    
    
    
}
