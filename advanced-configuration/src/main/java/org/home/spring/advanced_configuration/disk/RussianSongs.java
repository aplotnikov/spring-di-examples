package org.home.spring.advanced_configuration.disk;

import javax.annotation.Nonnull;

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
