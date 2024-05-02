/**
 File name: cicrum
 Short description: To convert area of the circle to radius
 @author Sai Rangineeni
 @version 1.01 2014-08-25
 date of last revision:1/25/2023
 details of the revision: none
 */
import java.util.Scanner;
public class inClassCircle
{
    public static void main (String[] args)
    {
// Program description
        System.out.println("This program will calculate and display\n"
                + "the average of any 3 numbers\n");
// Declaring the variables: types and names
        int first, second, third, sum;
        float average;
        double radius, area, circumference;
        Scanner input = new Scanner(System.in);
// Variable initialization: getting the input from the user
        System.out.println("Enter the radius...");
        radius = input.nextDouble();

// Calculations
        area = Math.PI * Math.pow(radius, 2.0);
        circumference = Math.PI * 2 * radius;

// Display the results
        System.out.println("The area of the circle with a radius of  " + radius + " is " + area);
        System.out.println("the circumfernce of a circle with a radius of" + radius + " is " + circumference + ".");
    }
}

/*
C:\Users\saira\.jdks\openjdk-19.0.1\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.1\lib\idea_rt.jar=52833:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.1\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\saira\OneDrive\Documents\IST140_LAB_001L\IST LEC\cicrum\out\production\cicrum" inClassCircle
This program will calculate and display
the average of any 3 numbers

Enter the radius...
6
The area of the circle with a radius of  6.0 is 113.09733552923255
the circumfernce of a circle with a radius of6.0 is 37.69911184307752.

Process finished with exit code 0
 */