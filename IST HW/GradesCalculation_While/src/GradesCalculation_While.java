/**
 * File name: ProgramTemplate.java
 * Short description: Class to calculate the average of grades.
 * IST 140 Assignment: Enter Assignment # here
 * Author: Your Name Here
 * Version: 1.01 2014-08-25
 * Date of last revision:
 * Details of the revision: none
 */

import java.util.Scanner;

public class GradesCalculation_While {

    public static void main(String[] args) {
        // Program description
        System.out.println("This program will calculate the average grade and letter grade for a set of exams.\n");

        // Declaring the variables: types and names
        Scanner input = new Scanner(System.in);
        int numGrades, count = 0;
        double total = 0, exam, average;
        String letterGrade;

        // Variable initialization: getting the input from the user
        System.out.print("Enter number of exams to be processed: ");
        numGrades = input.nextInt();

        while (count < numGrades) {
            count++;
            System.out.print("Enter exam #" + count + ": ");
            exam = input.nextDouble();
            total += exam;
        }

        // Calculations
        average = total / numGrades;

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
        System.out.println("The average grade is: " + average);
        System.out.println("The letter grade is: " + letterGrade);
    }
}
