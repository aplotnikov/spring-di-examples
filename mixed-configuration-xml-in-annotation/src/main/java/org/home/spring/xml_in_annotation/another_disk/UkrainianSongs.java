package org.home.spring.xml_in_annotation.another_disk;

import org.home.spring.xml_in_annotation.CompactDisk;

import javax.annotation.Nonnull;
import javax.inject.Named;

@Named("ukrainianDisk")
public class UkrainianSongs implements CompactDisk {
    @Override
    @Nonnull
    public String getTitle() {
        return "Ukrainian songs";
    }

    @Override
    @Nonnull
    public String getArtist() {
        return "Skriabin";
    }
}
