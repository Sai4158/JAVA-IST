/**
 File name: TableMath.java

 Short description: This program prompts the user to enter an integer value between 5 and 10, then uses nested
 for loops to print an addition table that displays the sum of each combination of numbers up to the value entered by the user.

 IST 140 Assignment:  W9 PA - TableMath (Level 3)

 @author Sai Rangineeni
 @version 3/25/2023
 date of last revision: 3/27/2023
 details of the revision: 1/27/2023 -  Completed the code, done!
 */

import java.util.Scanner;

public class TableMath {

    public static void main(String[] args) {

        // create a scanner object to read user input
        Scanner scnr = new Scanner(System.in);

        int stop = 0;
        boolean valid = false;

        // prompt user for input and validate it
        do {
            System.out.print("Enter a value between 5 and 10 inclusive: ");
            stop = scnr.nextInt();
            if (stop >= 5 && stop <= 10) {
                valid = true;
            } else {
                System.out.println("Invalid input. Please try again.");
            }
        } while (!valid);

        // print the addition table
        System.out.print(" + |");
        for (int i = 0; i <= stop; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println();
        for (int i = 0; i <= stop; i++) {
            System.out.print("---+");
        }
        System.out.println();
        for (int i = 0; i <= stop; i++) {
            System.out.printf("%2d |", i);
            for (int j = 0; j <= stop; j++) {
                System.out.printf("%4d", i + j);
            }
            System.out.println();
        }
    }
}

/*
Enter a value between 5 and 10 inclusive: 30
Invalid input. Please try again.
Enter a value between 5 and 10 inclusive: 9
 + |   0   1   2   3   4   5   6   7   8   9
---+---+---+---+---+---+---+---+---+---+
 0 |   0   1   2   3   4   5   6   7   8   9
 1 |   1   2   3   4   5   6   7   8   9  10
 2 |   2   3   4   5   6   7   8   9  10  11
 3 |   3   4   5   6   7   8   9  10  11  12
 4 |   4   5   6   7   8   9  10  11  12  13
 5 |   5   6   7   8   9  10  11  12  13  14
 6 |   6   7   8   9  10  11  12  13  14  15
 7 |   7   8   9  10  11  12  13  14  15  16
 8 |   8   9  10  11  12  13  14  15  16  17
 9 |   9  10  11  12  13  14  15  16  17  18

Process finished with exit code 0
------------

Enter a value between 5 and 10 inclusive: 9
 + |   0   1   2   3   4   5   6   7   8   9
---+---+---+---+---+---+---+---+---+---+
 0 |   0   1   2   3   4   5   6   7   8   9
 1 |   1   2   3   4   5   6   7   8   9  10
 2 |   2   3   4   5   6   7   8   9  10  11
 3 |   3   4   5   6   7   8   9  10  11  12
 4 |   4   5   6   7   8   9  10  11  12  13
 5 |   5   6   7   8   9  10  11  12  13  14
 6 |   6   7   8   9  10  11  12  13  14  15
 7 |   7   8   9  10  11  12  13  14  15  16
 8 |   8   9  10  11  12  13  14  15  16  17
 9 |   9  10  11  12  13  14  15  16  17  18

Process finished with exit code 0
------------

Enter a value between 5 and 10 inclusive: 6
 + |   0   1   2   3   4   5   6
---+---+---+---+---+---+---+
 0 |   0   1   2   3   4   5   6
 1 |   1   2   3   4   5   6   7
 2 |   2   3   4   5   6   7   8
 3 |   3   4   5   6   7   8   9
 4 |   4   5   6   7   8   9  10
 5 |   5   6   7   8   9  10  11
 6 |   6   7   8   9  10  11  12

Process finished with exit code 0
----------

Enter a value between 5 and 10 inclusive: 44
Invalid input. Please try again.
Enter a value between 5 and 10 inclusive:
 */