/**
 *
 * File name: Accounting.java

 * Short description:  * Based on the user's selection,
 * the program performs the corresponding action and displays the updated balance.

 * IST 140 Assignment:  W5 PA - Accounting (Level 2)

 * @author Sai Rangineeni

 * @version 2/16/2023

 * date of last revision: 2/16/2023

 * details of the revision: 2/16/2023

 */

import java.util.Scanner;

public class Accounting {
    public static void main(String[] args) {
        // Initialize the account balance
        double balance = 1000.00;

        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Display the menu options to the user
        System.out.println("Enter the number of your desired transaction type.");
        System.out.println("1. Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdrawal");
        System.out.println("4. Quit");
        System.out.print("Enter choice: ");

        // user's choice
        int choice = input.nextInt();

        // Perform the action
        switch (choice) {
            case 1:
                // Display the current balance
                System.out.println("Your current balance is $" + balance);
                break;
            case 2:
                // Read the amount of deposit
                System.out.print("Enter the amount of deposit: $");
                double deposit = input.nextDouble();

                // Update the balance
                balance += deposit;

                // Display
                System.out.println("Your current balance is $" + balance);
                break;
            case 3:
                // Read
                System.out.print("Enter the amount of withdrawal: $");
                double withdrawal = input.nextDouble();

                // Check if the withdrawal amount is less than or equal to the balance
                if (withdrawal <= balance) {
                    // Update the balance
                    balance -= withdrawal;

                    // Display the updated balance
                    System.out.println("Your current balance is $" + balance);
                } else {
                    // Display an error message if there are insufficient funds
                    System.out.println("Insufficient funds. Your current balance is $" + balance);
                }
                break;
            case 4:
                // last message
                System.out.println("Good-bye.");
                break;
            default:
                // Invalid if picked diffrent number
                System.out.println("Invalid menu choice.");
                break;
        }

        // Close the Scanner object
        input.close();
    }
}

/*
 Enter the number of your desired transaction type.
1. Balance
2. Deposit
3. Withdrawal
4. Quit
Enter choice:

----------
Enter the number of your desired transaction type.
1. Balance
2. Deposit
3. Withdrawal
4. Quit
Enter choice: 1
Your current balance is $1000.0

Process finished with exit code 0
--------------
Enter the number of your desired transaction type.
1. Balance
2. Deposit
3. Withdrawal
4. Quit
Enter choice: 2
Enter the amount of deposit: $2000
Your current balance is $3000.0

Process finished with exit code 0
------------------
Enter the number of your desired transaction type.
1. Balance
2. Deposit
3. Withdrawal
4. Quit
Enter choice: 3
Enter the amount of withdrawal: $400
Your current balance is $600.0

Process finished with exit code 0
------------------

Enter the number of your desired transaction type.
1. Balance
2. Deposit
3. Withdrawal
4. Quit
Enter choice: 4
Good-bye.

Process finished with exit code 0
-------------
Enter the number of your desired transaction type.
1. Balance
2. Deposit
3. Withdrawal
4. Quit
Enter choice: 4
Good-bye.

Process finished with exit code 0
 */