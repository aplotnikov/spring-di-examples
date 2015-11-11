package org.home.spring.annotation_configuration.disk;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.Nonnull;

@Component
@Qualifier("americanDisk")
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
