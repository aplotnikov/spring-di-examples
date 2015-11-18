package org.home.spring.xml_in_annotation;

import javax.annotation.Nonnull;

public interface CompactDisk {
    @Nonnull String getTitle();

    @Nonnull String getArtist();

    default void play() {
        System.out.print("Playing " + getTitle() + " by " + getArtist());
    }
}
