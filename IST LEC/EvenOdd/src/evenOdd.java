/**
 File name: ProgramTemplate.java
 Short description: Class to calculate the average of 3 numbers.
 IST 140 Assignment:  2/1/2023
 @author Your Name Here
 @version 1.01 2014-08-25
 date of last revision:
 details of the revision: none
 */
import java.util.Scanner;

public class evenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;

        System.out.print("Enter a number: ");
        num = input.nextInt();

        if (num % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }
    }
}
