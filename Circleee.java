// 9.6 Circle
// 9.7 TestCircleWithStaticMembers

public class Circleee {
    double radius;

    static int numberOfObjects = 0;

    Circleee() {
        radius = 1;
        numberOfObjects++;
    }

    Circleee(double newRadius) {
        radius = newRadius;
        numberOfObjects++;
    }

    static int getNumberOfObjects() {
        return numberOfObjects;
    }

    double getArea() {
        return Math.PI * radius * radius;
    }
}
