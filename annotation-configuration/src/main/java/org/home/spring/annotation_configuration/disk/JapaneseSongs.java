package org.home.spring.annotation_configuration.disk;

import javax.annotation.Nonnull;
import javax.inject.Named;

@Named("japaneseDisk")
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
