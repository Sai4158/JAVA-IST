import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * This program reads a file with grades, and writes the grades to another file,
 * lined up in first column and followed the letter grade in the second.
 */
public class FileIO_InClass2 {
    final static int NUM_STU = 3;

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
        PrintWriter outFile = new PrintWriter(outputFileName);

        // Declare variables -- ArrayLists
        ArrayList<String> stuNames = new ArrayList<>(); // input
        ArrayList<Double> stuGrades = new ArrayList<>(); // calculated
        ArrayList<Character> letterGrades = new ArrayList<>(); // output -- calculated

        // Read the data from the user
        getStuInfo(inFile, stuNames, stuGrades);

        // Determine the letterGrades
        for (double grade : stuGrades) {
            char letterGrade = getLetterGrade(grade);
            letterGrades.add(letterGrade);
        }

        // Write the output to a file
        writeStuInfo(outFile, stuNames, stuGrades, letterGrades);

        inFile.close();
        outFile.close();
    }

    /**
     * Method to determine the letter grade given the grade.
     */
    public static char getLetterGrade(double grade) {
        if (grade >= 90) {
            return 'A';
        } else if (grade >= 80) {
            return 'B';
        } else if (grade >= 70) {
            return 'C';
        } else if (grade >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }

    /**
     * Read data from file, calculate and store student averages
     *
     * @param fileIn input file object
     * @param stu    ArrayList of Strings containing student names
     * @param grades ArrayList of doubles containing calculated averages for each student
     */
    public static void getStuInfo(Scanner fileIn, ArrayList<String> stu, ArrayList<Double> grades) {
        while (fileIn.hasNext()) {
            String name = fileIn.next();
            double total = 0;
            for (int i = 0; i < 3; i++) {
                double exam = fileIn.nextDouble();
                total += exam;
            }
            double avg = total / 3.0;
            grades.add(avg);
            stu.add(name);
        }
        System.out.println(stu.toString());
        System.out.println(grades.toString());
    }

    /**
     * Write student information to file, including letter grades
     *
     * @param out         output file object
     * @param stu         ArrayList of Strings containing student names
     * @param grades      ArrayList of doubles containing calculated averages for each student
     * @param letterGrade ArrayList of Characters containing letter grades for each student
     */
    public static void writeStuInfo(PrintWriter out, ArrayList<String> stu, ArrayList<Double> grades,
                                    ArrayList<Character> letterGrade) {
        // Write header
        out.printf("%-15s %-8s %s%n", "Name", "Grade", "Letter");

        // Write data
        for(int i = 0; i < stu.size(); i++) {
            out.printf("%-15s %-8.2f %c%n", stu.get(i), grades.get(i), letterGrade.get(i));
        }
    }
}
