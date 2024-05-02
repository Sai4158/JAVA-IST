import java.util.Scanner;

public class GradeCalculationUsingSentinel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int gradeCount = 0;
        double gradeSum = 0;
        double grade = 0;

        // Read exam grades until -1 is entered
        while (grade != -1) {
            System.out.print("Enter an exam grade (0-100), or -1 to quit: ");
            grade = input.nextDouble();
            if (grade >= 0 && grade <= 100) {
                gradeSum += grade;
                gradeCount++;
            } else if (grade != -1) {
                System.out.println("Invalid grade entered. Please enter a grade between 0 and 100, or -1 to quit.");
            }
        }

        // Calculate and display the average
        if (gradeCount > 0) {
            double average = gradeSum / gradeCount;
            System.out.printf("The average of the %d exam grades entered is %.2f.\n", gradeCount, average);
        } else {
            System.out.println("No exam grades entered.");
        }
    }
}

