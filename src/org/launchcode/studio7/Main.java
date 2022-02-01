package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        // TODO: Declare and initialize a CD and a DVD object.

        // TODO: Call each CD and DVD method to verify that they work as expected.
        CD cd = new CD ();
        DVD dvd = new DVD();

        cd.playAudio();
        cd.spin();
        cd.read();
        cd.write("123");

        dvd.playVideo();
        dvd.spin();
        dvd.read();
        dvd.write("456");

    }
}
