/**
 File name: ProgramTemplate.java
 Short description: Class to calculate the average of 3 numbers.
 IST 140 Assignment:  Enter Assignment # here
 @author Your Name Here
 @version 1.01 2014-08-25
 date of last revision:
 details of the revision: none
 */
import java.util.Scanner;

public class Grades_InClass1 {
    public static void main(String[] args) {
        System.out.println("This program will calculate and display the average of any 3 numbers");

        int first, second, third, sum;
        float average;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter three numbers:");
        first = input.nextInt();
        second = input.nextInt();
        third = input.nextInt();

        sum = first + second + third;
        average = (float) sum / 3.0f;

        System.out.println("The average of the grades is " + average);

        if (average >= 90) {
            System.out.println("A");
        } else if (average >= 80) {
            System.out.println("B");
        } else if (average >= 70) {
            System.out.println("C");
        } else if (average >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}
