public class TestPassObject {
    // Main
    public static void main(String[] args) {
        // Create a circle object with radius 1
        Circleeee myCircle =
                new Circleeee(1);

        // Print areas for radius 1, 2, 3, 4, and 5.
        int n = 5;
        printAreas(myCircle, n);

        // Se myCircleeee.radius and times
        System.out.println("\n" + "Radius is " + myCircle.getRadius());
        System.out.println("n is " + n);
    }

    // Print a table of areas and radius
    public static void printAreas(Circleeee c, int times) {
        System.out.println("Radius \t\tArea");
        while (times >= 1) {
            System.out.println(c.getRadius() + "\t\t" + c.getArea());
            c.setRadius(c.getRadius() + 1);
            // Keep track of times
            times--;
        }
    }
}
