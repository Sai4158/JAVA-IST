/**
 File name: RooterUp.java
 Short description: finds the square root of every number from 1 up to a given positive integer.
 IST 140 Assignment:  W7 PA - RooterUp (Level 1)
 @author Sai Rangineeni
 @version 3/3/2023
 date of last revision: 3/3/2023
 details of the revision: 3/3/2023
 */

import java.util.Scanner;

public class RooterUp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int stop = 0;

        // Get the positive integer from the user
        while (stop <= 0) {
            System.out.print("Enter a positive integer: ");
            if (input.hasNextInt()) {
                stop = input.nextInt();
                if (stop <= 0) {
                    System.out.println("Invalid input. Please enter a positive integer.");
                }
            } else {
                System.out.println("Invalid input. Please enter a positive integer.");
                input.next();
            }
        }

        // Find the square root
        int count = 1;
        while (count <= stop) {
            double squareRoot = Math.sqrt(count);
            System.out.println("The square root of " + count + " is " + String.format("%.3f", squareRoot));
            count++;
        }
    }
}

/*
Enter a positive integer: 0
Invalid input. Please enter a positive integer.
Enter a positive integer:
--------------
Enter a positive integer: 2
The square root of 1 is 1.000
The square root of 2 is 1.414

Process finished with exit code 0

------------------------------
Enter a positive integer: 5
The square root of 1 is 1.000
The square root of 2 is 1.414
The square root of 3 is 1.732
The square root of 4 is 2.000
The square root of 5 is 2.236

Process finished with exit code 0

-----------------------------
Enter a positive integer: 25
The square root of 1 is 1.000
The square root of 2 is 1.414
The square root of 3 is 1.732
The square root of 4 is 2.000
The square root of 5 is 2.236
The square root of 6 is 2.449
The square root of 7 is 2.646
The square root of 8 is 2.828
The square root of 9 is 3.000
The square root of 10 is 3.162
The square root of 11 is 3.317
The square root of 12 is 3.464
The square root of 13 is 3.606
The square root of 14 is 3.742
The square root of 15 is 3.873
The square root of 16 is 4.000
The square root of 17 is 4.123
The square root of 18 is 4.243
The square root of 19 is 4.359
The square root of 20 is 4.472
The square root of 21 is 4.583
The square root of 22 is 4.690
The square root of 23 is 4.796
The square root of 24 is 4.899
The square root of 25 is 5.000

Process finished with exit code 0

 */