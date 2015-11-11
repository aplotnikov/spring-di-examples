package org.home.spring.xml_configuration.disk;

import javax.annotation.Nonnull;

public class ChineseSongs implements CompactDisk {
    @Override
    @Nonnull
    public String getTitle() {
        return "Chinese Songs";
    }

    @Override
    @Nonnull
    public String getArtist() {
        return "Chinese artist";
    }
}
