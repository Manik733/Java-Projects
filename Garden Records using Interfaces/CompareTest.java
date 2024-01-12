/****    
 * Name: Manik Singh
 * Student Number: T00715263
 * Assignment Number: 3
 * Due Date: October 17, 2023
 * Program Description: CompareTest is the driver class . This class tests the compareTo method 
 *      using plant objects and show the values returned by compareTo. This class also creates 
 *      an array of plant objects and display it using toString in a loop. It also finds the 
 *      oldest and youngest plant objects using compareTo method and then display them.
 ****/

public class CompareTest {
    public static void main(String[] args) {

        // Create some Plant objects

        Plant p1 = new Plant("Rose", 7);
        Plant p2 = new Plant("Daffodil", 7);
        Plant p3 = new Plant("Sunflower", 12);

        //Printing plant objects

        System.out.println("Plant objects: \n");

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        
        System.out.println();

        //Using compareTo to show the results

        System.out.println("Comparing plant ages using compareTo method: ");
        System.out.println();
        
        System.out.println("Comparing p1 to p2: " + p1.compareTo(p2));
        System.out.println();
        System.out.println("Comparing p1 to p3: " + p1.compareTo(p3));
        System.out.println();
        System.out.println("Comparing p3 to p2: " + p3.compareTo(p2));
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
       plants[6] = new Plant("Carrot", 1); 
       plants[7] = new Plant("Spinach", 4);

        // Display the details of each Plant using a for loop 
        
        System.out.println("Plant array: \n");

        for (int i = 0; i < plants.length; i++) {
           System.out.println(plants[i].toString());
       }

       System.out.println();

       //Find the oldest and the youngest Plant object using for loop and compareTo

        Plant youngest = plants[0];
        Plant oldest = plants[0];

        for (int i = 1; i < plants.length; i++) {
            if (plants[i].compareTo(youngest) < 0) {
                youngest = plants[i];
            }
            if (plants[i].compareTo(oldest) > 0) {
                oldest = plants[i];
            }
        }

        //Printing the oldest and the youngest plant object
        
        System.out.println("Youngest Plant: " + youngest);
        System.out.println();
        System.out.println("Oldest Plant: " + oldest);
    }
}
