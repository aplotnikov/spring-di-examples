package org.home.spring.annotation_configuration.factory;

import org.home.spring.annotation_configuration.disk.IndianSongs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Nonnull;
import javax.inject.Provider;

@Component
public class IndianDiskFactory {
    private final Provider<IndianSongs> indianSongsProvider;

    @Autowired
    public IndianDiskFactory(Provider<IndianSongs> indianSongsProvider) {
        this.indianSongsProvider = indianSongsProvider;
    }

    @Nonnull
    public IndianSongs anIndianSongsDisk() {
        return indianSongsProvider.get();
    }
}
