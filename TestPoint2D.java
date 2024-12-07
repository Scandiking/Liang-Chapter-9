import java.util.Scanner;
// You might need to install JavaFX as it does not come
// bundled with JDK anymore.
import javafx.geometry.Point2D;

public class TestPoint2D {
    public static void main(String[] args) {
        // New instance of scanner object
        Scanner scanscan = new Scanner(System.in);

        // Prompt user for input
        System.out.println("Enter point1's x-, y-coordinates: ");
        // Save input
        double x1 = scanscan.nextDouble();
        double y1 = scanscan.nextDouble();
        // Prompt user for inpit
        System.out.println("Enter point2's x-, y-coordinates: ");
        // Save input
        double x2 = scanscan.nextDouble();
        double y2 = scanscan.nextDouble();

        // New instance of Point2D
        Point2D p1 = new Point2D(x1, y1);
        // New instance of Point2D
        Point2D p2 = new Point2D(x2, y2);

        // Output
        System.out.println("p1 is " + p1.toString());
        System.out.println("p2 is " + p2.toString());
        System.out.println("The distance between p1 and p2 is " + p1.distance(p2));
        System.out.println("The midpoint between p1 and p2 is " + p1.midpoint(p2).toString());
    }
}
