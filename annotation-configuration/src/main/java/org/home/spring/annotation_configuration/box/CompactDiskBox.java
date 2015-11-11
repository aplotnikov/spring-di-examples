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
    private SgtPeppers        sqtPeppersDisk;
    private UkrainianSongs    ukrainianSongs;
    private CompactDisk       russianDisk;
    private CompactDisk       americanDisk;
    private CompactDisk       japaneseDisk;
    @Autowired
    private List<CompactDisk> allDisks;

    @Autowired
    public void setSqtPeppersDisk(SgtPeppers sqtPeppersDisk) {
        this.sqtPeppersDisk = sqtPeppersDisk;
    }

    @Autowired
    public void insertUkrainianSongs(UkrainianSongs ukrainianSongs) {
        this.ukrainianSongs = ukrainianSongs;
    }

    @Inject
    public void insertJapaneseSongs(@Named("japaneseDisk") CompactDisk japaneseDisk) {
        this.japaneseDisk = japaneseDisk;
    }

    @Autowired
    public void insertRussianSongs(@Qualifier("russianDisk") CompactDisk russianDisk) {
        this.russianDisk = russianDisk;
    }

    @Autowired
    public void insertAmericanSongs(@Qualifier("americanDisk") CompactDisk americanDisk) {
        this.americanDisk = americanDisk;
    }

    public SgtPeppers getSqtPeppersDisk() {
        return sqtPeppersDisk;
    }

    public UkrainianSongs getUkrainianSongs() {
        return ukrainianSongs;
    }

    public CompactDisk getRussianDisk() {
        return russianDisk;
    }

    public CompactDisk getAmericanDisk() {
        return americanDisk;
    }

    public CompactDisk getJapaneseDisk() {
        return japaneseDisk;
    }

    public List<CompactDisk> getAllDisks() {
        return allDisks;
    }
}
