package org.home.spring.xml_in_annotation.disk;

import org.home.spring.xml_in_annotation.CompactDisk;

import javax.annotation.Nonnull;

public class AmericanSongs implements CompactDisk {
    @Override
    @Nonnull
    public String getTitle() {
        return "American songs";
    }

    @Override
    @Nonnull
    public String getArtist() {
        return "Riahana";
    }
}
