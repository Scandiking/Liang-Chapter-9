public class Section_9_8b {
    // Test method for Section_9_8 (Normally called Fan)
    public static void main(String[] args) {
        /*
        Normally called "Fan fan1 = new Fan()"
        Normally called "Fan fan2 = new Fan()"
         */
        Section_9_8 fan1 = new Section_9_8();
        Section_9_8 fan2 = new Section_9_8();

        // Set attributes for the first fan
        fan1.setSpeed(Section_9_8.FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);

        // Set attributes for the second fan
        fan2.setSpeed(Section_9_8.MEDIUM);
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.setOn(false);

        // Display the fans using the toString method
        System.out.println("Fan 1: " + fan1);
        System.out.println("Fan 2: " + fan2);
    }
}
