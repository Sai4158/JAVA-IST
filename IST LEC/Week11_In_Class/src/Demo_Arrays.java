// In Class 1 - CH 6

import java.util.Scanner;

public class Demo_Arrays {
    public static void main(String[] args) {
        // Declare an array to store 5 grades
        final int SIZE = 5;
        double[] grades = new double[SIZE];
        double total = 0.0;
        Scanner input = new Scanner(System.in);

        // Initialize the array by getting input from the user
        for (int i = 0; i < SIZE; i++) {
            System.out.print("Enter grade " + (i + 1) + ">> ");
            grades[i] = input.nextDouble();
            System.out.println("You entered: " + grades[i]);
            total += grades[i];
        }

        // Calculate and display the class average
        double average = total / SIZE;
        System.out.printf("The average of the grades is %.2f%n", average);

        // Call the avg method to get the letter grade
        String letterGrade = avg(average);
        System.out.println("The letter grade is: " + letterGrade);

        // Close the Scanner object
        input.close();
    }

    public static String avg(double average) {
        if (average >= 90) {
            return "A";
        } else if (average >= 80) {
            return "B";
        } else if (average >= 70) {
            return "C";
        } else if (average >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
}


/*
Enter grade 1>> 99
You entered: 99.0
Enter grade 2>> 98
You entered: 98.0
Enter grade 3>> 97
You entered: 97.0
Enter grade 4>> 96
You entered: 96.0
Enter grade 5>> 95
You entered: 95.0
The average of the grades 99.0 98.0 97.0 96.0 95.0 is 97.0
Press any key to continue . . .
*/