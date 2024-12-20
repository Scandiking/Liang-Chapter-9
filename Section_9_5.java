/*
(Use the Gregorian Calendar class) Java API has the GregorianCalendar class in the java.util package, which you can
use to obtain the year, month, and day of a date. The no-arg constructor constructs an instance for the current
date, and the methods get(GregorianCalendar.YEAR), get(GregorianCalendar.MONTH), and get(GregorianClanedar.DAY_OF_MONTH)
return the year, month, and day. Write a program to perform two tasks:

1. Display the current year, month and day.

2. The GregorianCalendar class has the setTimeInMillis(long) which can be used to set a specified elapsed time since
January 1, 1970. Set the value to 1234567898765L and display the year, month and day.
 */

import java.util.GregorianCalendar;

public class Section_9_5 {
    public static void main(String[] args) {
        // Instantiate new object
        GregorianCalendar gc = new GregorianCalendar();

        // Display the current year, month and day
        System.out.println("Current date: ");
        System.out.println("Year: " + gc.get(GregorianCalendar.YEAR));
        System.out.println("Month: " + (gc.get(GregorianCalendar.MONTH) + 1));
        System.out.println("Day: " + gc.get(GregorianCalendar.DAY_OF_MONTH));
        System.out.println();

        // Set the elapsed time to 12345678998765L
        gc.setTimeInMillis(1234567898765L);

        // Display the year, month and day for the given elapsed time
        System.out.println("Date for elapsed time 1234567898765L:");
        System.out.println("Year: " + gc.get(GregorianCalendar.YEAR));
        System.out.println("Month: " + (gc.get(GregorianCalendar.MONTH) + 1));
        System.out.println("Day: " + gc.get(GregorianCalendar.DAY_OF_MONTH));

    }
}
