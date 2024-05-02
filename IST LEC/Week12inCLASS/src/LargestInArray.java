import java.util.Scanner;

public class LargestInArray {
    public static void main(String[] args) {
        final int LENGTH = 100;
        double[] values = new double[LENGTH];
        int currentSize = 0;

        // Prompt to read inputs
        System.out.println("Please enter values, Q to quit:");

        // Read inputs
        currentSize = fillArray(values, currentSize);

        // Find the smallest and largest values
        double smallest = findSmallest(values, currentSize);
        double largest = findLargest(values, currentSize);

        // Print all values, marking the smallest and largest
        System.out.println();
        for (int i = 0; i < currentSize; i++) {
            System.out.printf("%.2f", values[i]);
            if (values[i] == smallest) {
                System.out.print(" <== smallest value");
            }
            if (values[i] == largest) {
                System.out.print(" <== largest value");
            }
            System.out.println();
        }

        // Print the smallest and largest values
        System.out.println("\nSmallest value: " + smallest);
        System.out.println("Largest value: " + largest);
    }

    public static int fillArray(double[] arr, int currentSize) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextDouble() && currentSize < arr.length) {
            arr[currentSize] = in.nextDouble();
            currentSize++;
        }
        return currentSize;
    }

    public static double findSmallest(double[] values, int currentSize) {
        double smallest = values[0];  // initialize - prep for comparison
        for (int i = 1; i < currentSize; i++) {
            if (values[i] < smallest) {
                smallest = values[i];
            }
        }
        return smallest;
    }

    public static double findLargest(double[] values, int currentSize) {
        double largest = values[0];  // initialize - prep for comparison
        for (int i = 1; i < currentSize; i++) {
            if (values[i] > largest) {
                largest = values[i];
            }
        }
        return largest;
    }
}

/*
324.00
3242.00 <== largest value
12.00
453.00
321.00
3.00 <== smallest value
63.00
45.00

Smallest value: 3.0
Largest value: 3242.0

Process finished with exit code 0
 */