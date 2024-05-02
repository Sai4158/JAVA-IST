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

public class ShipClass {
    public static void main(String[] args) {
        System.out.println("This program will determine the class of a ship based on its code.");

        Scanner input = new Scanner(System.in);
        char code;

        System.out.println("Enter a valid ship code: ");
        code = input.next().charAt(0);

        if (code == 'B') {
            System.out.println("The ship is a Battleship.");
        } else if (code == 'R') {
            System.out.println("The ship is a Cruiser.");
        } else if (code == 'D') {
            System.out.println("The ship is a Destroyer.");
        } else if (code == 'F') {
            System.out.println("The ship is a Frigate.");
        } else {
            System.out.println("The ship class is unknown.");


        }
    }
}
}