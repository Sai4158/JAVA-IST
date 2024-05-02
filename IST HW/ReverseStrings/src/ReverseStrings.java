/**
 File name: ReverseStrings.java

 Short description: Java application called "ReverseStrings" that prompts the user for two strings,
 verifies their length, and prints them out in reverse order with proper formatting and error handling.

 IST 140 Assignment:  W4 PA - ReverseStrings (Level 2)

 @author Sai Rangineeni
 @version 2/10/2023

 date of last revision: 2/10/2023
 details of the revision: 2/10/2023 -  Completed the code, done!
 */

import java.util.Scanner;

public class ReverseStrings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt so they can enter the first string
        System.out.print("Enter a 3-character string: ");
        String firstString = input.nextLine();

        // Checking if the second string is 3 characters long or not
        if (firstString.length() != 3) {
            System.out.println("Error");
            System.exit(0);
        }

        // Prompt for second string
        System.out.print("Enter a 4-character string: ");
        String secondString = input.nextLine();

        // Checking if the second string is 4 characters long or not
        if (secondString.length() != 4) {
            System.out.println("Error");
            System.exit(0);
        }

        // Print the two first strings
        System.out.println("The two strings you entered are: " + firstString + " " + secondString + ".");

        // Reverse and print the strings
        System.out.println("The two strings in reverse are: " + secondString.charAt(3) + secondString.charAt(2) + secondString.charAt(1) + secondString.charAt(0) + " " + firstString.charAt(2) + firstString.charAt(1) + firstString.charAt(0) + ".");
    }
}

/*
Enter a 3-character string: cat
Enter a 4-character string: book
The two strings you entered are: cat book.
The two strings in reverse are: koob tac.

Process finished with exit code 0

---------------------------------------------------------

Enter a 3-character string: hello
Error

Process finished with exit code 0

---------------------------------------------------------

Enter a 3-character string: cat
Enter a 4-character string: hello
Error

Process finished with exit code 0

 */