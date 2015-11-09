package org.home.spring.annotation_configuration.disk;

import org.springframework.stereotype.Component;

@Component
public class SgtPeppers implements CompactDisk {
    @Override
    public void play() {
        String title = "Sgt. Pepper's Lonely Hearts Club Band";
        String artist = "The Beatles";

        System.out.print("Playing " + title + " by " + artist);
    }
}
