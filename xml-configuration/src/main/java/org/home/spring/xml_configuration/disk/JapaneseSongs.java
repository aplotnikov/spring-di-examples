package org.home.spring.xml_configuration.disk;

import javax.annotation.Nonnull;

public class JapaneseSongs implements CompactDisk {
    @Override
    @Nonnull
    public String getTitle() {
        return "Japanese songs";
    }

    @Override
    @Nonnull
    public String getArtist() {
        return "Japanese artist";
    }
}
