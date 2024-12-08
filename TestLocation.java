import java.util.Scanner;

public class TestLocation {
    public static void main(String[] args) {
        // Creates new instance of object
        Scanner scanscan = new Scanner(System.in);

        // Prompts user for input
        System.out.print("Enter the number of rows and columns in the array: ");

        // Assigns input to int variables
        int rows = scanscan.nextInt();
        int columns = scanscan.nextInt();

        // Create instance of the twodimensional array
        double[][] array = new double[rows][columns];
        // Prompt the user for input
        System.out.println("Enter the array: ");
        // Starts the iteration at 0 and stops for `i` reaches `rows`
        // increases i + 1 each iteration
        for (int i = 0; i < rows; i++) {
            // Iterates over the columns of _current_ row of the twodimensional array
            for (int j = 0; j < columns; j++) {
                // ASsigns to values from user to `array[i][j]`
                array[i][j] = scanscan.nextDouble();
            }
        }

        // Find the location of the largest element
        Location largestLocation = Section_9_13.locateLargeset(array);

        // Display the results
        System.out.printf("The location of the largest element is %.1f at (%d, %d)%n", largestLocation.maxValue, largestLocation.row, largestLocation.col);

        // Close the datastream
        scanscan.close();
    }
}
