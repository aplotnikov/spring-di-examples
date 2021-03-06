package org.home.spring.annotation_configuration.disk;

import javax.annotation.Nonnull;

public interface CompactDisk {
    @Nonnull String getTitle();

    @Nonnull String getArtist();

    default void play() {
        System.out.print("Playing " + getTitle() + " by " + getArtist());
    }
}
