import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * This program reads a file and creates a copy of that file
 * ...
 * The contents of the file are processed character by character.
 */
public class CopyFile {
    public static void main(String[] args) throws FileNotFoundException {
        // Prompt for the input and output file names
        Scanner console = new Scanner(System.in);
        System.out.print("Input file: ");
        String inputFileName = console.next();
        System.out.print("Output file: ");
        String outputFileName = console.next();

        // Construct the Scanner and PrintWriter objects for reading and writing
        File inputFile = new File(inputFileName);
        Scanner inFile = new Scanner(inputFile);
        PrintWriter out = new PrintWriter(outputFileName);

        // Set the delimiter for the Scanner object
        inFile.useDelimiter("");  // set to empty delimiter

        // We read a character at a time
        while (inFile.hasNext()) {
            // Read 1 character
            char ch = inFile.next().charAt(0);

            // Write 1 character
            out.print(ch);
        }

        inFile.close();
        out.close();
    }
}
