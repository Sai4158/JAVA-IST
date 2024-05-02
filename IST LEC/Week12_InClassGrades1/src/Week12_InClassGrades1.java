/**
 File name: Week12_InClassGrades1.java

 Short description: This code prompts the user to enter the number of grades they will input, reads in each grade,
 calculates the average of the grades,and determines the corresponding letter grade using the standard grading scale,
 and then displays the results.

 IST 140 Assignment: W12: In Class Assignment -- InClassGrades

 @author Sai Rangineeni

 @version 4/5/2023

 date of last revision: 4/5/2023

 details of the revision: 4/5/2023 (I was absent today but I did complete this code after watching the zoom REC)
 */

import java.util.Scanner;
import java.util.Arrays;

public class Week12_InClassGrades1 {
    public static void main(String[] args) {
        // Program description
        System.out.println("This program will work with exam grades to determine grade earned.\n");

        // Variable initialization: getting the input from the user
        int numGrades = getNumGrades();
        double[] grades = new double[numGrades];
        getGrades(grades);

        // Print out the array
        System.out.println(Arrays.toString(grades));

        // Calculations
        double average = calcAverage(grades);
        String letterGrade = getLetterGrade(average);

        // Display the results
        displayResults(average, letterGrade);
    }

    // Method to ask for number of grades to be entered
    public static int getNumGrades() {
        Scanner input = new Scanner(System.in);
        int num = 0;

        do {
            System.out.print("Enter number of grades to be entered (positive value): ");
            num = input.nextInt();
        } while (num <= 0);

        return num;
    }

    // Method to read in grades and store in an array
    public static void getGrades(double[] grades) {
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < grades.length; i++) {
            do {
                System.out.print("Enter grade " + (i + 1) + ": ");
                grades[i] = input.nextDouble();
            } while (grades[i] < 0 || grades[i] > 100);
        }
    }

    // Method to calculate average of grades
    public static double calcAverage(double[] grades) {
        double total = 0;

        for (int i = 0; i < grades.length; i++) {
            total += grades[i];
        }

        return total / grades.length;
    }

    // Method to determine letter grade based on average
    public static String getLetterGrade(double avg) {
        String letterGrade = "?";

        if (avg >= 90) {
            letterGrade = "A";
        } else if (avg >= 80) {
            letterGrade = "B";
        } else if (avg >= 70) {
            letterGrade = "C";
        } else if (avg >= 60) {
            letterGrade = "D";
        } else {
            letterGrade = "F";
        }

        return letterGrade;
    }

    // Method to display the results
    public static void displayResults(double avg, String letterGrade) {
        System.out.printf("The average of the grades is %.2f\n", avg);
        System.out.println("Grade earned is " + letterGrade);
    }
}

/*
This program will work with exam grades to determine grade earned.

Enter number of grades to be entered (positive value): 3
Enter grade 1: 22
Enter grade 2: 90
Enter grade 3: 45
[22.0, 90.0, 45.0]
The average of the grades is 52.33
Grade earned is F

Process finished with exit code 0
-----------
This program will work with exam grades to determine grade earned.

Enter number of grades to be entered (positive value): 5
Enter grade 1: 88
Enter grade 2: 77
Enter grade 3: 86
Enter grade 4: 57
Enter grade 5: 90
[88.0, 77.0, 86.0, 57.0, 90.0]
The average of the grades is 79.60
Grade earned is C

Process finished with exit code 0
--------------------
This program will work with exam grades to determine grade earned.

Enter number of grades to be entered (positive value): 1
Enter grade 1: 99
[99.0]
The average of the grades is 99.00
Grade earned is A

Process finished with exit code 0


 */