import java.util.Scanner;

public class ReadValueBetween {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int low, high, total = 0, count = 0;

        // Get the lower and upper limits
        System.out.print("Enter the lower limit: ");
        low = in.nextInt();
        System.out.print("Enter the upper limit: ");
        high = in.nextInt();

        // Read values until a value outside the limits is entered
        int value;
        do {
            System.out.print("Enter a value between " + low + " and " + high + " (inclusive): ");
            value = in.nextInt();
            if (value >= low && value <= high) {
                total += value;
                count++;
            }
        } while (value >= low && value <= high);

        // Calculate and output the average
        double average = (double) total / count;
        System.out.println("The average of the values between " + low + " and " + high + " is " + average);

        // Calculate and output the letter grade
        char grade = getLetterGrade(average);
        System.out.println("The grade earned is " + grade);
    }

    /*
    Method which accepts a numerical grade and returns the corresponding letter grade
    */
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
