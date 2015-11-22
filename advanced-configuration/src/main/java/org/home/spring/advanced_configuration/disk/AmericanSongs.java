package org.home.spring.advanced_configuration.disk;

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
