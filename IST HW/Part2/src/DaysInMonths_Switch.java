/**
 *
 * File name: DaysInMonths_Switch

 * Short description:  enter month finds the days in a month

 * IST 140 Assignment:  W6 - Lab: DaysInMonths (Horstmann p 130)

 * @author Sai Rangineeni

 * @version 2/13/2023

 * date of last revision: 2/16/2023

 * details of the revision: 2/16/2023

 */

import java.util.Scanner;

public class DaysInMonths_Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a month: ");
        int month = input.nextInt();

        int days = 0;
        switch (month) {
            case 1:
                days = 31;
                break;
            case 2:
                days = 28;
                break;
            case 3:
                days = 31;
                break;
            case 4:
                days = 30;
                break;
            case 5:
                days = 31;
                break;
            case 6:
                days = 30;
                break;
            case 7:
                days = 31;
                break;
            case 8:
                days = 31;
                break;
            case 9:
                days = 30;
                break;
            case 10:
                days = 31;
                break;
            case 11:
                days = 30;
                break;
            case 12:
                days = 31;
                break;
            default:
                System.out.println("Invalid month");
                break;
        }

        if (days != 0) {
            System.out.println(days + " days");
        }
    }
}



/*
Enter a month: 12
31 days

Enter a month: 11
30 days

Enter a month: 6
30 days
 */