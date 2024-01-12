/****    
 * Name: Manik Singh
 * Student Number: T00715263
 * Assignment Number: 2
 * Due Date: October 3, 2023
 * Program Description: Gingko class is a child class that inherits from the plant class.
 *     This class contains a default constructor as well as a parameterized constructor that calls from the parent's constructor, 
 *     get (accessor methods) and set (mutator methods) for String attribute and also overrides the parent's toString method.
 ****/

public class Gingko extends Plant
{
    private int height;
          
    public Gingko()    //create default constructor
    {
        super();
        height = 0;
    }
          
    public Gingko(String name, int age, int newHeight)     //create parameterized constructor that also calls the parent's constructor
    {
        super(name,age);
        height = newHeight;
    }
          
    public double getHeight() {    //create getHeight method to return the height of the Gingko tree
        return height;
    }
          
    public void setHeight(int newHeight)    //create setHeight method to set the height of the Gingko tree
    {
        height = newHeight;
    }
          
    public void set(String newName, int newAge, int newHeight)     /* create set method to set the name,
    age and height of the Gingko tree */
    {
        super.set(newName, newAge);
        height = newHeight;
    }
         
    public String toString()    /* create toString method that overrides the parent's toString 
    method to return a string with all the Gingko tree attributes */
    {
        return super.toString() + " and Height = " + height +"m";
    }

}



