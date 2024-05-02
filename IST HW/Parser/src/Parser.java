/**
 * File name: Parser.java
 * Short description: This program reads a comma-delimited string of doubles, converts it into an ArrayList,
 *                    and prints the doubles.
 * IST 140 Assignment: W12 PA - Parser (Level 2)
 * @author Sai Rangineeni
 * @version 4/13/2023
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Parser {
    public static void main(String[] args) {
        // Call the getString method to get the user input string
        String inputString = getString();
        // Call the getList method to parse the input string into an ArrayList of doubles
        ArrayList<Double> doubleList = getList(inputString);
        // Call the printDoubles method to print the parsed doubles
        printDoubles(doubleList);
    }

    // This method prompts the user to enter a comma-delimited string of doubles and returns the input string
    public static String getString() {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter a comma-delimited string of doubles:");
        String inputString = scnr.nextLine();
        scnr.close();
        return inputString;
    }

    // This method parses the input string into an ArrayList of doubles and returns the list
    public static ArrayList<Double> getList(String data) {
        Scanner inString = new Scanner(data);
        inString.useDelimiter(", *"); // set the delimiter to comma followed by zero or more spaces
        ArrayList<Double> doubleList = new ArrayList<>();

        // Read each double from the input string and add it to the list
        while (inString.hasNextDouble()) {
            doubleList.add(inString.nextDouble());
        }
        inString.close();

        return doubleList;
    }

    // This method prints the parsed doubles in the ArrayList
    public static void printDoubles(ArrayList<Double> list) {
        System.out.println("Parsed doubles:");
        // Iterate over the list and print each double with a width of 8 and 2 decimal places
        for (Double d : list) {
            System.out.printf("%8.2f%n", d);
        }
    }
}


/*
Enter the comma-delimited string of doubles: 4.5, 8.6, 16.25, 32.0

Doubles in the list:
 4.50
 8.60
16.25
32.00

Process finished with exit code 0
----------
Enter the comma-delimited string of doubles: 3.14, 6.28, 12.56, 25.12, 50.24

Doubles in the list:
 3.14
 6.28
12.56
25.12
50.24

Process finished with exit code 0
--------------
Enter a comma-delimited string of doubles:
hello
Parsed doubles:

Process finished with exit code 0

 */