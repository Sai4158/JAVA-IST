/**
 * File name: ECommerceApp.java
 * Short description: This program represents an eCommerce application that allows users to order products.
 * IST 140 Assignment: W12 PA - ECommerceApp (Level 3)
 * @author Sai Rangineeni
 * @version 4/12/2023
 * date of last revision: 4/13/2023
 * details of the revision: Done!
 */

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class ECommerceApp {
    // The main method is the starting point of the program
    public static void main(String[] args) {
        // Call the bannerPrinter method to print the welcome banner
        bannerPrinter();
        // Call the productsBuilder method to create a list of available products
        ArrayList<String> productsCatalog = productsBuilder();
        // Call the getOrder method to get the user's selected product and check if it exists
        boolean productExists = getOrder(productsCatalog);

        // If the selected product exists, calculate the price, tax, and total and print the total
        if (productExists) {
            double price = getPrice();
            double tax = getTax(price);
            double total = getTotal(price, tax);
            printTotal(total);
        } else {
            // If the selected product does not exist, print a message to inform the user
            System.out.println("The product was not found.");
        }
    }

    // This method prints a welcome banner
    public static void bannerPrinter() {
        System.out.println("******************************************");
        System.out.println("====== Welcome to my eCommerce app! ======");
        System.out.println("******************************************");
        System.out.println();
    }

    // This method creates an ArrayList of available products
    public static ArrayList<String> productsBuilder() {
        ArrayList<String> productsCatalog = new ArrayList<>();
        productsCatalog.add("Laptop");
        productsCatalog.add("Keyboard");
        productsCatalog.add("Mouse");
        productsCatalog.add("Monitor");
        productsCatalog.add("Headphones");
        return productsCatalog;
    }

    // This method prompts the user to select a product and returns true if the product exists in the catalog
    public static boolean getOrder(ArrayList<String> productsCatalog) {
        // Print the list of available products
        System.out.println("Available products:");
        for (int i = 0; i < productsCatalog.size(); i++) {
            System.out.println((i + 1) + ". " + productsCatalog.get(i));
        }

        // Prompt the user to enter a product name and read the input using a Scanner
        System.out.print("\nEnter the product name: ");
        Scanner scanner = new Scanner(System.in);
        String productName = scanner.nextLine();
        // Check if the selected product exists in the catalog
        return productsCatalog.contains(productName);
    }

    // This method generates a random price between $1 and $100
    public static double getPrice() {
        Random random = new Random();
        return 1 + random.nextDouble() * 100;
    }

    // This method calculates the tax based on the price (10%)
    public static double getTax(double price) {
        return price * 0.1;
    }

    // This method calculates the total price (price + tax)
    public static double getTotal(double price, double tax) {
        return price + tax;
    }

    // This method prints the total price in a formatted string
    public static void printTotal(double total) {
        System.out.printf("Your sale total is: $%.2f%n", total);
    }
}

/*
******************************************
====== Welcome to my eCommerce app! ======
******************************************

Available products:
1. Laptop
2. Keyboard
3. Mouse
4. Monitor
5. Headphones

Enter the product name: Laptop
Your sale total is: $37.72

Process finished with exit code 0
------------------
*
*
******************************************
====== Welcome to my eCommerce app! ======
******************************************

Available products:
1. Laptop
2. Keyboard
3. Mouse
4. Monitor
5. Headphones

Enter the product name: Keyboard
Your sale total is: $24.29

Process finished with exit code 0
--------------------
******************************************
====== Welcome to my eCommerce app! ======
******************************************

Available products:
1. Laptop
2. Keyboard
3. Mouse
4. Monitor
5. Headphones

Enter the product name: Mouse
Your sale total is: $30.69

Process finished with exit code 0
-----------------------
*
******************************************
====== Welcome to my eCommerce app! ======
******************************************

Available products:
1. Laptop
2. Keyboard
3. Mouse
4. Monitor
5. Headphones

Enter the product name: Monitor
Your sale total is: $52.98

Process finished with exit code 0
---------------------

******************************************
====== Welcome to my eCommerce app! ======
******************************************

Available products:
1. Laptop
2. Keyboard
3. Mouse
4. Monitor
5. Headphones

Enter the product name: Smartphone
The product was not found.

Process finished with exit code 0
 */