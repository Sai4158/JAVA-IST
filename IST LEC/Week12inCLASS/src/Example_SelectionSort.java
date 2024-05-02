import java.util.Arrays;

public class Example_SelectionSort {
    public static void main (String[] args )
    {
        int[] nums = {22, 5, 67, 98, 45, 32, 101, 99, 73, 10};
        int i,j,temp, moves, min, minInd;
        moves = 0;
        for (i = 0; i < 10; ++i)
            System.out.printf("%4d ", nums[i]);
        System.out.println("\n");
        for (i = 0; i < 10; i++)  // Find minimum value in array
        {
            min = nums[i];
            minInd = i;
            for (j = i + 1; j < 10; j++) {
                if (nums[j] < min)
                {
                    min = nums[j];
                    minInd = j;
                }
            } // end of inner loop
            // perform the switch
            if (min < nums[i])
            {
                temp = nums[i];
                nums[i] = min;
                nums[minInd] = temp;
                ++moves;
            }
            for (int k = 0; k < 10; ++k)
                System.out.printf("%4d ", nums[k]);
            System.out.println();
        }  // End for loop sorting algorithm

        System.out.println("\nThe sorted list, in ascending order, is:");
        for (i = 0; i < 10; ++i)
            System.out.printf("%4d ", nums[i]);
        System.out.println("\n\n" + moves + " moves were made to sort this list\n");

    }
}
