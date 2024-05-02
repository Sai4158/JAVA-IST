/**
 File name: PasswordChecker.java
 Short description: The "PasswordChecker" program is a Java application that verifies the compliance of a password
 entered by the user with a set password policy
 IST 140 Assignment: W5 PA - PasswordChecker (Level 2)
 @author Sai Rangineeni
 @version 2023-05-03
 date of last revision: 2023-05-03
 details of the revision: Corrected the code
 */
import java.util.Scanner;

public class PatternMaker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for number of rows
        System.out.print("Enter the number of rows (5-15): ");
        int numRows = input.nextInt();

        // Prompt user for number of columns
        System.out.print("Enter the number of columns (5-20): ");
        int numCols = input.nextInt();

        // Validate numCols >= numRows
        while (numCols < numRows) {
            System.out.print("Number of columns must be greater than or equal to number of rows. Please enter a valid number of columns: ");
            numCols = input.nextInt();
        }

        // Prompt user for first string
        System.out.print("Enter the first string of the pattern: ");
        String firstString = input.next();

        // Prompt user for second string
        System.out.print("Enter the second string of the pattern: ");
        String secondString = input.next();

        // Prompt user for separator string
        System.out.print("Enter the separator string: ");
        String separator = input.next();

        // Print triangular pattern
        for (int i = 0; i < numRows; i++) {
            int colLimit = numCols - i;
            for (int j = 0; j < colLimit; j++) {
                // Determine which string to print for the current column
                String toPrint = (i % 2 == 0) ^ (j % 2 == 0) ? firstString : secondString;

                // Print the string and separator, except for the last column
                System.out.print(toPrint);
                if (j != colLimit - 1) {
                    System.out.print(separator);
                }
            }
            // Print newline character at the end of each row
            System.out.println();
        }
    }
}


/*
"C:\Program Files\Java\jdk-19\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.3\lib\idea_rt.jar=53095:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.3\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\saira\OneDrive - The Pennsylvania State University\Documents\IST140_LAB_001L\PatternMaker\out\production\PatternMaker" PatternMaker
Enter the number of rows (5-15): 5
Enter the number of columns (5-20): 7
Enter the first string of the pattern: MM
Enter the second string of the pattern: OO
Enter the separator string: ***
OO***MM***OO***MM***OO***MM***OO
MM***OO***MM***OO***MM***OO
OO***MM***OO***MM***OO
MM***OO***MM***OO
OO***MM***OO

Process finished with exit code 0
------------
Enter the number of rows (5-15): 6
Enter the number of columns (5-20): 10
Enter the first string of the pattern: A
Enter the second string of the pattern: B
Enter the separator string: -
A-B-A-B-A-B-A-B-A-B
B-A-B-A-B-A-B-A-B
A-B-A-B-A-B-A-B
B-A-B-A-B-A
A-B-A-B-A
B-A-B

Process finished with exit code 0
----------------------
Enter the number of rows (5-15): 6
Enter the number of columns (5-20): 3
Number of columns must be greater than or equal to number of rows. Please enter a valid number of columns: 32
Enter the first string of the pattern: 44
Enter the second string of the pattern: 52
Enter the separator string: 23
522344235223442352234423522344235223442352234423522344235223442352234423522344235223442352234423522344235223442352234423522344
44235223442352234423522344235223442352234423522344235223442352234423522344235223442352234423522344235223442352234423522344
5223442352234423522344235223442352234423522344235223442352234423522344235223442352234423522344235223442352234423522344
442352234423522344235223442352234423522344235223442352234423522344235223442352234423522344235223442352234423522344
52234423522344235223442352234423522344235223442352234423522344235223442352234423522344235223442352234423522344
4423522344235223442352234423522344235223442352234423522344235223442352234423522344235223442352234423522344

Process finished with exit code 0
------------
Enter the number of rows (5-15): 5
Enter the number of columns (5-20): 5
Enter the first string of the pattern: A1
Enter the second string of the pattern: B2
Enter the separator string: --
A1--B2--A1--B2--A1
B2--A1--B2--A1--B2
A1--B2--A1--B2
B2--A1--B2
A1--B2
------------
Enter the number of rows (5-15): 7
Enter the number of columns (5-20): 9
Enter the first string of the pattern: X
Enter the second string of the pattern: Y
Enter the separator string: ###
X###Y###X###Y###X###Y###X###Y###X
Y###X###Y###X###Y###X###Y###X
X###Y###X###Y###X###Y###X
Y###X###Y###X###Y###X
X###Y###X###Y###X
Y###X###Y###X
X###Y###X

 */