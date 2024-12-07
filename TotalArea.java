public class TotalArea {
    public static void main(String[] args) {
        // Declare circleArray
        Circleeee[] circleeeeArray;

        // Create circleArray
        circleeeeArray = createCircleArray();

        // Print circleArray and total areas of the circles
        printCircleArray(circleeeeArray);
    }

    // Create an array of Circle objects
        public static Circleeee[] createCircleArray () {
            Circleeee[] circleArray = new Circleeee[5];

            for (int i = 0; i < circleArray.length; i++) {
                circleArray[i] = new Circleeee(Math.random() * 100);
            }

            // Return Circle array
            return circleArray;
        }

        // Print an array of circles and their total area
        public static void printCircleArray (Circleeee[] circleArray){
            System.out.printf("%-30s%-15s\n", "Radius", "Area");
            for (int i = 0; i < circleArray.length; i++) {
                System.out.printf("%-30f%-15f\n", circleArray[i].getRadius(), circleArray[i].getArea());
            }

            System.out.println("___");

            // Compute and display the result
            System.out.printf("%-30s%-15.2f\n", "The total area of circles is", sum(circleArray));
        }

        // Add circle areas
        public static double sum (Circleeee[]circleArray) {
            // Initialize sum
            double sum = 0;

            // Add areas to sum
            for (int i = 0; i < circleArray.length; i++)
                sum += circleArray[i].getArea();

            return sum;
        }
    }
