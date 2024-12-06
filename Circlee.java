/*
Named "Circlee" not to come in conflict with "TestCircle" who is using the Circle class.
 */

public class Circlee {
    // Main method
    public static void main(String[] args) {
        // Create a circle with radius 1
        Circle circle1 = new Circle();
        System.out.println("The area of the circle of radius " + circle1.radius + " is " + circle1.getArea());

        // Create a new circle with radius 25
        Circle circle2 = new Circle(25);
        System.out.println("The area of the circle of radius " + circle2.radius + " is " + circle2.getArea());

        // Create a new cirlce with radius 125
        Circle circle3 = new Circle(125);
        System.out.println("The area of the circle of radius " + circle3.radius + " is " + circle3.getArea());

        // Modify circle radius
        circle2.radius = 100;
        System.out.println("The area of the circle of radius " + circle2.radius + " is " + circle2.getArea());
    }

    double radius;

    // Construct a circle with radius 1
    Circlee() {
        radius = 1;
    }

    Circlee(double newRadius) {
        radius = newRadius;
    }

    // Return the area of the circle
    double getArea() {
        return radius * radius * Math.PI;
    }

    // Return the perimeter of the circle
    double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    // Set a new radius for the circle
    void setRadius(double newRadius) {
        radius = newRadius;
    }
}
