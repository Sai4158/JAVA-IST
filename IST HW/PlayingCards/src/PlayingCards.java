/**
 File name: PlayingCards.java
 Short description: playing card based on its notation.
 IST 140 Assignment: W6 PA - PlayingCards (Level 2)
 @author Sai Rangineeni
 @version  2/23/2023
 date of last revision: 2/23/2023
 details of the revision: 2/23/2023
 */

import java.util.Scanner;

public class PlayingCards {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the card notation: ");
        String cardNotation = input.nextLine();

        // Determine the value of the card
        String value = "";
        switch (cardNotation.charAt(0)) {
            case 'A':
                value = "Ace";
                break;
            case '2':
                value = "Two";
                break;
            case '3':
                value = "Three";
                break;
            case '4':
                value = "Four";
                break;
            case '5':
                value = "Five";
                break;
            case '6':
                value = "Six";
                break;
            case '7':
                value = "Seven";
                break;
            case '8':
                value = "Eight";
                break;
            case '9':
                value = "Nine";
                break;
            case '1':
                if (cardNotation.charAt(1) == '0') {
                    value = "Ten";
                }
                break;
            case 'J':
                value = "Jack";
                break;
            case 'Q':
                value = "Queen";
                break;
            case 'K':
                value = "King";
                break;
            default:
                System.out.println("Invalid card value");
                System.exit(0);
        }

        // Determine the suit of the card
        String suit = "";
        switch (cardNotation.charAt(cardNotation.length() - 1)) {
            case 'D':
                suit = "Diamonds";
                break;
            case 'H':
                suit = "Hearts";
                break;
            case 'S':
                suit = "Spades";
                break;
            case 'C':
                suit = "Clubs";
                break;
            default:
                System.out.println("Invalid card suit");
                System.exit(0);
        }

        // Output the full description of the card
        System.out.println("Description: " + value + " of " + suit);
    }
}

/*
Enter the card notation: QS
Description: Queen of Spades

Process finished with exit code 0
---------------
Enter the card notation: 10D
Description: Ten of Diamonds

Process finished with exit code 0
----------------
Enter the card notation: KH
Description: King of Hearts

Process finished with exit code 0

 */