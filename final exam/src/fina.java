
// IST 140 Exam

// Looping - For Q4

// Variable declarations
Scanner input = new Scanner(System.in);
        int lowValue, highValue, factor;

// Get user input

// *** Be sure to include code to validate that lowValue is less than
        highValue ***
        System.out.print("Enter low value: ");
        lowValue = input.nextInt();
        System.out.print("Enter high value: ");
        highValue = input.nextInt();

// *** Be sure to validate that factor is greater than 0
        System.out.print("Enter factor: ");
        factor = input.nextInt();

// Display results
        System.out.println("\nThe even values multiplied by " + factor + " between
        " + lowValue
        + " and " + highValue + " are:");

// CODE NEEDED: - use for loop to display all of the even values

    for (int i = lowValue; i <= highValue; i++) {
        if (i % 2 == 0) {
            System.out.print(i * factor + " ");
        }

// between lowValue and highValue (inclusive) multipled by factor
