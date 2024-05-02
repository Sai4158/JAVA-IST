/**
 * File name: MinMaxInArrayList.java
 * Short description: This program demonstrates a Java application called "MinMaxInArrayList" that
 * declares an ArrayList of doubles, and performs each of the following processes
 * using a separate method containing a loop to handle each process:
 *
 * IST 140 Assignment: W13 - PA: MinMaxInArrayList (Level 2)
 * author: Sai Rangineeni
 * version: 4/19/2023
 * date of last revision: 4/20/2023
 * details of the revision: Done
 */

import java.util.ArrayList;
import java.util.Scanner;

public class MinMaxInArrayList {
    public static void main(String[] args) {
        // declare and populate ArrayList
        ArrayList<Double> myList = populateList();

        // find maximum and minimum values in ArrayList
        double max = findMax(myList);
        double min = findMin(myList);

        // print ArrayList and the lowest and highest values
        printResults(myList, max, min);
    }

    //Populates the ArrayList with user input.

    public static ArrayList<Double> populateList() {
        ArrayList<Double> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        double value;

        System.out.println("Enter numbers (enter -1 to stop):");
        // read input from user and add to ArrayList until -1 is entered
        while ((value = input.nextDouble()) != -1) {
            list.add(value);
        }

        return list;
    }

    // Finds the maximum value in the given ArrayList.

    public static double findMax(ArrayList<Double> list) {
        double max = list.get(0);
        // loop through the ArrayList and find the maximum value
        for (double number : list) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }

    // Finds the minimum value in the given ArrayList.

    public static double findMin(ArrayList<Double> list) {
        double min = list.get(0);
        // loop through the ArrayList and find the minimum value
        for (double number : list) {
            if (number < min) {
                min = number;
            }
        }
        return min;
    }

    //Prints the ArrayList and the lowest and highest values.

    public static void printResults(ArrayList<Double> list, double max, double min) {
        System.out.println("ArrayList: " + list);
        System.out.println("Max value: " + max);
        System.out.println("Min value: " + min);
    }
}

/*
Enter numbers (enter -1 to stop):
 56 665 4 76 5
-1
ArrayList: [56.0, 665.0, 4.0, 76.0, 5.0]
Max value: 665.0
Min value: 4.0

Process finished with exit code 0
-------------------
Enter numbers (enter -1 to stop):
3.14 1
-1
ArrayList: [3.14, 1.0]
Max value: 3.14
Min value: 1.0

Process finished with exit code 0
---------------
Enter numbers (enter -1 to stop):
2.5 3.7 -8.9 0 10.1 -1
ArrayList: [2.5, 3.7, -8.9, 0.0, 10.1]
Max value: 10.1
Min value: -8.9

Process finished with exit code 0
-------------
Enter numbers (enter -1 to stop):
10 20 30 40 50 -1
ArrayList: [10.0, 20.0, 30.0, 40.0, 50.0]
Max value: 50.0
Min value: 10.0

Process finished with exit code 0
 */