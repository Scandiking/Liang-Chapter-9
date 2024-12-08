public class Section_9_9b {
    public static void main(String[] args) {
        // Create RegularPolygon objects
        // Normally RegularPolygon polygon1 = new RegularPolygon
        Section_9_9 polygon1 = new Section_9_9();
        Section_9_9 polygon2 = new Section_9_9(6, 4);
        Section_9_9 polygon3 = new Section_9_9(10, 4, 5.6, 7.8);

        // Display perimeter and area for each polygon referring to its instance's name
        System.out.println("Polygon 1: ");
        System.out.printf("Perimeter: %.2f%n", polygon1.getPerimeter());
        System.out.printf("Area: %.2f%n%n", polygon1.getArea());

        System.out.println("Polygon 2: ");
        System.out.printf("Perimeter: %.2f%n", polygon2.getPerimeter());
        System.out.printf("Area: %.2f%n%n", polygon2.getArea());

        System.out.println("Polygon 3: ");
        System.out.printf("Perimeter: %.2f%n", polygon3.getPerimeter());
        System.out.printf("Area: %.2f%n%n", polygon3.getArea());
    }
}
