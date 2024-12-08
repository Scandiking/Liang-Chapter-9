/*
(Algebra: quadratic equations) Design a class named QuadraticEquation for a quadratic equeation ax^2 + bx + c = 0.
The class contains:
- Private data fields a, b, and c that represent three coefficients
- A constructor with the arguments for a, b, and c
- Three getter methods for a, b, and c
- A method named getDiscriminant() that returns the discriminant, which is b^2 - 4ac
- The methods named getRoot1() and getRoot2() for returning two roots of the equation

r1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
r2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);

These methods are useful only if the discriminant is nonnegative.
Let these methods return 0 if the discriminant is negative.

Draw the UML diagram for the class then implement the class. Write a test program that prompts the user to enter values
for a, b, and c and displays the result based on the discriminant.
If the discriminant is positive, display the two roots. I the discriminant is 0, display the one root.
Otherwise, display "The equation has no roots." See Programming Exercise 3.1 for sample runs.

 */

import java.util.Scanner;

public class Section_9_10 {
    // Private fields for coefficients
    private double a;
    private double b;
    private double c;

    public Section_9_10(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // Getter methods for a, b, and c
    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    // Method to calculate the discriminant
    public double getDiscriminant() {
        return b * b - 4 * a * c;
    }

    // Method to calculate the first root
    public double getRoot1() {
        double discriminant = getDiscriminant();
        if (discriminant >= 0) {
            return (-b + Math.sqrt(discriminant)) / (2 * a);
        } else {
            return 0;
        }
    }

    // Method to calculate the second root
    public double getRoot2() {
        double discriminant = getDiscriminant();
        if (discriminant >= 0) {
            return (-b - Math.sqrt(discriminant)) / (2 * a);
        } else {
            return 0; // Return 0 if the discriminant is negative
        }
    }
}
