/*
(The Rectangle class) Following the example of the `Circle` class in Section 9.2, deesign a class named `Rectangle` to
represent a rectangle. The class contains:
- Two double data fields named width and height that specify the width and height of the rectangle
- A no-arg constructor that creates a default rectangle
- A constructor that creates a rectangle with the specified width and height
- A method named getArea() that returns the area of this rectangle
- A method names getPerimeter() that returns the perimeter

Draw the UML diagram for the class then implement the class. Write a test program that creates two Rectangle objects -
one with width 4 and height 40, and the other with width 3.5 and height 35.9.
Display the width, height, area, and perimeter of each rectangle in this order.
*/

// Would naturally be called "Rectangle"
public class Section_9_1 {
    // Data fields
    private double width;
    private double height;

    // No-arg constructor: creates a default rectangle
        // Would naturally be called "Rectangle"
    public Section_9_1() {
        // Initiating width and height values
        this.width = 1.0;
        this.height = 1.0;
    }

    // Constructor with specified width and height
        // Would naturally be called "Rectangle"
    public Section_9_1(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Method to return the area of the rectangle
    public double getArea() {
        // gets area by multiplying width w height
        return width * height;
    }

    // Method to return the perimeter of the rectangle
    public double getPerimeter() {
        return 2 * (width + height);
    }

    // Getter for width
    public double getWidth() {
        return width;
    }

    // Getter for height
    public double getHeight() {
        return height;
    }
}
