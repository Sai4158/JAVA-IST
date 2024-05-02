/**
 * File name: CheckString.java
 * Short description: This Java program, CheckString, validates user input to ensure it starts with a letter.
 * It also demonstrates file writing and reading capabilities.
 *
 * IST 140 Assignment: W14 PA - CheckString (Level 3)
 * author: Sai Rangineeni
 * version: 4/26/2023
 * date of last revision: 4/28/2023
 * details of the revision: Done
 */
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class CheckString {

    // Check if the word starts with a letter; if not, throw an Exception
    public static void checkWord(String word) throws Exception {
        if (!Character.isLetter(word.charAt(0))) {
            throw new Exception("This is not a word.");
        }
    }

    // Prompt the user for a word, read it, and call checkWord to validate it
    public static String getWord() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a word: ");
        String word = scanner.nextLine();

        try {
            checkWord(word);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return word;
    }

    // Write the contents of an array of Strings to a file
    public static void writeFile(String[] arrayToWrite, String filename) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename))) {
            for (String line : arrayToWrite) {
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    // Read the contents of a file and return them as an ArrayList of Strings
    public static ArrayList<String> readFile(String filename) {
        ArrayList<String> fileContents = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                fileContents.add(line);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        return fileContents;
    }

    public static void main(String[] args) {
        // Call the getWord method and print the result
        String word = getWord();
        System.out.println("Word: " + word);

        // Create an array of Strings called testData
        String[] testData = {"hello", "world", "Java"};

        // Write testData to a file named "data.txt"
        writeFile(testData, "data.txt");

        // Read the contents of "data.txt" into an ArrayList called fileContents
        ArrayList<String> fileContents = readFile("data.txt");

        // Print the contents of the fileContents ArrayList
        for (String line : fileContents) {
            System.out.println(line);
        }
    }
}


/*
Please enter a word: programming
Word: programming
hello
world
Java

Process finished with exit code 0
-----------------------
Please enter a word: Cat
Word: Cat
hello
world
Java

Process finished with exit code 0
-----------------------
Please enter a word: Test word
Word: Test word
hello
world
Java

Process finished with exit code 0
---------------
Please enter a word: heyyyyyy
Word: heyyyyyy
hello
world
Java

Process finished with exit code 0
 */