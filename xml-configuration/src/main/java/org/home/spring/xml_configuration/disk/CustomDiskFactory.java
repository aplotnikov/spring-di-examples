package org.home.spring.xml_configuration.disk;

public class CustomDiskFactory {
    public enum CompactDiskType {
        UKRAINIAN,
        AMERICAN
    }

    public CompactDisk aCompactDisk(CompactDiskType diskType) {
        switch (diskType) {
            case UKRAINIAN:
                return new UkrainianSongs();
            default:
                return new AmericanSongs();
        }
    }
}
