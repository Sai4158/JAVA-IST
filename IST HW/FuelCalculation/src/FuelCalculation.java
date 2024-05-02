/**
 File name: FuelCalculation.java

 Short description: Calculates the distance a car can travel based on the number of
 gallons of gas in the tank and the car's fuel efficiency and calculates the cost
 of traveling 50 miles based on the price of gas per gallon.

 IST 140 Assignment:  W2 PA - FuelCalculation (Level 1)
 @author Sai Rangineeni
 @version 1/27/2023
 date of last revision: 1/27/2023
 details of the revision: 1/27/2023 -  Completed the code, done!
 */
import java.util.Scanner;

public class FuelCalculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of gallons of gas in the tank: ");
        double gallons = input.nextDouble();

        System.out.print("Enter the fuel efficiency of the car in miles per gallon: ");
        double efficiency = input.nextDouble();

        System.out.print("Enter the price of gas per gallon: ");
        double price = input.nextDouble();

        double distance = gallons * efficiency;
        System.out.printf("You are able to travel %.2f miles on remaining fuel.\n", distance);

        double travelCost = 50 / efficiency * price;
        System.out.printf("It will cost $%.2f to travel 50 miles in the vehicle.\n", travelCost);
    }
}

/*
Enter the number of gallons of gas in the tank: 10
Enter the fuel efficiency of the car in miles per gallon: 55
Enter the price of gas per gallon: 3.5
You are able to travel 550.00 miles on remaining fuel.
It will cost $3.18 to travel 50 miles in the vehicle.

Process finished with exit code 0
 */
