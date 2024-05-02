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
public class DiscountedPrice
{
    public static void main (String[] args)
    {
// Program description
        System.out.println("This program will calculate and display\n"
                + "the average of any 3 numbers\n");
// Declaring the variables: types and names
        double origPrice;
        double discRate;
        double discPrice;
        
        Scanner input = new Scanner(System.in);
// Variable initialization: getting the input from the user
        System.out.println("Enter three numbers...");
        first = input.nextInt();
        second = input.nextInt();
        third = input.nextInt();
// Calculations
        sum = first + second + third;
        average = (float) sum / 3.0f;
// Display the results
        System.out.println("The average of the numbers is " + average);
    }
}