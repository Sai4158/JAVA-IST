/**
 * File name: ArrayCalculations.java
 * Short description: This program calculates and displays the average of user
 *provided values for each row of a 6x2 two-dimensional array using methods and nested loops.

 * IST 140 Assignment: W13 PA - ArrayCalculations (Level 3)
 * author: Sai Rangineeni
 * version: 4/19/2023
 * date of last revision: 4/20/2023
 * details of the revision: Done
 */
import java.util.Scanner;

public class ArrayCalculations {

    public static void main(String[] args) {
        // Call the getDoubles method to get the user input and store the 2D array in scores
        double[][] scores = getDoubles();
        // Call the getAverages method to compute the averages for each row and store the 1D array in averages
        double[] averages = getAverages(scores);
        // Call the displayAverages method to display the computed averages
        displayAverages(averages);
    }

    public static double[][] getDoubles() {
        Scanner input = new Scanner(System.in);
        double[][] numbers = new double[6][2];

        int i = 0;
        // Loop through each row
        while (i < 6) {
            int j = 0;
            // Loop through each column in the current row
            while (j < 2) {
                System.out.print("Enter the value for row " + (i + 1) + ", column " + (j + 1) + ": ");
                numbers[i][j] = input.nextDouble();
                j++;
            }
            i++;
        }

        return numbers;
    }

    public static double[] getAverages(double[][] numbers) {
        double[] averages = new double[6];

        // Loop through each row
        for (int i = 0; i < 6; i++) {
            double sum = 0;
            // Loop through each column in the current row and calculate the sum
            for (int j = 0; j < 2; j++) {
                sum += numbers[i][j];
            }
            // Calculate the average for the current row and store it in the averages array
            averages[i] = sum / 2;
        }

        return averages;
    }

    public static void displayAverages(double[] avg) {
        System.out.println("Averages for each row:");
        // Loop through the averages array and display the average for each row
        for (int i = 0; i < avg.length; i++) {
            System.out.println("Row " + (i + 1) + ": " + avg[i]);
        }
    }
}
/*
Enter the value for row 1, column 1: 10
Enter the value for row 1, column 2: 20
Enter the value for row 2, column 1: 43
Enter the value for row 2, column 2: 435
Enter the value for row 3, column 1: 32
Enter the value for row 3, column 2: 432
Enter the value for row 4, column 1: 4324
Enter the value for row 4, column 2: 24
Enter the value for row 5, column 1: 34
Enter the value for row 5, column 2: 324
Enter the value for row 6, column 1: 234
Enter the value for row 6, column 2: 235
Averages for each row:
Row 1: 15.0
Row 2: 239.0
Row 3: 232.0
Row 4: 2174.0
Row 5: 179.0
Row 6: 234.5


Process finished with exit code 0
----------------------
Enter the value for row 1, column 1: 10
Enter the value for row 1, column 2: 20
Enter the value for row 2, column 1: 30
Enter the value for row 2, column 2: 40
Enter the value for row 3, column 1: 50
Enter the value for row 3, column 2: 60
Enter the value for row 4, column 1: 70
Enter the value for row 4, column 2: 80
Enter the value for row 5, column 1: 90
Enter the value for row 5, column 2: 100
Enter the value for row 6, column 1: 110
Enter the value for row 6, column 2: 120
Averages for each row:
Row 1: 15.0
Row 2: 35.0
Row 3: 55.0
Row 4: 75.0
Row 5: 95.0
Row 6: 115.0

Process finished with exit code 0
--------------------
Enter the value for row 1, column 1: 1
Enter the value for row 1, column 2: 2
Enter the value for row 2, column 1: 3
Enter the value for row 2, column 2: 4
Enter the value for row 3, column 1: 5
Enter the value for row 3, column 2: 6
Enter the value for row 4, column 1: 7
Enter the value for row 4, column 2: 8
Enter the value for row 5, column 1: 9
Enter the value for row 5, column 2: 10
Enter the value for row 6, column 1: 11
Enter the value for row 6, column 2: 12
Averages for each row:
Row 1: 1.5
Row 2: 3.5
Row 3: 5.5
Row 4: 7.5
Row 5: 9.5
Row 6: 11.5

Process finished with exit code 0
------------------------

"C:\Program Files\Java\jdk-19\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.3\lib\idea_rt.jar=51798:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.3\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\saira\OneDrive - The Pennsylvania State University\Documents\IST140_LAB_001L\IST HW\ArrayCalculations\out\production\ArrayCalculations" ArrayCalculations
Enter the value for row 1, column 1: 1
Enter the value for row 1, column 2: 1
Enter the value for row 2, column 1: 1
Enter the value for row 2, column 2: 1
Enter the value for row 3, column 1: 1
Enter the value for row 3, column 2: 1
Enter the value for row 4, column 1: 1
Enter the value for row 4, column 2: 1
Enter the value for row 5, column 1: 1
Enter the value for row 5, column 2: 1
Enter the value for row 6, column 1: 1
Enter the value for row 6, column 2: 1
Averages for each row:
Row 1: 1.0
Row 2: 1.0
Row 3: 1.0
Row 4: 1.0
Row 5: 1.0
Row 6: 1.0

Process finished with exit code 0

 */