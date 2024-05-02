/**
 File name: RecursiveTriangle.java

 Short description: The RecursiveTriangle program prompts the user for the number of lines to print
 and the String used for printing the triangle, and then uses recursion to print a "reversed triangle" pattern.

 IST 140 Assignment: W11 PA - RecursiveTriangle (Level 2)

 @author Sai Rangineeni
 @version 4/3/2023
 date of last revision: 4/6/2023
 details of the revision: finshed
 */
import java.util.Scanner;

public class RecursiveTriangle {

    /**
     * Prompts the user for the number of lines to print and validates input until a valid value is entered.
     * @return The number of lines to print.
     */
    public static int getNumLines() {
        Scanner input = new Scanner(System.in);
        int numLines = 0;
        boolean validInput = false;
        while (!validInput) {
            System.out.print("Enter the number of lines to print (between 5 and 20): ");
            if (input.hasNextInt()) {
                numLines = input.nextInt();
                if (numLines >= 5 && numLines <= 20) {
                    validInput = true;
                } else {
                    System.out.println("Error: Number of lines must be between 5 and 20.");
                }
            } else {
                input.next();
                System.out.println("Error: Please enter an integer value.");
            }
        }
        return numLines;
    }

    /**
     * Prompts the user for the string to be used when printing the pattern and validates input to ensure
     * * @return The String used for printing the pattern.
     */
    public static String getPattern() {
        Scanner input = new Scanner(System.in);
        String pattern = "";
        boolean validInput = false;
        while (!validInput) {
            System.out.print("Enter the String to use for printing the pattern (must be at least 2 characters): ");
            pattern = input.nextLine();
            if (pattern.length() >= 2) {
                validInput = true;
            } else {
                System.out.println("Error: Pattern must be at least 2 characters.");
            }
        }
        return pattern;
    }

    /**
     * Uses recursion to print the "reversed triangle" pattern.
     * @param numLines The number of lines to print.
     * @param pattern The String used for printing the pattern.
     */
    public static void printTriangle(int numLines, String pattern) {
        if (numLines == 0) {
            return;
        }
        for (int i = 0; i < numLines; i++) {
            System.out.print(pattern);
        }
        System.out.println();
        printTriangle(numLines - 1, pattern);
    }

    /**
     * method to print the pattern.
     */
    public static void main(String[] args) {
        int numLines = getNumLines();
        String pattern = getPattern();
        printTriangle(numLines, pattern);
    }
}

/*
Enter the number of lines to print (between 5 and 20): 7
Enter the String to use for printing the pattern (must be at least 2 characters): te
tetetetetetete
tetetetetete
tetetetete
tetetete
tetete
tete
te

Process finished with exit code 0
------------------------
Enter the number of lines to print (between 5 and 20): 6
Enter the String to use for printing the pattern (must be at least 2 characters): hello
hellohellohellohellohellohello
hellohellohellohellohello
hellohellohellohello
hellohellohello
hellohello
hello

Process finished with exit code 0

------------------------
Enter the number of lines to print (between 5 and 20): 20
Enter the String to use for printing the pattern (must be at least 2 characters): D O G
D O GD O GD O GD O GD O GD O GD O GD O GD O GD O GD O GD O GD O GD O GD O GD O GD O GD O GD O GD O G
D O GD O GD O GD O GD O GD O GD O GD O GD O GD O GD O GD O GD O GD O GD O GD O GD O GD O GD O G
D O GD O GD O GD O GD O GD O GD O GD O GD O GD O GD O GD O GD O GD O GD O GD O GD O GD O G
D O GD O GD O GD O GD O GD O GD O GD O GD O GD O GD O GD O GD O GD O GD O GD O GD O G
D O GD O GD O GD O GD O GD O GD O GD O GD O GD O GD O GD O GD O GD O GD O GD O G
D O GD O GD O GD O GD O GD O GD O GD O GD O GD O GD O GD O GD O GD O GD O G
D O GD O GD O GD O GD O GD O GD O GD O GD O GD O GD O GD O GD O GD O G
D O GD O GD O GD O GD O GD O GD O GD O GD O GD O GD O GD O GD O G
D O GD O GD O GD O GD O GD O GD O GD O GD O GD O GD O GD O G
D O GD O GD O GD O GD O GD O GD O GD O GD O GD O GD O G
D O GD O GD O GD O GD O GD O GD O GD O GD O GD O G
D O GD O GD O GD O GD O GD O GD O GD O GD O G
D O GD O GD O GD O GD O GD O GD O GD O G
D O GD O GD O GD O GD O GD O GD O G
D O GD O GD O GD O GD O GD O G
D O GD O GD O GD O GD O G
D O GD O GD O GD O G
D O GD O GD O G
D O GD O G
D O G

Process finished with exit code 0

 */