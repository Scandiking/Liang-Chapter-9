import java.util.Random;

public class Section_9_6b {
    public static void main(String[] args) {
        int[] numbers = new int[100000];
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100000);
        }

        Section_9_6 stopwatch = new Section_9_6();

        // Start the stopwatch
        stopwatch.start();

        selectionSort(numbers);

        stopwatch.stop();

        System.out.println("The execution time for sorting 100.000 numbers using selection sort is: " + stopwatch.getElapsedTime() + " milliseconds.");
    }

    // Selection sort method
    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }
}
