import java.util.Scanner;

public class calcArea3 {

    public static void calcArea() {
        // variable declaration and initialization
        Scanner input = new Scanner(System.in);
        double width, length;

        System.out.print("Enter length of rectangle: ");
        length = input.nextDouble();

        System.out.print("Enter width of rectangle: ");
        width = input.nextDouble();

        // call the calcArea method with the length and width values
        calcArea(width, length);
    }

    /**
     * Calculates the area of a rectangle
     * Case 3 Method Template:  inputs, no return value
     * @param length the size of one side
     * @param width the size of a perpendicular side
     */
    public static void calcArea(double width, double length) {
        // variable declaration and initialization
        double area;

        // calculation
        area = width * length;

        // display the result
        System.out.printf("Area of rectangle with width %.2f length %.2f is %.2f\n", width, length, area);
    }

    /**
     * Calculates the area of a rectangle
     * Case 2 Method Template:  no input, one return value
     * @return area
     */
    public static double calcArea() {
        // variable declaration and initialization
        double width = 5.0;
        double length = 10.0;
        double area;

        // calculation
        area = width * length;

        // return the result
        return area;
    }
}
