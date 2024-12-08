import java.util.Scanner;

public class Section_9_11b {
    public static void main(String[] args) {
        // Create new instance of scanner
        Scanner scanscan = new Scanner(System.in);

        // Prompt user for input
        System.out.println("Enter coefficients a, b, c, d, e, and f: ");

        // Assign the input to variables
        double a = scanscan.nextDouble();
        double b = scanscan.nextDouble();
        double c = scanscan.nextDouble();
        double d = scanscan.nextDouble();
        double e = scanscan.nextDouble();
        double f = scanscan.nextDouble();

        // Create a LinearEquation object
        // LinearEquation equation = new LinearEquation(a, b, c, d, e, f);
        Section_9_11 equation = new Section_9_11(a, b, c, d, e, f);

        // Check if the equation is solvable
        if (equation.isSolvable()) {
            System.out.printf("x = %.2f, y = %.2f%n", equation.getX(), equation.getY());
        } else {
            System.out.println("The equation has no solution");
        }

        // Close the scanner datastream
        scanscan.close();
    }
}
