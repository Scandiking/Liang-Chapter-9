public class TestCircleWithPrivateDataFields {
    public static void main(String[] args) {
        // Create new instance  of circle object
        Circleeee myCircle = new Circleeee(5.0);
        System.out.println("The area of the circle of radius " + myCircle.getRadius() + " is " + myCircle.getArea());

        // Increase mycircle's radius by 10%
        myCircle.setRadius(myCircle.getRadius() * 1.1);
        System.out.println("The area of the circle of radius " + myCircle.getRadius() + " is " + myCircle.getArea());

        // Calling the Circleeee class using its getNumberOfObjects method
        System.out.println("The number of objects created is " + Circleeee.getNumberOfObjects());
    }
}
