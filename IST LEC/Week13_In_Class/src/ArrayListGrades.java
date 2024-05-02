import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListGrades {
    public static void main(String[] args) {
        // Program description
        System.out.println("This program will process grades for a class.\n");

        // Declaring the variables: types and names
        Scanner input = new Scanner(System.in);
        ArrayList<Double> exams = new ArrayList<Double>();
        ArrayList<String> grades = new ArrayList<String>();
        ArrayList<String> names = new ArrayList<String>();

        // Variable initialization: getting the input from the user
        System.out.println("Enter information for the students (Q to quit):");
        while (input.hasNext()) {
            System.out.print("Enter student name (or Q to quit): ");
            String name = input.next();
            if (name.equalsIgnoreCase("Q")) {
                break;
            }
            names.add(name);
            System.out.print("Enter exam grade for " + name + ": ");
            double exam = input.nextDouble();
            if (exam >= 0 && exam <= 100) {
                exams.add(exam);
            } else {
                System.out.println("Invalid grade. Please enter a grade between 0 and 100.");
            }
        }

        // Calculations
        ArrayList<String> earnedGrades = getEarnedGrades(exams);

        // Display the results
        System.out.println("Results:");
        for (int i = 0; i < names.size(); i++) {
            String name = names.get(i);
            double exam = exams.get(i);
            String grade = earnedGrades.get(i);
            System.out.println(name + ": " + grade + " (" + exam + ")");
        }
    }

    // Function to calculate the earned grade for each exam
    public static ArrayList<String> getEarnedGrades(ArrayList<Double> exams) {
        ArrayList<String> earnedGrades = new ArrayList<String>();
        for (double exam : exams) {
            String grade;
            if (exam >= 90) {
                grade = "A";
            } else if (exam >= 80) {
                grade = "B";
            } else if (exam >= 70) {
                grade = "C";
            } else if (exam >= 60) {
                grade = "D";
            } else {
                grade = "F";
            }
            earnedGrades.add(grade);
        }
        return earnedGrades;
    }
}
