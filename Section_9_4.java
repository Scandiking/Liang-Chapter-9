/*
(Use the Random class)
Write a program that creates a Random object with seed 1000 and displays the first 50 random
integers between 0 and 100 using the nextInt(100) method
 */

import java.util.Random;

public class Section_9_4 {
    public static void main(String[] args) {
        // Create a random object with seed 1000
        Random random = new Random(1000);

        // Generate and print first 50 random integers >=0 <100
        System.out.println("First 50 random integers between 0 and 100: ");
        // Stop loop at <= 50 i, increment i by one / loop
        for (int i = 1; i <= 50; i++) {

            // Gen ran num
            int randomNumber = random.nextInt(100);

            // Print the ran num
            System.out.print(randomNumber + " ");

            // New line each 10th num by checking if current i mod 10 equals 0
            if (i % 10 == 0) {
                System.out.println();
            }

        }
    }
}
