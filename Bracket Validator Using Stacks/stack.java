
/****
 * Name: Manik Singh
 * Student Number: T00715263
 * Assignment Number: 6
 * Due Date: November 30, 2023
 * Program Description: This is the stack class with the main method that uses
 * the Arraystack class to make an algorithm that checks whether the input has brackets
 * have a pair.
 ****/

import java.io.IOException;

public class stack {
    public static void main(String[] args) throws IOException {

        // Test strings with various bracket combinations

        String[] testString = { "(", ")", "( )", "( }", "( ( )", "( ) )", "( {   [     ] }   )",
                "[  ( {   [     ] }   )  ( {   [     ] }   )   ]",
                "[  [  ( {   [     ] }   )  ( {   [     ] }   )   ]",
                "[  ( {   [     ] }   )  ( {   [     ] }   )   ]    ]" };

        // Iterate through each test string

        for (int j = 0; j < testString.length; j++) {

            String inputString = testString[j];

            System.out.println("Examining String: " + inputString);

            boolean matches = true;

            // Stack to keep track of opening brackets

            ArrayStack<Character> stack = new ArrayStack<Character>();

            // Iterate through each character in the test string

            for (int i = 0; i < inputString.length(); i++) {
                char next = inputString.charAt(i);
                // Ignore whitespace
                if (next != ' '
                        && (next == '(' || next == '[' || next == '{' || next == ')' || next == ']' || next == '}')) {

                    System.out.println(" Symbol Examined: " + next);

                }

                // Process opening brackets

                if (next == '(' || next == '[' || next == '{') {
                    stack.push(next);
                }

                // Process closing brackets and heck if stack is empty

                else if (next == ')' || next == ']' || next == '}') {

                    if (stack.isEmpty()) {
                        matches = false;
                        System.out.println("Invalid: Stack is empty, missing left facing brackets \n");
                    }

                    // Check if closing bracket matches the top of the stack

                    else {
                        char top = stack.pop();
                        if ((next == ')' && top != '(') ||
                                (next == ']' && top != '[') ||
                                (next == '}' && top != '{')) {
                            matches = false;

                            System.out.println("Invalid: Brackets do not match \n");
                        }
                    }

                }
            }

            // Check if there are unmatched opening brackets

            if (!stack.isEmpty()) {

                System.out.println("Invalid: missing right facing brackets \n");
                matches = false;
            }

            // Print the final result for the current test string

            if (matches) {

                System.out.println("Valid: " + inputString + "\n");
            }
        }
    }
}
