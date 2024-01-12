/****    
 * Name: Manik Singh
 * Student Number: T00715263
 * Assignment Number: 1
 * Due Date: September 22, 2023
 * Program Description: Nut class is the child class that inherits from the plant class.
 *     This class contains a default constructor as well as a parameterized constructor that calls the parent's constructor, 
 *     get (accessor methods) and set (mutator methods) for String attribute and also overrides the parent's toString method.
 ****/

public class Nut extends Plant
{
    private double fat;
          
    public Nut()    //create default constructor
    {
        super();
        fat = 0.0;
    }
          
    public Nut(String name, int age, double newFat)     //create parameterized constructor that also calls the parent's constructor
    {
        super(name,age);
        fat = newFat;
    }
          
    public double getFat()     //create getFat method to return the fat percentage of the nut
    {
        return fat;
    }
          
    public void setFat(double newFat)    //create setFat method to set the fat of the nut
    {
        fat = newFat;
    }
          
    public void set(String newName, int newAge, double newFat)     /* create set method to set the name,
    age and fat of the nut */
    {
        super.set(newName, newAge);
        fat = newFat;
    }
         
    public String toString()    /* create toString method that overrides the parent's toString 
    method to return a string with all the nut attributes */
    {
        return super.toString() + " and Fat % = " + fat;
    }
}

