package org.home.spring.annotation_in_xml.box;

import org.home.spring.annotation_in_xml.disk.CompactDisk;

public class CompactDiskBox {
    public final CompactDisk russianDisk;
    public final CompactDisk americanDisk;
    public final CompactDisk ukrainianSongs;

    public CompactDiskBox(CompactDisk russianDisk, CompactDisk americanDisk, CompactDisk ukrainianSongs) {
        this.russianDisk = russianDisk;
        this.americanDisk = americanDisk;
        this.ukrainianSongs = ukrainianSongs;
    }
}