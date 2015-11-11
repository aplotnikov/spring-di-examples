package org.home.spring.xml_configuration.box;

import org.home.spring.xml_configuration.disk.CompactDisk;
import org.home.spring.xml_configuration.disk.SgtPeppers;
import org.home.spring.xml_configuration.disk.UkrainianSongs;

public class CompactDiskBox {
    public SgtPeppers     sgtPeppersDisk;
    public UkrainianSongs ukrainianSongs;
    public CompactDisk    russianDisk;
    public CompactDisk    americanDisk;
    public CompactDisk    japaneseDisk;
    public CompactDisk    chineseSongs;
    public CompactDisk    specialChineseSongs;

    public void setSgtPeppersDisk(SgtPeppers sgtPeppersDisk) {
        this.sgtPeppersDisk = sgtPeppersDisk;
    }

    public void setUkrainianSongs(UkrainianSongs ukrainianSongs) {
        this.ukrainianSongs = ukrainianSongs;
    }

    public void setRussianDisk(CompactDisk russianDisk) {
        this.russianDisk = russianDisk;
    }

    public void setAmericanDisk(CompactDisk americanDisk) {
        this.americanDisk = americanDisk;
    }

    public void setJapaneseDisk(CompactDisk japaneseDisk) {
        this.japaneseDisk = japaneseDisk;
    }

    public void setChineseSongs(CompactDisk chineseSongs) {
        this.chineseSongs = chineseSongs;
    }

    public void setSpecialChineseSongs(CompactDisk specialChineseSongs) {
        this.specialChineseSongs = specialChineseSongs;
    }
}
