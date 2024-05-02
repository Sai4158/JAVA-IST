/**
 * /**
 * File name: AverageWithMethods.java
 * Short description: This program calculates the average of five to ten numbers entered by the user.
 * IST 140 Assignment: W10 PA - AverageWithMethods (Level 2)
 * @author Sai Rangineeni
 * @version 3/27/2023
 * date of last revision: 3/30/2023
 * details of the revision - Done
 */

import java.util.Scanner;

public class AverageWithMethods {
    public static void main(String[] args) {
        // Print program description to the user
        printProgramDescription();

        // Get the numbers entered by the user
        String inputString = getNumbers();

        // Calculate the average of the numbers entered by the user
        double average = calculateAverage(inputString);

        // Print the results with the whole number, a decimal, and two decimal positions
        printResults(inputString, average);
    }

    // Prints out the program description to the user.
    public static void printProgramDescription() {
        System.out.println("This program calculates the average of five to ten numbers entered by the user.");
    }

    // Gets the numbers entered by the user.
    // Returns a String of numbers separated by spaces
    public static String getNumbers() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter five to ten numbers separated by spaces: ");
        String inputString = input.nextLine();
        return inputString;
    }

    // Calculates the average of the numbers entered by the user.
    // Takes a String of numbers separated by spaces as input and returns the average as a double
    public static double calculateAverage(String inputString) {
        Scanner strInput = new Scanner(inputString);
        int count = 0;
        double total = 0.0;
        while (strInput.hasNext()) {
            // Verify that the user entered at least 5 and at most 10 numbers
            if (count >= 10) {
                System.out.println("Error: Too many numbers entered. Please enter between 5 and 10 numbers.");
                System.exit(0);
            }
            double number;
            if (strInput.hasNextDouble()) {
                number = strInput.nextDouble();
                total += number;
                count++;
            } else {
                System.out.println("Error: Invalid input. Please enter numbers only.");
                System.exit(0);
            }
        }
        if (count < 5) {
            System.out.println("Error: Not enough numbers entered. Please enter between 5 and 10 numbers.");
            System.exit(0);
        }
        double average = total / count;
        return average;
    }

    // Prints the results with the whole number, a decimal, and two decimal positions.
    // Takes a String of numbers separated by spaces and the average as input and prints the results to the console
    public static void printResults(String inputString, double average) {
        System.out.printf("The average of the numbers %s is %.2f.%n", inputString, average);
    }
}

/*
This program calculates the average of five to ten numbers entered by the user.
Enter five to ten numbers separated by spaces: 10
Error: Not enough numbers entered. Please enter between 5 and 10 numbers.

Process finished with exit code 0
-----------
This program calculates the average of five to ten numbers entered by the user.
Enter five to ten numbers separated by spaces: 4 3 5 6 3
The average of the numbers 4 3 5 6 3 is 4.20.

Process finished with exit code 0
------------------
This program calculates the average of five to ten numbers entered by the user.
Enter five to ten numbers separated by spaces: 123456789
Error: Not enough numbers entered. Please enter between 5 and 10 numbers.

Process finished with exit code 0
-------------
This program calculates the average of five to ten numbers entered by the user.
Enter five to ten numbers separated by spaces: 6 4 2 2 3 3 2 5 2
The average of the numbers 6 4 2 2 3 3 2 5 2 is 3.22.

Process finished with exit code 0

 */