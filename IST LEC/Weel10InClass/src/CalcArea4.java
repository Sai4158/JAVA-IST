import java.util.Scanner;

public class calcArea4 {

    // This method describes the program
    public static void programDesc() {
        System.out.println("This program calculates the area of a rectangle.");
    }

    public static void calcArea() {
        programDesc();
        Scanner input = new Scanner(System.in);
        double length, width, area;

        System.out.print("Enter length of rectangle: ");
        length = input.nextDouble();

        System.out.print("Enter width of rectangle: ");
        width = input.nextDouble();

        // call the calcArea method with the length and width values
        area = calcArea(length, width);
        System.out.println("The area of the rectangle is: " + area);
    }

    /**
     * Calculates the area of a rectangle
     * Case 4 Method Template:  inputs, one return value
     * @param length the size of one side
     * @param width the size of a perpendicular side
     * @return area
     */
    public static double calcArea(double length, double width) {
        // variable declaration and initialization
        double area;
        // calculation
        area = width * length;
        // return the result
        return area;
    }
}
