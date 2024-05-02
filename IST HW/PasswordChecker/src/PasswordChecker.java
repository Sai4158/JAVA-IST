/**
 File name: PasswordChecker.java
 Short description: The "PasswordChecker" program is a Java application that verifies the compliance of a password
 entered by the user with a set password policy
 IST 140 Assignment: W5 PA - PasswordChecker (Level 2)
 @author Sai Rangineeni
 @version 2023-05-03
 date of last revision: 2023-05-03
 details of the revision: Corrected the code
 */
import java.util.Scanner;

public class PatternMaker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for number of rows
        System.out.print("Enter the number of rows (5-15): ");
        int numRows = input.nextInt();

        // Prompt user for number of columns
        System.out.print("Enter the number of columns (5-20): ");
        int numCols = input.nextInt();

        // Validate numCols >= numRows
        while (numCols < numRows) {
            System.out.print("Number of columns must be greater than or equal to number of rows. Please enter a valid number of columns: ");
            numCols = input.nextInt();
        }

        // Prompt user for first string
        System.out.print("Enter the first string of the pattern: ");
        String firstString = input.next();

        // Prompt user for second string
        System.out.print("Enter the second string of the pattern: ");
        String secondString = input.next();

        // Prompt user for separator string
        System.out.print("Enter the separator string: ");
        String separator = input.next();

        // Print triangular pattern
        for (int i = 0; i < numRows; i++) {
            int colLimit = numCols - i;
            for (int j = 0; j < colLimit; j++) {
                // Determine which string to print for the current column
                String toPrint = (i % 2 == 0) ^ (j % 2 == 0) ? firstString : secondString;

                // Print the string and separator, except for the last column
                System.out.print(toPrint);
                if (j != colLimit - 1) {
                    System.out.print(separator);
                }
            }
            // Print newline character at the end of each row
            System.out.println();
        }
    }
}


/*
Enter a password: Pass1
The provided password is valid.

Process finished with exit code 0
------------
Enter a password: A1bde
The provided password is valid.

Process finished with exit code 0
--------------
Enter a password: A1B2C
The provided password is invalid because it must be five characters in length and include at least one digit, at least one uppercase, and at least one lowercase character. Please try again.

Process finished with exit code 0
-------------
Enter a password: 1234A
The provided password is invalid because it must be five characters in length and include at least one digit, at least one uppercase, and at least one lowercase character. Please try again.

Process finished with exit code 0
---------------
Enter a password: abc12
The provided password is invalid because it must be five characters in length and include at least one digit, at least one uppercase, and at least one lowercase character. Please try again.

Process finished with exit code 0

 */