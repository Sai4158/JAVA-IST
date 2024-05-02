/**
 This program prints a table of medal winner counts with row totals.
 */
public class Medals
{
    public static void main(String[] args)
    {
        final int COUNTRIES = 7;
        final int MEDALS = 3;

        String[] countries =
                {
                        "Canada",
                        "China",
                        "Germany",
                        "Korea",
                        "Japan",
                        "Russia",
                        "United States"
                };

        int[][] counts =
                {
                        { 1, 0, 1 },
                        { 1, 1, 0 },
                        { 0, 0, 1 },
                        { 1, 0, 0 },
                        { 0, 1, 1 },
                        { 0, 1, 1 },
                        { 1, 1, 0 }
                };

        System.out.println("        Country    Gold  Silver  Bronze   Total");

        // Print countries, counts, and row totals
        for (int i = 0; i < COUNTRIES; i++)
        {
            // Process the ith row
            System.out.printf("%15s", countries[i]); // name of country 1D

            int total = 0;

            // Print each row element and update the row total
            for (int j = 0; j < MEDALS; j++)
            {
                System.out.printf("%8d", counts[i][j]); // each medal value
                total = total + counts[i][j];
            } // end inner loop

            // Display the row total and print a new lineg
            System.out.printf("%8d\n", total);
        } // end outer loop
        // Print column totals
        // Row heading
        System.out.printf("%15s", "TOTAL:"); //
        for (int j = 0; j < MEDALS; j++) // Each column - counts[i].length
        {
            int total = 0; // for each medal

            // Print each row element and update the row total
            for (int i = 0; i < COUNTRIES; i++)
            {
                total = total + counts[i][j];
            } // end inner loop

            // Display the row total and print a new lineg
            System.out.printf("%8d", total);
        } // end outer loop
        System.out.println();
    }


}
/*
        Country    Gold  Silver  Bronze   Total
         Canada       1       0       1       2
          China       1       1       0       2
        Germany       0       0       1       1
          Korea       1       0       0       1
          Japan       0       1       1       2
         Russia       0       1       1       2
  United States       1       1       0       2
         TOTAL:       4       4       4
Press any key to continue . . .
*/
