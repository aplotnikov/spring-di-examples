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
        assertThat(diskBox.getSqtPeppersDisk()).isEqualTo(mediaPlayer.getInsertedDisk());
    }

    @Test
    public void shouldRussianDiskBeInjectedByBeanName() throws Exception {
        assertThat(diskBox.getRussianDisk()).isInstanceOf(RussianSongs.class);
    }

    @Test
    public void shouldJapaneseDiskBeInjectedByBeanName() throws Exception {
        assertThat(diskBox.getJapaneseDisk()).isInstanceOf(JapaneseSongs.class);
    }

    @Test
    public void shouldAmericanDiskBeInjectedByBeanName() throws Exception {
        assertThat(diskBox.getAmericanDisk()).isInstanceOf(AmericanSongs.class);
    }

    @Test
    public void shouldUkrainianDiskBeInjectedByBeanName() throws Exception {
        assertThat(diskBox.getUkrainianSongs()).isInstanceOf(UkrainianSongs.class);
    }

    @Test
    public void shouldAllDiskBeInjectedByMarkerInterface() throws Exception {
        assertThat(diskBox.getAllDisks())
                .containsAll(
                        asList(
                                diskBox.getAmericanDisk(),
                                diskBox.getJapaneseDisk(),
                                diskBox.getRussianDisk(),
                                diskBox.getSqtPeppersDisk(),
                                diskBox.getUkrainianSongs()
                              )
                            )
                .hasSize(5);
    }
}