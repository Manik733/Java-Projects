/****    
 * Name: Manik Singh
 * Student Number: T00715263
 * Assignment Number: 5
 * Due Date: November 16, 2023
 * Program Description: Program Description: This test file creates 3 pouches and tests 
 * add, isEmpty, drawItem and toString methods defined in the Pouch class. It creates variables to use
 * these methods and catches two exceptions, the EmptyPouchException and the FullPouchException from
 * the pouch class.
****/

public class PouchTest {
    
    public static void main(String[]args){

      //declaring variables

        String friend1 = "";
        String friend2 = "";
        int hours1 = 0;
        int hours2 = 0;

       //creating first pouch to test isEmpty, toString and drawItem methods

        Pouch<Integer> pouch1 = new Pouch<Integer>();

        System.out.println("Testing Pouch1 when pouch is empty. ");
        System.out.println();

        //testing isEmpty()

        System.out.println("Testing isEmpty method for empty pouch.");
        System.out.println(pouch1.isEmpty());

        if(pouch1.isEmpty())
        {
             System.out.println("The pouch has nothing in it. \n");
        }
        else
        {
             System.out.println("The pouch has something in it. \n");
        }

        System.out.println();

        //testing toString()

        System.out.println("Testing the toString method for empty pouch");
        System.out.println(pouch1.toString());
        System.out.println();

        //testing drawItem() method and catching EmptyPouchException thrown by it

        System.out.println("Testing the drawItem method for empty pouch."); 

        try  

        {
             System.out.println(pouch1.drawItem());
        }

        catch (EmptyPouchException epe) 

        {
             System.out.println(epe.getMessage());
        }

        System.out.println();

        //testing add() method and catching FullPouchException thrown by it

        System.out.println("Trying to add 11 integers in the pouch array");
      
    try

    {
        for(int i=1; i<=11; i++)
        {
            pouch1.add(i);
        }

    }
    
    catch(FullPouchException fpe)

    {
        System.out.println(fpe.getMessage());
    }

        System.out.println();

        System.out.println("Pouch contents after adding 10 items: " + pouch1);
        System.out.println();

        //create a for loop to attempt to draw 11 items out of the Pouch

        for(int i=1; i<=11; i++) 
          {
               try

               {
                    System.out.println("Item that randomly drawn is " + pouch1.drawItem());
               }

               catch (EmptyPouchException epe)

               {
                    System.out.println(epe.getMessage());
               }

               System.out.println("Remaining items in pouch - " + pouch1.toString());
               System.out.println();
          }    

          System.out.println("Pouch contents after attempting to draw 11 items: " + pouch1);

          System.out.println();

          //creating second pouch using my friend's names

          Pouch<String> pouch2 = new Pouch<String>();

          //using add method to fill the pouch

          pouch2.add("Samar");
          pouch2.add("Ravish");
          pouch2.add("Gourav");
          pouch2.add("Manvir");
          pouch2.add("Jatin");
          pouch2.add("Arnav");

          System.out.println("My friends are:" + pouch2.toString());
          System.out.println();

          //picking two friends using drawItem() method and catching EmptyPouchException thrown by it

          try

          {
          friend1 = pouch2.drawItem();
          friend2 = pouch2.drawItem();
          }

          catch(EmptyPouchException ece)

          {
            System.out.println(ece.getMessage());
          }
          
           //creating third pouch for hours me and my friends would be studying for the final
          
          Pouch<Integer> pouch3 = new Pouch<Integer>();

          for(int i=8; i<=15; i++)
          {
               pouch3.add(i);
          }

          //catching EmptyPouchException

          try

          {
            hours1 = pouch3.drawItem();
            hours2 = pouch3.drawItem();
          }

          catch(EmptyPouchException ece)
          
          {
            System.out.println(ece.getMessage());
          }

          System.out.println("I will be studying with my friend " + friend1 + " for " + hours1 + " hours.");
          System.out.println("I will be studying with my friend " + friend2 + " for " + hours2 + " hours.");

    }
}


