// Test program for Section_9_1
public class Section_9_1b {
    public static void main (String[] args) {
        // Creates two new instances of the "Rectangle" object (named Section_9_1)
        Section_9_1 rectangle1 = new Section_9_1(4, 40);
        Section_9_1 rectangle2 = new Section_9_1(3.5, 35.9);

        // Output of rectangle 1
        System.out.println("Rectangle 1:");
        System.out.println("Width: " + rectangle1.getWidth());
        System.out.println("Height: " + rectangle1.getHeight());
        System.out.println("Area: " + rectangle1.getArea());
        System.out.println("Perimeter: " + rectangle1.getPerimeter());

        // Newline
        System.out.print("\n");

        // Output of rectangle 2
        System.out.println("Rectangle 2:");
        System.out.println("Width: " + rectangle2.getWidth());
        System.out.println("Height: " + rectangle2.getHeight());
        System.out.println("Area: " + rectangle2.getArea());
        System.out.println("Perimeter: " + rectangle2.getPerimeter());
    }
}
