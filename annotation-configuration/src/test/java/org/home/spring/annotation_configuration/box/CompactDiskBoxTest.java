package org.home.spring.annotation_configuration.box;

import org.home.spring.annotation_configuration.CDPlayerConfig;
import org.home.spring.annotation_configuration.disk.AmericanSongs;
import org.home.spring.annotation_configuration.disk.JapaneseSongs;
import org.home.spring.annotation_configuration.disk.RussianSongs;
import org.home.spring.annotation_configuration.disk.UkrainianSongs;
import org.home.spring.annotation_configuration.player.CDPlayer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class CompactDiskBoxTest {
    @Autowired
    private CompactDiskBox diskBox;
    @Autowired
    private CDPlayer       mediaPlayer;

    @Test
    public void shouldInstanceBeSingletonByDefault() throws Exception {
        assertThat(diskBox.sgtPeppersDisk).isEqualTo(mediaPlayer.getInsertedDisk());
    }

    @Test
    public void shouldRussianDiskBeInjectedByBeanName() throws Exception {
        assertThat(diskBox.russianDisk).isInstanceOf(RussianSongs.class);
    }

    @Test
    public void shouldSpecialRussianDiskBeInjectedByBeanNameFromConfigurationClass() throws Exception {
        assertThat(diskBox.specialRussianDisk).isInstanceOf(RussianSongs.class);
        assertThat(diskBox.specialRussianDisk).isNotEqualTo(diskBox.russianDisk);
    }

    @Test
    public void shouldJapaneseDiskBeInjectedByBeanName() throws Exception {
        assertThat(diskBox.japaneseDisk).isInstanceOf(JapaneseSongs.class);
    }

    @Test
    public void shouldSpecialJapaneseDiskBeInjectedByBeanNameFromConfigurationClass() throws Exception {
        assertThat(diskBox.specialJapaneseDisk).isInstanceOf(JapaneseSongs.class);
        assertThat(diskBox.specialJapaneseDisk).isEqualTo(diskBox.japaneseDisk);
    }

    @Test
    public void shouldAmericanDiskBeInjectedByBeanName() throws Exception {
        assertThat(diskBox.americanDisk).isInstanceOf(AmericanSongs.class);
    }

    @Test
    public void shouldUkrainianDiskBeInjectedByBeanName() throws Exception {
        assertThat(diskBox.ukrainianSongs).isInstanceOf(UkrainianSongs.class);
    }

    @Test
    public void shouldSpecialUkrainianDiskBeInjectedByBeanNameFromConfigurationClass() throws Exception {
        assertThat(diskBox.specialUkrainianSongs).isInstanceOf(UkrainianSongs.class);
        assertThat(diskBox.specialUkrainianSongs).isNotEqualTo(diskBox.ukrainianSongs);
    }

    @Test
    public void shouldTheSameSpecialUkrainianDiskInstanceBeInjectedByBeanNameFromConfigurationClass() throws Exception {
        assertThat(diskBox.specialUkrainianSongs).isInstanceOf(UkrainianSongs.class);
        assertThat(diskBox.anotherSpecialUkrainianSongs).isInstanceOf(UkrainianSongs.class);

        assertThat(diskBox.specialUkrainianSongs).isEqualTo(diskBox.anotherSpecialUkrainianSongs);
    }

    @Test
    public void shouldAllDiskBeInjectedByMarkerInterface() throws Exception {
        assertThat(diskBox.allDisks)
                .containsAll(
                        asList(
                                diskBox.americanDisk,
                                diskBox.japaneseDisk,
                                diskBox.russianDisk,
                                diskBox.sgtPeppersDisk,
                                diskBox.ukrainianSongs
                              )
                            )
                .hasSize(8);
    }
}