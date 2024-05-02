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

public class StringTesting {
    public static void main(String[] args) {
        String first, second, third;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter first string...");
        first = input.nextLine();
        System.out.println("Enter second string...");
        second = input.nextLine();
        System.out.println("Enter third string...");
        third = input.nextLine();

        if (first.compareTo(second) < 0) {
            if (first.compareTo(third) < 0) {
                System.out.println(second);
                System.out.println(third);
            } else {
                System.out.println(third);
                System.out.println(second);
            }
        } else {
            if (second.compareTo(third) < 0) {
                System.out.println(third);
            } else {
                System.out.println(second);
                System.out.println(first);
            }
        }
    }
}
/*
Enter first string...
5
Enter second string...
56
Enter third string...
3
3
56

Process finished with exit code 0

 */