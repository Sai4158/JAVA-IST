/**
 File name: AverageCalculator.java

 Short description: Calculates the average of four numbers entered by the user
 and outputs the result with 2 decimal places.

 IST 140 Assignment:  W3: PA - AverageCalculator (Level 1)

 @author Sai Rangineeni

 @version 2/3/2023

 date of last revision: 2/3/2023

 details of the revision: Completed
 */


import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");

            double num1 = input.nextDouble();

        System.out.print("Enter second number: ");

            double num2 = input.nextDouble();

        System.out.print("Enter third number: ");

            double num3 = input.nextDouble();

        System.out.print("Enter fourth number: ");

            double num4 = input.nextDouble();
// add all then divide by 4
            double average = (num1 + num2 + num3 + num4) / 4;

// print
        System.out.printf("The average of the numbers %.2f, %.2f, %.2f, and %.2f is %.2f.",
                num1, num2, num3, num4, average);
    }
}
/*
Enter first number: 30.25
Enter second number:  25.5
Enter third number: 100
Enter fourth number: 42
The average of the numbers 30.25, 25.50, 100.00, and 42.00 is 49.44.
Process finished with exit code 0
 */