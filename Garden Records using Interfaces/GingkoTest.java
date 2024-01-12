/****    
 * Name: Manik Singh
 * Student Number: T00715263
 * Assignment Number: 2
 * Due Date: October 3, 2023
 * Program Description: GingkoTest class is the driver class. 
 *     For the child class Gingko, it tests the default 
 *     constructor as well as a parameterized constructor, get (accessor methods) and set (mutator methods) for 
 *     String attribute and also overrides the parent's toString method. It also tests the equal methods 
 *     for both Plant and child objects. This class also creates an array of plant objects and display it using 
 *     polymorphism, help us change the fat percentage of child nut object and display the oldest plant object in the array.
 ****/


public class GingkoTest {

    public static void main(String[] x)
    {

         // Create two Gingko objects, one using the default constructor and one using the parameterized constructor
         Gingko gingko1 = new Gingko();
         Gingko gingko2 = new Gingko("Fairmount", 5, 20);

         System.out.println();
      
         // Print initial Gingko values set by default and parameterized constructors using toString method
         System.out.println("Showing inital Gingko values set by default and parameterized constructors:\n");
         System.out.println(gingko1);
         System.out.println(gingko2.toString( ));
         System.out.println();
      
         // Test the setName, setAge, setHeight and set methods to update the Gingko attributes
         System.out.println("Testing setName, setAge and setHeight methods:");
         gingko1.setName("Autumn Gold");
         gingko1.setAge(3);
         gingko1.setHeight(30);
         gingko2.set("Princeton Sentry", 4, 45);
       
         // Print the new values updated by set methods
         System.out.println("New values for gingko 1: " + gingko1);
         System.out.println("New values for gingko 2: " + gingko2);
         System.out.println();
      
         // Test the getName, getAge and getHeight methods to return Gingko attributes
         System.out.println("Testing getName, getAge and getHeight methods:");
         System.out.println("Values for Gingko 1 from get methods: " + gingko1.getName() + ", " + gingko1.getAge() + " and " + gingko1.getHeight());
 
         System.out.println();
         System.out.println();


         //equals method to test parent Plant objects 
         System.out.println("Testing Plant equals:\n");

         // Create some Plant objects
         Plant plant1 = new Plant("Rose", 5);
         Plant plant2 = new Plant("Lily", 3);
         Plant plant3 = new Plant("Rose", 5); 
 
         // Test the equals method 
         System.out.println("Comparing plant1 and plant2: " + plant1.equals(plant2)); 
         System.out.println();
         System.out.println("Comparing plant1 and plant3: " + plant1.equals(plant3)); 

         System.out.println();
         System.out.println();

         //equals method to test child objects 
         System.out.println("Testing Gingko equals:\n");

         // Create a new Gingko object
         Gingko gingko3 = new Gingko("Princeton Sentry", 4, 45);
 
         // Test the equals method
         System.out.println("Comparing gingko1 and gingko2: " + gingko1.equals(gingko2)); 
         System.out.println();
         System.out.println("Comparing gingko2 and gingko3: " + gingko2.equals(gingko3)); 

         System.out.println();
         System.out.println();

         // Create an array of Plant objects
         Plant[] plants = new Plant[8];

         // Initialize the array with objects of different types
        plants[0] = new Fruit("Apple", 3, "Red");
        plants[1] = new Fruit("Orange", 5, "Orange");
        plants[2] = new Nut("Almond", 2, 40.2);
        plants[3] = new Nut("Peanut", 6, 39.8);
        plants[4] = new Gingko("Gingko Biloba", 4, 47);
        plants[5] = new Gingko("Gingko Tree", 5, 38);
        plants[6] = new Plant("Carrot", 1); // Assuming you have a Flower class
        plants[7] = new Plant("Spinach", 0);


         // Display the details of each Plant using a for loop 
         System.out.println("Plant array: \n");

         for (int i = 0; i < plants.length; i++) {
            System.out.println(plants[i].toString());
        }

        System.out.println();
        
        // Change the fatPercent for one of the Nut objects
        ((Nut) plants[2]).setFat(10.2); 

        // Printing the changed fat percentage
        System.out.println("Changed fat percentage: " + plants[2].toString());


        System.out.println();

        //Find the oldest Plant object using for loop and if statement
         Plant oldestPlant = plants[0];
         for (int i = 1; i < plants.length; i++) {
             if (plants[i].getAge() > oldestPlant.getAge()) {
                 oldestPlant = plants[i];
              }
           }

           //Printing the oldest plant object
          System.out.println("Oldest Plant is: " + oldestPlant);

          
        }

    }

