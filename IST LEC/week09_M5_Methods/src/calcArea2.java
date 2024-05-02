/**
 Calculates the area of a rectangle
 Case 2 Method Template:  no input, one return value
 @param none
 @return area
 */
public static double calcArea2()
        {
        // variable declaration and initialization
        double width, length, area;
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter a value for width: ");
        width = in.nextDouble();
        System.out.print("Please enter a value for length: ");
        length = in.nextDouble();

         // calculation
        area = width*length;

        return (area);
        }