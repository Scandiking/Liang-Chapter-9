/*

(Geometry: n-sided regular polygon) In an n-sided regular polygon, all sides have the same lenth and all angles have the
same degree (i.e., the polygon is both equilateral and equiangular). Design a class named RegularPolygon that contains:
- A private int data field named n that defines the number of sides in the polygon with default value 3
- A private double data field named side that stores the length of the side with default value 1
- A private double data field named x that defines the x-coordinates of the polygon's center with default value 0.
- A no-arg constructor that creates a regular polygon with default values
- A constructor that creates a regular polygon with the specified number of sides and length of side, centered at (0, 0)
- A constructor that creates a regular polygon with the specified number of sides, length of side, and x- and
  y-coordinates
- The accessor and mutator methods for all data fields
- The method getPerimeter() that returns the perimeter of the polygon
- The method getArea() that returns the area of the polygon. The formula for computing the area of a regular polygon is:

area = (n * s^2) / (4 * tan(PI/n))

Draw the UML diagram for the class then implement the class. Write a test program that creates three RegularPolygon
objects, created using the no-arg constructor, using RegularPolygon(6, 4), and using RegularPolygon(10, 4, 5.6, 7.8).
For each object, display its perimeter and area.

*/

public class Section_9_9 {
    // Private fields
    private int n;
    private double side;
    private double x;
    private double y;

    // No arg constructor
    public Section_9_9() {
        this.n = 3;
        this.side = 1;
        this.x = 0;
        this.y = 0;
    }

    public Section_9_9(int n, double side) {
        this.n = n;
        this.side = side;
        this.x = 0;
        this.y = 0;
    }

    // Constructor with specified number of sides, side length and center coordinates
    public Section_9_9(int n, double side, double x, double y) {
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }

    // Accessor and mutator methods for n
    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    // method to calculate the perimeter of the polygon
    public double getPerimeter() {
        return n * side;
    }

    // method to calculate the area of the polygon
    public double getArea() {
        return (n * Math.pow(side, 2)) / (4 * Math.tan(Math.PI/n));
    }
}
