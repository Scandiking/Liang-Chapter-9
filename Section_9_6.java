/*

(Stopwatch) Design a class named StopWatch. The class contains:
- Private data fields startTime and endTime with getter methods
- A no-arg constructor that initializes startTime with the current time
- A method named start() that resets the startTime to the current time
- A method named stop() that sets the endTime to the current time
- A method named getElapsedTime() that returns the elapsed time for the stopwatch in milliseconds

Draw the UML diagram for the class then implement the class.
Write a test program that measures the execution time of sorting 100,000 numbers using selection sort.


 */
public class Section_9_6 {
    private long startTime;
    private long endTime;

    public Section_9_6() {
        this.startTime = System.currentTimeMillis();
    }

    public void start() {
        this.startTime = System.currentTimeMillis();
    }

    public void stop() {
        this.endTime = System.currentTimeMillis();
    }

    // Getter for startTime
    public long getStartTime() {
        return startTime;
    }

    // Getter for endTime
    public long getEndTime() {
        return endTime;
    }

    // Method to get the elapsed time in milliseconds
    public long getElapsedTime() {
        return endTime - startTime;
    }
}
