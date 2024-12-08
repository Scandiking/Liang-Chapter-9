/*
(Geometry: intersecting point) Suppose two line segments intersect.
4The two endpoints for the first line segment are (x1, y1) and (x2, y2) and for the second line segment are (x3, y3) and
(x4, y4). Write a program that primots the user to enter these four endpoints and displays the intersecting point.
As discussed in Programming Exercise 3.25, the intersecting point can be found by solving a linear equation.
Use the LinearEquation class in Programming Exercise 9.11 to solve this equation.
See Programming Exercise 3.25 for sample runs.
 */

import java.util.Scanner;

public class Section_9_12 {
    public static void main(String[] args) {
        Scanner scanscan = new Scanner(System.in);

        // Prompt the user for input
        System.out.println("Enter x1, y1, x2, y2 for the first time");

        // Assign user input to variables
        double x1 = scanscan.nextDouble();
        double y1 = scanscan.nextDouble();
        double x2 = scanscan.nextDouble();
        double y2 = scanscan.nextDouble();

        // Prompt the user for input
        System.out.print("Enter x3, y3, x4, y4 for the second line: ");

        // Assign user input to variables
        double x3 = scanscan.nextDouble();
        double y3 = scanscan.nextDouble();
        double x4 = scanscan.nextDouble();
        double y4 = scanscan.nextDouble();

        // Calculate the coefficients for the linear equation
        double a = y2 - y1;
        double b = -(x2 - x1);
        double e = a * x1 - b * y1;

        double c = y4 - y3;
        double d = -(x4 - x3);
        double f = c * x3 - d * y3;

        // Use the LinearEquation class in Programming Exercise 9.11 to solve this equation
        Section_9_11 equation = new Section_9_11(a, b, c, d, e, f);

        // Check if the lines intersect
        if (equation.isSolvable()) {
            double x = equation.getX();
            double y = equation.getY();
            System.out.printf("The intersecting point is at (%.2f, %.2f)%n", x, y);
        } else {
            System.out.println("The two lines are parallel and have no intersection.");
        }

        // Close scanner datastream
        scanscan.close();
    }
}
