public class TestCircleWithStaticMembers {
    public static void main(String[] args) {
        System.out.println("Before creating objects");
        System.out.println("The number of Circleee objects is " + Circleee.numberOfObjects);

        // Create c1
        Circleee c1 = new Circleee(); // Uses the listing class in 9.6 which is called Circleee not to come in conflict with Circle

        // Display c1 brefore c2 is created
        System.out.println("\nAfter creating c1");
        System.out.println("c1: radius (" + c1.radius + ") and number of Circleee objects (" + Circleee.numberOfObjects + ")");

        // Create c2
        Circleee c2 = new Circleee(5);

        // Modify c1
        c1.radius = 9;

        // Display c1 and c2 AFTER c2 was created
        System.out.println("\nAfter creating c2 and modifying c1");
        System.out.println("c1: radius (" + c1.radius + ") and number of Circle objects (" + c1.numberOfObjects + ")");
        System.out.println("c2: radius (" + c2.radius + ") and number of Circle objects (" + c2.numberOfObjects + ")");
    }
}
