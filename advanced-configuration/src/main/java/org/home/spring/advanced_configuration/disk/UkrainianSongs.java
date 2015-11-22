package org.home.spring.advanced_configuration.disk;

import org.home.spring.advanced_configuration.condition.MyCompactDisk;
import org.springframework.stereotype.Component;

import javax.annotation.Nonnull;

@Component
@MyCompactDisk
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
