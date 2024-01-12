/****    
 * Name: Manik Singh
 * Student Number: T00715263
 * Assignment Number: 6
 * Due Date: November 30, 2023
 * Program Description: The EmptyCollectionException class is a child class of the Exception class.
 * It throws an exception if you try to draw from empty pouch. 
****/
public class EmptyCollectionException extends RuntimeException
{

    public EmptyCollectionException()
    {
        super(" The collection is empty ");
    }

     public EmptyCollectionException(String message)
    {
        super(message);
    }
    
}
