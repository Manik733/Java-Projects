/****    
 * Name: Manik Singh
 * Student Number: T00715263
 * Assignment Number: 5
 * Due Date: November 16, 2023
 * Program Description: The EmptyPouchException class is a child class of the Exception class.
 * It throws an exception if you try to draw from empty pouch. 
****/

public class EmptyPouchException extends RuntimeException
{

    public EmptyPouchException()
    {
        super(" The pouch is empty ");
    }

     public EmptyPouchException(String message)
    {
        super(message);
    }
    
}
