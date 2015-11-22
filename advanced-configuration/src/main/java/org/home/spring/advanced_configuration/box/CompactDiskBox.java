package org.home.spring.advanced_configuration.box;

import org.home.spring.advanced_configuration.condition.MyCompactDisk;
import org.home.spring.advanced_configuration.disk.CompactDisk;
import org.home.spring.advanced_configuration.disk.RussianSongs;
import org.home.spring.advanced_configuration.disk.UkrainianSongs;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
import javax.inject.Named;
import java.math.BigDecimal;

@Component
public class CompactDiskBox {
    public final CompactDisk compactDisk;
    public final CompactDisk aRussianDisk;
    public final CompactDisk primaryCompactDisk;
    public final String      activeRussian;
    public final CompactDisk ukrainianSongs;
    public final BigDecimal  bigDecimal;

    @Inject
    public CompactDiskBox(@Named("compactDisk") CompactDisk compactDisk,
                          @Named("aRussianSongs") RussianSongs russianSongs,
                          CompactDisk primaryCompactDisk,
                          @Value("${activeRussian}") String activeRussian,
                          @MyCompactDisk UkrainianSongs ukrainianSongs,
                          @Value("#{T(java.math.BigDecimal).TEN}") BigDecimal bigDecimal) {
        this.compactDisk = compactDisk;
        aRussianDisk = russianSongs;
        this.primaryCompactDisk = primaryCompactDisk;
        this.activeRussian = activeRussian;
        this.ukrainianSongs = ukrainianSongs;
        this.bigDecimal = bigDecimal;
    }
}
