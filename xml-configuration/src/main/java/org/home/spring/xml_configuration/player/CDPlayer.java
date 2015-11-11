package org.home.spring.xml_configuration.player;


import org.home.spring.xml_configuration.disk.CompactDisk;
import org.home.spring.xml_configuration.disk.SgtPeppers;

public class CDPlayer implements MediaPlayer {
    private final CompactDisk disk;

    public CDPlayer(SgtPeppers disk) {
        this.disk = disk;
    }

    @Override
    public void play() {
        disk.play();
    }

    public CompactDisk getInsertedDisk() {
        return disk;
    }
}
