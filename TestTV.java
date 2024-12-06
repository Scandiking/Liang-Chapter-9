public class TestTV {
    // Main method using the methods of the class TV.java
    public static void main(String[] args) {
        // Instantiates new TV, TV1
        TV tv1 = new TV();
        // Turns tv1 on
        tv1.turnOn();
        // Set channels of tv1 to 30
        tv1.setChannel(30);
        // Set volume of tv1 to 3
        tv1.setVolume(3);

        // Creates new instance of TV class, tv2
        TV tv2 = new TV();
        // Turns second instance of TV class on
        tv2.turnOn();
        // Increases channel (from 1)
        tv2.channelUp();
        // Increases channel (from 2)
        tv2.channelUp();
        // Increases volume (from 1)
        tv2.volumeUp();

        TV tv3 = new TV();
        tv3.setChannel(5);
        tv3.channelDown();

        System.out.println("tv1's channel is " + tv1.channel + " and volume level is " + tv1.volumeLevel);
        System.out.println("tv2's channel is " + tv2.channel + " and volume level is " + tv2.volumeLevel);
        // tv3's channel "should" be 4 since 5-1 is 4. It says the channel is 1 because that is the value the
        // TV instance is default with, despite it not being turned on.
        System.out.println("tv3's channel is " + tv3.channel);
    }
}
