/**
 File name: Week9InClass
 Short description: Class to calculate the average of 3 numbers.
 IST 140 Assignment: Enter Assignment # here
 @author Your Name Here
 @version 1.-+01 2014-08-25
 date of last revision:
 details of the revision: none
 */
import java.util.Scanner;
public class Week9InClass
{
    public static void main (String[] args)
    {
// Program description
        System.out.println();
        // Declaring the variables: types and names
        final int SIZE = 7;
        int row, column;
        Scanner input = new Scanner(System.in);

        // Variable initialization: getting the input from the user
        int[][] matrix = new int[SIZE][SIZE];

        // Calculations: populating the matrix with random integers
        for (row = 0; row < SIZE; row++) {
            for (column = 0; column < SIZE; column++) {
                matrix[row][column] = (int) (Math.random() * 10);
            }
        }

        // Display the results: printing the matrix
        for (row = 0; row < SIZE; row++) {
            for (column = 0; column < SIZE; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }
    }
