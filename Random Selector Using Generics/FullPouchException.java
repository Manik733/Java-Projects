/****    
 * Name: Manik Singh
 * Student Number: T00715263
 * Assignment Number: 5
 * Due Date: November 16, 2023
 * Program Description: The FullPouchException class is a child class of the Exception class.
 * It throws an exception if you try to add to the full pouch. 
****/

public class FullPouchException extends RuntimeException
{

    public FullPouchException()
    {
        super(" The pouch is full ");
    }

     public FullPouchException(String message)
    {
        super(message);
    }
    
}
