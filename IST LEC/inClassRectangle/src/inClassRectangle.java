/**
 File name: ProgramTemplate.java
 Short description: Class to calculate the area, perimeter and diagonal of a rectangle
 IST 140 Assignment: Enter Assignment # here
 @author Your Name Here
 @version 1.01 2014-08-25
 date of last revision:
 details of the revision: none
 */

import java.util.Scanner;

public class inClassRectangle {
    public static void main(String[] args) {
        // Program description
        System.out.println("This program will calculate and display the area, perimeter and diagonal of a rectangle\n");

        // Declaring the variables: types and names
        double length, width, area, perimeter, diagonal;
        Scanner input = new Scanner(System.in);

        // Variable initialization: getting the input from the user
        System.out.print("Enter the length of the rectangle: ");
        length = input.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        width = input.nextDouble();

        // Calculations
        area = length * width;
        perimeter = 2 * (length + width);
        diagonal = Math.sqrt(Math.pow(length, 2) + Math.pow(width, 2));

        // Display the results
        System.out.printf("The area of the rectangle is %.4f\n", area);
        System.out.printf("The perimeter of the rectangle is %.4f\n", perimeter);
        System.out.printf("The diagonal of the rectangle is %.4f\n", diagonal);
    }
}
