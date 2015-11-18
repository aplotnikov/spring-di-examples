package org.home.spring.xml_in_annotation.box;


import org.home.spring.xml_in_annotation.CompactDisk;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
import javax.inject.Named;

@Component
public class CompactDiskBox {
    public final CompactDisk russianDisk;
    public final CompactDisk americanDisk;
    public final CompactDisk ukrainianSongs;

    @Inject
    public CompactDiskBox(@Named("russianDisk") CompactDisk russianDisk,
                          @Named("americanDisk") CompactDisk americanDisk,
                          @Named("ukrainianDisk") CompactDisk ukrainianSongs) {
        this.russianDisk = russianDisk;
        this.americanDisk = americanDisk;
        this.ukrainianSongs = ukrainianSongs;
    }
}