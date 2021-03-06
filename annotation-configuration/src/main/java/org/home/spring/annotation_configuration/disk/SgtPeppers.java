package org.home.spring.annotation_configuration.disk;

import org.springframework.stereotype.Component;

import javax.annotation.Nonnull;

@Component
public class SgtPeppers implements CompactDisk {
    @Override
    @Nonnull
    public String getTitle() {
        return "Sgt. Pepper's Lonely Hearts Club Band";
    }

    @Override
    @Nonnull
    public String getArtist() {
        return "The Beatles";
    }
}
