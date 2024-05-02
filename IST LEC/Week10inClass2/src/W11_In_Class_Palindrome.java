import java.util.Scanner;

public class W11_In_Class_Palindrome {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String inStr; // input
        String modStr; // input with non-letter characters removed

        // Get input and remove non-letter characters
        System.out.println("Please enter a string: ");
        inStr = scnr.nextLine();
        modStr = removeNonLetters(inStr);

        // Reverse input string
        String revStr = reverseString(modStr);

        // Compare the two strings and output the results
        if (modStr.equalsIgnoreCase(revStr)) {
            System.out.println("Palindrome: " + inStr);
        } else {
            System.out.println("Not a palindrome: " + inStr);
        }
    } // end of main

    /*
    Method which accepts a string with content and removes
    non-letter characters from it, and returns the modified string
    */
    public static String removeNonLetters(String s) {
        String modStr = "";
        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if (Character.isLetter(c)) {
                modStr += c;
            }
        }
        return modStr;
    } // end removeNonLetters

    /*

    */
    public static String reverseString(String s) {
        String revStr = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            revStr += s.charAt(i);
        }
        return revStr;
    } // end reverseString
} // end of class


/*
"C:\Program Files\Java\jdk-19\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.3\lib\idea_rt.jar=63594:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.3\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\saira\OneDrive - The Pennsylvania State University\Documents\IST140_LAB_001L\IST LEC\Week10inClass2\out\production\Week10inClass2" W11_In_Class_Palindrome
Please enter a string:
pranav
Not a palindrome: pranav

Process finished with exit code 0
---------
"C:\Program Files\Java\jdk-19\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.3\lib\idea_rt.jar=63616:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.3\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\saira\OneDrive - The Pennsylvania State University\Documents\IST140_LAB_001L\IST LEC\Week10inClass2\out\production\Week10inClass2" W11_In_Class_Palindrome
Please enter a string:
Racecar
Palindrome: Racecar

Process finished with exit code 0

 */