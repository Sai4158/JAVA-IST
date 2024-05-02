/**
 * File name: GradeCalculationUsingForLoop.java
 * Short description: Class to calculate the average of grades.
 * IST 140 Assignment: Enter Assignment # here
 * @author Your Name Here
 * @version 1.01 2014-08-25
 * Date of last revision:
 * Details of the revision: none
 */

import java.util.Scanner;

public class GradeCalculationUsingForLoop {
    public static void main(String[] args) {
        // Program description
        System.out.println("This program will calculate and display\n"
                + "the average and grade earned on a number of exams set by the user.\n");

        // Declaring the variables: types and names
        int numGrades;
        double exam, total = 0;
        double average;
        String letterGrade;

        Scanner input = new Scanner(System.in);

        // Variable initialization: getting the input from the user
        System.out.println("Enter the number of exams to be processed:");
        numGrades = input.nextInt();

        // Get grades for each exam
        for (int count = 1; count <= numGrades; count++) {
            System.out.print("Enter exam " + count + ": ");
            exam = input.nextDouble();

            // Validate grade input
            while (exam < 0 || exam > 100) {
                System.out.println("Invalid grade entered. Please enter a grade between 0 and 100.");
                exam = input.nextDouble();
            }

            total += exam;
        }

        // Calculations
        average = total / numGrades;

        // Determine the letter grade
        if (average >= 90) {
            letterGrade = "A";
        } else if (average >= 80) {
            letterGrade = "B";
        } else if (average >= 70) {
            letterGrade = "C";
        } else if (average >= 60) {
            letterGrade = "D";
        } else {
            letterGrade = "F";
        }

        // Display the results
        System.out.printf("The average score is %.2f:\n", average);
        System.out.println("The letter grade is: " + letterGrade);
    }
}
