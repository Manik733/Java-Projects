/****    
 * Name: Manik Singh
 * Student Number: T00715263
 * Assignment Number: 1
 * Due Date: September 22, 2023
 * Program Description: Fruit class is the child class that inherits from the plant class.
 *     This class contains a default constructor as well as a parameterized constructor that calls the parent's constructor, 
 *     get (accessor methods) and set (mutator methods) for String attribute and also overrides the parent's toString method.
 ****/

public class Fruit extends Plant
{
    private String color;
        
    public Fruit()     //create default constructor
    {
        super();
        color = "Not defined";
    }
        
    public Fruit(String name, int age, String newColor)     //create parameterized constructor that also calls the parent's constructor
    {
        super(name,age);
        color = newColor;
    }
        
    public String getColor()       //create getColor method to return the color of the fruit
    {
         return color;
    }
        
    public void setColor(String newColor)      //create setColor method to set the color of the fruit
    {
         color = newColor;
    }

    public void set(String newName, int newAge, String newColor)     /* create set method to set the name,
    age and color of the fruit */
    {
        super.set(newName, newAge);
        color = newColor;
    }

    public String toString()     /* create toString method that overrides the parent's toString 
    method to return a string with all the fruit attributes */
    {
        return super.toString() + " and Color = " + color;
    }
}