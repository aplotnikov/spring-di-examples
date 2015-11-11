package org.home.spring.annotation_configuration.player;


import org.home.spring.annotation_configuration.disk.CompactDisk;
import org.home.spring.annotation_configuration.disk.SgtPeppers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CDPlayer implements MediaPlayer {
    private final CompactDisk disk;

    @Autowired
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
