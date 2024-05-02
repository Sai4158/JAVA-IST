/**
 * File name: ReverseString.java
 * Short description: Class to reverse a string.
 * IST 140 Assignment: Enter Assignment # here
 * @author Your Name Here
 * @version 1.01 2014-08-25
 * Date of last revision: 
 * Details of the revision: none
 */

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        // Program description

        // Declaring the variables: types and names
        String inputStr;
        String outputStr = "";
        Scanner input = new Scanner(System.in);

        // Variable initialization: getting the input from the user
        System.out.println("Enter a string:");
        inputStr = input.nextLine();

        // Calculations
        for (int i = inputStr.length() - 1; i >= 0; i--) {
            outputStr = outputStr + inputStr.charAt(i);
        }

        // Display the results
        System.out.println("The reversed string is: " + outputStr);
    }
}
