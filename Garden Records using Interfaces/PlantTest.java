/****    
 * Name: Manik Singh
 * Student Number: T00715263
 * Assignment Number: 1
 * Due Date: September 22, 2023
 * Program Description: PlantTest class acts as the acts as the driver class that tests all the methods in each of the classes.
 *     This class contains a default constructor as well as a parameterized constructor that inherits from the parent's constructor, 
 *     get (accessor methods) and set (mutator methods) for String attribute and also overrides the parent's toString method.
 ****/

public class PlantTest
{
    public static void main(String[] x)
    {

         // Create two Plant objects, one using the default constructor and one using the parameterized constructor
         Plant plant1 = new Plant();
         Plant plant2 = new Plant("Rose", 3);

         System.out.println();

         // Print initial plant values set by default and parameterized constructors using toString method
         System.out.println("Showing inital plant values set by default and parameterized constructors:\n");
         System.out.println(plant1);
         System.out.println(plant2.toString( ));
         System.out.println();
         
         // Test the setName, setAge, and set methods to update the plant attributes
         System.out.println("Testing setName, setAge and set methods:");
         plant1.setName("Daffodil");
         plant1.setAge(4);
         plant2.set("Lily", 6);
         
         // Print the new values updated by set methods
         System.out.println("New values for plant 1: " + plant1);
         System.out.println("New values for plant 2: " + plant2);
         System.out.println();

         // Test the getName and getAge methods to return plant attributes
         System.out.println("Testing getName, getAge methods:");
         System.out.println("Values for plant 1 from get methods: " + plant1.getName() + " and " + plant1.getAge());

         System.out.println();
         System.out.println();


         // Create two Fruit objects, one using the default constructor and one using the parameterized constructor
         Fruit fruit1 = new Fruit();
         Fruit fruit2 = new Fruit("Mango", 4, "Yellow");
          
         // Print initial fruit values set by default and parameterized constructors using toString method
         System.out.println("Showing inital fruit values set by default and parameterized constructors:\n");
         System.out.println(fruit1);
         System.out.println(fruit2.toString( ));
         System.out.println();
        
         // Test the setName, setAge, setColor and set methods to update the fruit attributes
         System.out.println("Testing setName, setAge and setColor methods:");
         fruit1.setName("Strawberry");
         fruit1.setAge(7);
         fruit1.setColor("Pink");
         fruit2.set("Apple", 6, "Red");
          
         // Print the new values updated by set methods
         System.out.println("New values for fruit 1: " + fruit1);
         System.out.println("New values for fruit 2: " + fruit2);
         System.out.println();
      
         // Test the getName, getAge and getColor methods to return fruit attributes
         System.out.println("Testing getName, getAge and getColor methods:");
         System.out.println("Values for fruit 1 from get methods: " + fruit1.getName() + ", " + fruit1.getAge() + " and " + fruit1.getColor());

         System.out.println();
         System.out.println();                                                                               


         // Create two Nut objects, one using the default constructor and one using the parameterized constructor
         Nut nut1 = new Nut();
         Nut nut2 = new Nut("Almond", 4, 46.2);
          
         // Print initial nut values set by default and parameterized constructors using toString method
         System.out.println("Showing inital Nut values set by default and parameterized constructors:\n");
         System.out.println(nut1);
         System.out.println(nut2.toString( ));
         System.out.println();
          
         // Test the setName, setAge, setFat and set methods to update the nut attributes
         System.out.println("Testing setName, setAge and setFat methods:");
         nut1.setName("Cashew");
         nut1.setAge(1);
         nut1.setFat(70.1);
         nut2.set("Hazelnut", 2, 55.3);
          
         // Print the new values updated by set methods
         System.out.println("New values for nut 1: " + nut1);
         System.out.println("New values for nut 2: " + nut2);
          
         // Test the getName, getAge and getFat methods to return nut attributes
         System.out.println();
         System.out.println("Testing getName, getAge and getFat methods:");
         System.out.println("Values for nut 1 from get methods: " + nut1.getName() + ", " + nut1.getAge() + " and " + nut1.getFat());                                                                            

    }
}
