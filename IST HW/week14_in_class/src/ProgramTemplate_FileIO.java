import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class ProgramTemplate_FileIO {
    public static void main(String[] args) throws FileNotFoundException {
        // Program description
        System.out.println("This program will read numbers from a file and display\n" +
                "their average to the screen and to a file.\n");

        // Declaring the variables: types and names
        ArrayList<Double> grades = new ArrayList<Double>();
        ArrayList<Character> letterGrades = new ArrayList<Character>();
        double total = 0;
        double average;

        // Construct the Scanner and PrintWriter objects for reading and writing
        File inputFile = new File("inputFile.txt");
        Scanner inFile = new Scanner(inputFile);
        PrintWriter outFile = new PrintWriter("outputFile.txt");

        // Read data from file and load array list
        while (inFile.hasNextDouble()) {
            double grade = inFile.nextDouble();
            grades.add(grade);
            total += grade;

            // Determine letter grade
            char letterGrade = getLetterGrade(grade);
            letterGrades.add(letterGrade);

            // Debugging purpose
            System.out.println(grades.toString());
            System.out.println(letterGrades.toString());
        }

        // Calculation
        average = total / grades.size();

        // Display the results
        System.out.print("The average of the grades (");
        for (double grade : grades) {
            System.out.printf("%.1f, ", grade);
        }
        System.out.printf("\b\b) is %.1f.\n", average);

        // Print grades and letter grades to the console
        System.out.println("Grade\tLetter Grade");
        for (int i = 0; i < grades.size(); i++) {
            System.out.printf("%.2f\t%c\n", grades.get(i), letterGrades.get(i));
        }

        // Write data to output file
        outFile.println("Grade\tLetter Grade");
        for (int i = 0; i < grades.size(); i++) {
            outFile.printf("%.1f\t%c\n", grades.get(i), letterGrades.get(i));
        }
        outFile.printf("\nThe average of the grades is %.1f.", average);

        // Close the files
        inFile.close();
        outFile.close(); // very important
    }

    // Method to determine the letter grade given the grade
    public static char getLetterGrade(double grade) {
        if (grade >= 90) {
            return 'A';
        } else if (grade >= 80) {
            return 'B';
        } else if (grade >= 70) {
            return 'C';
        } else if (grade >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
}
