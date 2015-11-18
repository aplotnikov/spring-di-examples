package org.home.spring.annotation_in_xml.disk;

import org.springframework.stereotype.Component;

import javax.annotation.Nonnull;

@Component("americanDisk")
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
