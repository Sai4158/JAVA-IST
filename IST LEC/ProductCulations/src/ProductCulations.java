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
public class ProductCulations
{
    public static void main (String[] args)
    {
// Program description

// Declaring the variables: types and names
int product
        
// Variable initialization: getting the input from the user
        System.out.println("Enter start integer");
        Start = input.nextInt();
        System.out.println("enter stop integer");
        stop = input.nextInt();

        if (start >= stop) {
            System.out.println("Value of start must be less than stop");
            System.exit(1);
        }
// Calculations
        product (int i = start; i <= stop; i++){
            product *=i;

    }

// Display the results
        System.out.println(product);
    }
}