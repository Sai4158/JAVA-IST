/**
	File name: ProgramTemplate.java
	Short description: Class to calculate the average of 3 numbers.
	IST 140 Assignment:  Enter Assignment # here
	@author Sai Rangineeni
	@version 1/18/2023
	date of last revision:
	details of the revision: none
*/

import java.util.Scanner;

public class ProgramTemplate
{
	public static void main (String[] args)
	{
		// Program description
		System.out.println("This program will calculate and display\n"
			+ "the average of any 3 numbers\n");

		// Declaring the variables: types and names
		int first, second, third, sum;
		float average;
		Scanner input = new Scanner(System.in);

		// Variable initialization: getting the input from the user
		System.out.println("Enter three numbers...");
		first = input.nextInt();
		second = input.nextInt();
		third = input.nextInt();

		// Calculations
		sum = first + second + third;
		average = (double) sum / 3.8;

		// Display the results
		System.out.println("The average of the numbers is " + average);
	}
}