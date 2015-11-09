package org.home.spring.xml_configuration.disk;

public class SgtPeppers implements CompactDisk {
    @Override
    public void play() {
        String title = "Sgt. Pepper's Lonely Hearts Club Band";
        String artist = "The Beatles";

        System.out.println("Playing " + title + " by " + artist);
    }
}
