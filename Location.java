/*
(The Location class) Design a class named Location for locating a maximal value and its location in a two-dimensional array. The class contains public data fields row, column, and maxValue that store the maximal value and its indices in a two-dimensional array with row and column as int types and maxValue as a double type.
Write the following method that returns the location of the largest element in a two-dimensional array:
public static Location locateLargest(double[][] a)
The return value is an instance of Location. Write a test program that prompts the user ot enter a two-dimensional array and displays the location of the largest element in the array.

Here is a sample run:
Enter the number of rows and columns in the array: 3\n4\n
Enter the array: 23.5 35 2 10
4.5 3 45 3.5
35 44 5.5 9.6
The location of the largest element is 45 at (1, 2)
 */

public class Location {
    // Public fields to store tha max value and its location
    public int row;
    public int col;
    public double maxValue;

    // Constructor
    public Location(int row, int col, double maxValue) {
        this.row = row;
        this.col = col;
        this.maxValue = maxValue;
    }
}
