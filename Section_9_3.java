/*
(Use the Date class) Write a program that creates a Date object, sets its elapsed time to 10000, 100000, 1000000,
10000000, 100000000, 1000000000, 10000000000, and 100000000000, and displays the date and time using the toString()
method, respectively.
 */

// Import Date
import java.util.Date;

public class Section_9_3 {
    public static void main(String[] args) {
        // Create array of times (in ms)
        long[] elapsedTimes = {
                10000L, 100000L, 1000000L,
                10000000L, 100000000L,
                1000000000L, 10000000000L,
                100000000000L
        };

        // For each item in the elapsedTimes array
        for (long elapsedTime : elapsedTimes) {
            // Instantiate a new date
            Date date = new Date();

            // .setTime for each date instance
            date.setTime(elapsedTime);

            // Output for user
            System.out.println("Elapsed time: " + elapsedTime + " ms");
            System.out.println("Date and time: " + date);
            System.out.println();
        }
    }
}
