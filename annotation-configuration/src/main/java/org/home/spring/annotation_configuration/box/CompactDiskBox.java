package org.home.spring.annotation_configuration.box;

import org.home.spring.annotation_configuration.disk.CompactDisk;
import org.home.spring.annotation_configuration.disk.SgtPeppers;
import org.home.spring.annotation_configuration.disk.UkrainianSongs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

@Component
public class CompactDiskBox {
    public SgtPeppers     sgtPeppersDisk;
    public UkrainianSongs ukrainianSongs;

    @Autowired
    @Qualifier("russianDisk")
    public CompactDisk russianDisk;

    @Autowired
    @Qualifier("myRussianDisk")
    public CompactDisk specialRussianDisk;

    @Autowired
    @Qualifier("americanDisk")
    public CompactDisk americanDisk;

    @Inject
    @Named("japaneseDisk")
    public CompactDisk japaneseDisk;

    @Inject
    @Named("myJapaneseDisk")
    public CompactDisk specialJapaneseDisk;

    @Inject
    @Named("anUkrainianDisk")
    public CompactDisk specialUkrainianSongs;

    @Inject
    @Named("anUkrainianDisk")
    public CompactDisk anotherSpecialUkrainianSongs;

    @Inject
    @Named("chineseSongs")
    public CompactDisk chineseSongs;

    @Inject
    @Named("chineseSongs")
    public CompactDisk specialChineseSongs;

    @Autowired
    public List<CompactDisk> allDisks;

    @Autowired
    public void setSgtPeppersDisk(SgtPeppers sgtPeppersDisk) {
        this.sgtPeppersDisk = sgtPeppersDisk;
    }

    @Autowired
    public void insertUkrainianSongs(UkrainianSongs ukrainianSongs) {
        this.ukrainianSongs = ukrainianSongs;
    }
}
