package org.home.spring.xml_configuration.disk;

import javax.annotation.Nonnull;

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
