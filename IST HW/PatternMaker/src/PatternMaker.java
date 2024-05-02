/**
 File name: PatternMaker.java

 Short description: input values such as the number of rows and columns, and the strings to use for the pattern, and
 then uses nested loops to print the pattern in the desired column order

 IST 140 Assignment:  W9 PA - PatternMaker (Level 3)

 @author Sai Rangineeni
 @version 3/22/2023
 date of last revision: 3/24/2023
 details of the revision: 1/24/2023 -  Completed the code, done!
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
Enter the number of rows (5-15): 6
Enter the number of columns (5-20): 10
Enter the first string of the pattern: y
Enter the second string of the pattern: 3
Enter the separator string: -
y-y-y-y-y-y-y-y-y-y
y-y-y-y-y-y-y-y-y-y
3-3-3-3-3-3-3-3-3-3
y-y-y-y-y-y-y-y-y-y
3-3-3-3-3-3-3-3-3-3
y-y-y-y-y-y-y-y-y-y

Process finished with exit code 0
-----------------------
Enter the number of rows (5-15): 4
Enter the number of columns (5-20): 3
Number of columns must be greater than or equal to number of rows. Please enter a valid number of columns: 2
Number of columns must be greater than or equal to number of rows. Please enter a valid number of columns: 4
Enter the first string of the pattern: 5
Enter the second string of the pattern: 53
Enter the separator string: 2
5252525
5252525
53253253253
5252525
------------------------
Enter the number of rows (5-15): 7
Enter the number of columns (5-20): 5
Number of columns must be greater than or equal to number of rows. Please enter a valid number of columns: 11
Enter the first string of the pattern: 12
Enter the second string of the pattern: 2
Enter the separator string: --
12--12--12--12--12--12--12--12--12--12--12
12--12--12--12--12--12--12--12--12--12--12
2--2--2--2--2--2--2--2--2--2--2
12--12--12--12--12--12--12--12--12--12--12
2--2--2--2--2--2--2--2--2--2--2
12--12--12--12--12--12--12--12--12--12--12
2--2--2--2--2--2--2--2--2--2--2
 */