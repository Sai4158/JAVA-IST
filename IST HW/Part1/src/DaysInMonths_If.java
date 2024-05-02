/**
 *
 * File name: java.util.Scanner

 * Short description:  Displays how many days are there in a month

 * IST 140 Assignment:  W6 - Lab: DaysInMonths (Horstmann p 130)

 * @author Sai Rangineeni

 * @version 2/13/2023

 * date of last revision: 2/16/2023

 * details of the revision: 2/16/2023

 */
import java.util.Scanner;

public class DaysInMonths_If {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a month: ");
        int month = input.nextInt();

        int days = 0;
        if (month == 1) {
            days = 31;
        } else if (month == 2) {
            days = 28;
        } else if (month == 3) {
            days = 31;
        } else if (month == 4) {
            days = 30;
        } else if (month == 5) {
            days = 31;
        } else if (month == 6) {
            days = 30;
        } else if (month == 7) {
            days = 31;
        } else if (month == 8) {
            days = 31;
        } else if (month == 9) {
            days = 30;
        } else if (month == 10) {
            days = 31;
        } else if (month == 11) {
            days = 30;
        } else if (month == 12) {
            days = 31;
        } else {
            System.out.println("Invalid month");
        }

        if (days != 0) {
            System.out.println(days + " days");
        }
    }
}

/*
Enter a month: 1
31 days

Process finished with exit code 0
----------
Enter a month: 5
31 days

Process finished with exit code 0
--------------
Enter a month: 2
28 days

Process finished with exit code 0
--------------
Enter a month: 31
Invalid month

Process finished with exit code 0

 */