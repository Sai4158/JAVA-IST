/**
 * File name: WeightedAvgDropSmallest.java
 * Short description: This Java program prompts the user for five to ten numbers, calculates the weighted
 * average of all those numbers except the lowest n numbers.
 *
 * IST 140 Assignment: WeightedAvgDropSmallest
 * author: Sai Rangineeni
 * version: 1.0
 * date of last revision: 4/30/2023
 * details of the revision: Done
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WeightedAvgDropSmallest {

    // Get the numbers from the user and return as an ArrayList of doubles
    public static ArrayList<Double> getNumbers() {
        ArrayList<Double> data = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int size;

        // Keep prompting for input until the user provides between 5 and 10 numbers
        do {
            System.out.print("Please enter 5 to 10 numbers separated by spaces: ");
            String inputStr = input.nextLine();
            String[] tokens = inputStr.split(" ");

            // Parse the input string and add numbers to the list
            for (String token : tokens) {
                try {
                    data.add(Double.parseDouble(token));
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter numbers only.");
                }
            }

            size = data.size();
            if (size < 5 || size > 10) {
                System.out.println("Invalid number of inputs. Please enter between 5 and 10 numbers.");
                data.clear();
            }
        } while (size < 5 || size > 10);

        return data;
    }

    // Get the number of lowest numbers to drop before calculating the average
    public static int getNumLowest() {
        Scanner input = new Scanner(System.in);
        int lowest;

        // Keep prompting for input until the user provides a valid number
        do {
            System.out.print("Please enter the number of lowest values to drop (>= 0): ");
            lowest = input.nextInt();
            if (lowest < 0) {
                System.out.println("Invalid input. Please enter a number greater than or equal to 0.");
            }
        } while (lowest < 0);

        return lowest;
    }

    // Get the weight to use for calculating the weighted average
    public static double getWeight() {
        Scanner input = new Scanner(System.in);
        double weight;

        // Keep prompting for input until the user provides a valid weight
        do {
            System.out.print("Please enter the weight (0 < weight <= 1): ");
            weight = input.nextDouble();
            if (weight <= 0.0 || weight > 1.0) {
                System.out.println("Invalid input. Please enter a weight between 0 and 1.");
            }
        } while (weight <= 0.0 || weight > 1.0);

        return weight;
    }

    // Calculate the weighted average of the numbers except the lowest n numbers
    public static double calcWeightedAverage(ArrayList<Double> numbers, int numToDrop, double weight) {
        ArrayList<Double> sortedNumbers = new ArrayList<>(numbers);
        Collections.sort(sortedNumbers);
        double sum = 0.0;
        int count = 0;

        // Sum the numbers except the lowest n numbers
        for (int i = numToDrop; i < sortedNumbers.size(); i++) {
            sum += sortedNumbers.get(i);
            count++;
        }

        // Return the weighted average
        return (sum / count) * weight;
    }
    // Print the results including the weighted average and the dropped numbers
    public static void printResults(ArrayList<Double> numbers, int numToDrop, double weightedAverage) {
        ArrayList<Double> sortedNumbers = new ArrayList<>(numbers);
        Collections.sort(sortedNumbers);

        // Print the weighted average
        System.out.printf("The weighted average of the numbers (excluding the lowest %d) is: %.2f\n", numToDrop, weightedAverage);

        // Print the dropped numbers
        System.out.print("The lowest " + numToDrop + " dropped numbers are: ");
        for (int i = 0; i < numToDrop; i++) {
            System.out.print(sortedNumbers.get(i) + (i == numToDrop - 1 ? "\n" : ", "));
        }
    }

    public static void main(String[] args) {
        // Get the numbers from the user

        ArrayList<Double> numbers = getNumbers();
        // Get the number of lowest numbers to drop
        int numLowest = getNumLowest();
        // Get the weight for the weighted average
        double weight = getWeight();

        // Calculate the weighted average
        double weightedAverage = calcWeightedAverage(numbers, numLowest, weight);

        // Print the results
        printResults(numbers, numLowest, weightedAverage);
    }
}




/*
Please enter 5 to 10 numbers separated by spaces: 1 2 3 4 5
Please enter the number of lowest values to drop (>= 0): 1
Please enter the weight (0 < weight <= 1): 0.5
The weighted average of the numbers (excluding the lowest 1) is: 1.75
The lowest 1 dropped numbers are: 1.0

Process finished with exit code 0
------------
Please enter 5 to 10 numbers separated by spaces: 10 20 30 40 50
Please enter the number of lowest values to drop (>= 0): 2
Please enter the weight (0 < weight <= 1): 0.8
The weighted average of the numbers (excluding the lowest 2) is: 32.00
The lowest 2 dropped numbers are: 10.0, 20.0

Process finished with exit code 0
-------------------
Please enter 5 to 10 numbers separated by spaces: 3.3 4.4 5.5 6.6 7.7 8.8 9.9
Please enter the number of lowest values to drop (>= 0): 1
Please enter the weight (0 < weight <= 1): 1.0
The weighted average of the numbers (excluding the lowest 1) is: 7.15
The lowest 1 dropped numbers are: 3.3

Process finished with exit code 0
-------------------
Please enter 5 to 10 numbers separated by spaces: 23213123
Invalid number of inputs. Please enter between 5 and 10 numbers.
Please enter 5 to 10 numbers separated by spaces: 2313
Invalid number of inputs. Please enter between 5 and 10 numbers.
Please enter 5 to 10 numbers separated by spaces: 213123
Invalid number of inputs. Please enter between 5 and 10 numbers.
Please enter 5 to 10 numbers separated by spaces:
--------------------------
Please enter 5 to 10 numbers separated by spaces: 1 2 3 4 5
Please enter the number of lowest values to drop (>= 0): 322
Please enter the weight (0 < weight <= 1): 322
Invalid input. Please enter a weight between 0 and 1.
Please enter the weight (0 < weight <= 1): 2234
Invalid input. Please enter a weight between 0 and 1.
Please enter the weight (0 < weight <= 1):
 */