package org.home.spring.annotation_configuration.disk;

import org.springframework.stereotype.Component;

import javax.annotation.Nonnull;

@Component
public class UkrainianSongs implements CompactDisk {
    @Override
    @Nonnull
    public String getTitle() {
        return "Ukrainian songs";
    }

    @Override
    @Nonnull
    public String getArtist() {
        return "Skriabin";
    }
}
