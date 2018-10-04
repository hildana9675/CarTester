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
public class CarTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Car car1 = new Car();
        Car car2 = new Car("Nissan","Nissan Rogue Sport","new","coupe",2018,22600);
        Car car3 = new Car("Toyota","Toyota Avalon Hybrid","old","Hybrid");
      
        //Print result
        //Print the details of each dog
        System.out.println(car1);
        System.out.println("--------------------------");
        
        System.out.println(car2.toString());
        System.out.println("--------------------------");
        
        System.out.println(car3.toString());
        System.out.println("--------------------------");
        
        //make car2 honk horn
        car2.honkTheHorn();
        
        
    }
    
}
