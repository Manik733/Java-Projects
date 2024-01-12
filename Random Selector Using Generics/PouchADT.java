/****    
 * Name: Manik Singh
 * Student Number: T00715263
 * Assignment Number: 5
 * Due Date: November 16, 2023
 * Program Description: This file has the generic type PouchADT interface. 
 * It contains 4 abstract methods add(), isEmpty(), drawItem() and toString()
****/

public interface PouchADT<T>
{
   
     //Adds the specified element to the top of this stack. 
   
    public void add(T element) throws FullPouchException;
 
     // Returns true if this stack contains no elements. 
     
    public boolean isEmpty();

     // Removes and returns the top element from this stack. 
    
    public T drawItem() throws EmptyPouchException;

     // Returns a string representation of this stack. 
   
    public String toString();
}


