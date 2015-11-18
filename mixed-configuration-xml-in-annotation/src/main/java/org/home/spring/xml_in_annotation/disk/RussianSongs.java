package org.home.spring.xml_in_annotation.disk;

import org.home.spring.xml_in_annotation.CompactDisk;
import org.springframework.stereotype.Component;

import javax.annotation.Nonnull;

@Component(value = "russianDisk")
public class RussianSongs implements CompactDisk {
    @Override
    @Nonnull
    public String getTitle() {
        return "Russian songs";
    }

    @Override
    @Nonnull
    public String getArtist() {
        return "Serebro";
    }
}
