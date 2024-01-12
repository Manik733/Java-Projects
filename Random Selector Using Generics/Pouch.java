/****    
 * Name: Manik Singh
 * Student Number: T00715263
 * Assignment Number: 5
 * Due Date: November 16, 2023
 * Program Description: This file creates a generic type Pouch class which implements the PouchADT interface
 * and defines 4 abstract methods in that interface 
****/

import java.util.*;

public class Pouch<T> implements PouchADT<T>
{
     //default capacity of our array

    private final static int DEFAULT_CAPACITY = 10;

    //declaring variables

    private int count; 
    private T[] pouch;

     // Creates an empty stack using the default capacity.

     public Pouch() 
     {
        count = 0;
        pouch = (T[])(new Object[DEFAULT_CAPACITY]);
     }

      // add method to add an element to the top of pouch

  public void add(T element) throws FullPouchException
  {
   if (count == pouch.length) {
      throw new FullPouchException("Pouch is full. Cannot add more items.");
   }

   else 
   {
      pouch[count] = element;
      count++;
   }
  }
 
  // check if the pouch is empty

  public boolean isEmpty()
     {
          if (count == 0)
          {
               return true;
          }
          
          else
          {
               return false;
          }    
     }

     // draw a random item from the pouch and put the element at the top of pouch in that index

  public T drawItem() throws EmptyPouchException
   {
      Random rand = new Random();

      if (isEmpty())
      {
           throw new EmptyPouchException("Pouch is empty. Cannot draw an item.");
      }

      else
      {
         int rIndex = rand.nextInt(count);
         T rSelect = (T)pouch[rIndex];
         pouch[rIndex] = pouch[count-1];
         count--;
         pouch[count] = null;
         return rSelect;
      }
   }

   //toString() method returns string which contains data of the pouch

   public String toString()
   {
        if (count == 0)
        {
             return "The Pouch contains no items.";
        }
        else
        {
             String output = "";
             for(int i=0; i<=count-1; i++)
             {
                  output = output + " " + pouch[i];
             }
             return output;
        }
        
   }
}
   
  
    



