import java.util.Scanner;

/**
 * This program calculates the average grade of three exams and returns the corresponding letter grade.
 */
public class CalculateGrades1 {

    public static void programDesc() {
        System.out.println("This program calculates the average grade of three exams and returns the corresponding letter grade.");
    }

    public static void calcArea() {
        Scanner input = new Scanner(System.in);

        double exam;
        double total = 0.0;
        double average;
        String Tgrade;

        for (int i = 1; i <= 3; i++) {
            System.out.print("Enter exam " + i + ": ");
            exam = input.nextDouble();
            total += exam;
        }

        average = total / 3;
        Tgrade = getLetterGrade(average);

        System.out.printf("Average grade: %.2f\n", average);
        System.out.printf("Letter grade: %s\n", Tgrade);
    }

    public static String getLetterGrade(double avg) {
        String gr = "?";
        if (avg >= 90) {
            gr = "A";
        } else if (avg >= 80) {
            gr = "B";
        } else if (avg >= 70) {
            gr = "C";
        } else if (avg >= 60) {
            gr = "D";
        } else {
            gr = "F";
        }
        return gr;
    }

    public static void main(String[] args) {
        programDesc();
        calcArea();
    }
}
