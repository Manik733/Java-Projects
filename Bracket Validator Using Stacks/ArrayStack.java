
/****
 * Name: Manik Singh
 * Student Number: T00715263
 * Assignment Number: 6
 * Due Date: November 30, 2023
 * Program Description: The ArrayStack class implements the StackADT
 * interface and defines the methods used.
 ****/

import java.util.Arrays;

public class ArrayStack<T> implements StackADT<T> {

    // default capacity of our array

    private final static int DEFAULT_CAPACITY = 100;

    // declaring variables

    private int top;
    private T[] stack;

    // Creates an empty stack using the default capacity.

    public ArrayStack() {
        this(DEFAULT_CAPACITY);
    }

    // Creates an empty stack using the specified capacity.

    public ArrayStack(int initialCapacity) {
        top = 0;
        stack = (T[]) (new Object[initialCapacity]);
    }

    /*
     * Adds the specified element to the top of this stack, expanding
     * the capacity of the array if necessary.
     */

    public void push(T element) {
        if (size() == stack.length)
            expandCapacity();
        stack[top] = element;
        top++;
    }

    /**
     * Creates a new array to store the contents of this stack with
     * twice the capacity of the old one.
     */
    private void expandCapacity() {
        stack = Arrays.copyOf(stack, stack.length * 2);
    }

    /**
     * Removes the element at the top of this stack and returns a
     * reference to it.
     */

    public T pop() throws EmptyCollectionException {
        if (isEmpty())
            throw new EmptyCollectionException("stack");

        top--;
        T result = stack[top];
        stack[top] = null;
        return result;
    }

    /**
     * Returns a reference to the element at the top of this stack.
     * The element is not removed from the stack.
     */

    public boolean isEmpty() {
        return top == 0;
    }

    /**
     * Returns a reference to the element at the top of this stack.
     * The element is not removed from the stack.
     */
    public T peek() throws EmptyCollectionException {
        if (isEmpty())
            throw new EmptyCollectionException("stack");
        return stack[top - 1];
    }

    // returns length of stack

    public int size() {
        return stack.length;
    }

    // toString method to print output

    public String toString() {
        if (isEmpty()) {
            return "Stack is Empty.";
        }

        String output = "Stack contents:\n";
        for (int i = 0; i < top; i++) {
            output += stack[i].toString() + "\n";
        }
        return output;
    }

}
