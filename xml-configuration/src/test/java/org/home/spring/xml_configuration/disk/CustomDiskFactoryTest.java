package org.home.spring.xml_configuration.disk;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.inject.Inject;
import javax.inject.Named;

import static org.assertj.core.api.Assertions.assertThat;
import static org.home.spring.xml_configuration.disk.CustomDiskFactory.CompactDiskType.UKRAINIAN;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/beans.xml")
public class CustomDiskFactoryTest {
    @Inject
    @Named("ukrainianDisk")
    private CompactDisk ukrainianCompactDisk;
    @Inject
    @Named("americanDisk")
    private CompactDisk americanCompactDisk;
    @Inject private CustomDiskFactory customDiskFactory;

    @Test
    public void shouldUkrainianCompactDiskBeCreatedByFactoryMethod() {
        assertThat(ukrainianCompactDisk).isInstanceOf(UkrainianSongs.class);
    }

    @Test
    public void shouldAmericanCompactDiskBeCreatedByFactoryMethod() {
        assertThat(americanCompactDisk).isInstanceOf(AmericanSongs.class);
    }

    @Test
    public void shouldNewUkrainianCompactDiskBeCreatedByFactoryMethod() {
        assertThat(customDiskFactory.aCompactDisk(UKRAINIAN)).isNotSameAs(ukrainianCompactDisk);
    }
}
