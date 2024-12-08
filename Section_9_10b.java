import java.util.Scanner;

public class Section_9_10b {
    public static void main(String[] args) {
        // Create new instance of scanner object
        Scanner scanscan  = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter coefficient a, b, and c: ");
        double a = scanscan.nextDouble();
        double b = scanscan.nextDouble();
        double c = scanscan.nextDouble();

        // Create a quadratic equation object
        Section_9_10 equation = new Section_9_10(a, b, c);

        // Get the discriminant
        double discriminant = equation.getDiscriminant();

        // Display the results based on discriminant. If it is >0, ==0 or else
        if (discriminant > 0) {
            System.out.printf("The equation has two roots: %.2f and %.2f%n", equation.getRoot1(), equation.getRoot2());
        } else if (discriminant == 0) {
            System.out.printf("The equation has no roots: %.2f%n", equation.getRoot1());
        } else {
            System.out.println("The equation has no real roots.");
        }

        // Close the scanner datastream
        scanscan.close();
    }
}
