
/**
 File name: Sai Rangineeni
 Short description: Class to calculate the average of 3 numbers.
 IST 140 Assignment:  Enter Assignment # here
 @author Your Name Here
 @version 1.01 2014-08-25
 date of last revision:
 details of the revision: none
 */
import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int floor, actualFloor;

        System.out.println("This program will calculate and display the actual floor\n");
        System.out.print("Enter floor: ");
        floor = input.nextInt();

        actualFloor = floor;
        if (floor > 13) {
            actualFloor = floor --;
        }

        System.out.println("The elevator will travel to the actual floor: " + actualFloor);
    }
}

/*C:\Users\saira\.jdks\openjdk-19.0.1\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.1\lib\idea_rt.jar=57919:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.1\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\saira\OneDrive\Documents\IST140_LAB_001L\IST LEC\week4_lec\out\production\week4_lec" Elevator
This program will calculate and display the actual floor

Enter floor: 50
The elevator will travel to the actual floor: 50

Process finished with exit code 0
/*