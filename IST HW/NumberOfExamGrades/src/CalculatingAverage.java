/**
 * File name: CalculatingAverage.java
 * Short description: Class to calculate the average of numbers.
 * IST 140 Assignment: Enter Assignment # here
 * @author Your Name Here
 * @version 1.01 2014-08-25
 * Date of last revision: 
 * Details of the revision: none
 */

import java.util.Scanner;

public class CalculatingAverage {
    public static void main(String[] args) {
        // Program description
        System.out.println("This program will calculate and display\n"
                + "the average of any numbers entered\n");

        // Declaring the variables: types and names
        double sum = 0;
        int count = 0;
        double num = 0;
        double average;
        Scanner input = new Scanner(System.in);

        // Variable initialization: getting the input from the user
        System.out.println("Enter any numeric value or (-1 to quit):");
        num = input.nextDouble();

        // Calculations
        while (num != -1) {
            sum += num;
            count++;
            System.out.println(sum);
        }
        if (count > 0) {
            average = sum / count;
        } else {
            System.out.println("No numbers entered.");
        }
    }
}
