package org.home.spring.xml_configuration.box;

import org.home.spring.xml_configuration.disk.AmericanSongs;
import org.home.spring.xml_configuration.disk.ChineseSongs;
import org.home.spring.xml_configuration.disk.JapaneseSongs;
import org.home.spring.xml_configuration.disk.RussianSongs;
import org.home.spring.xml_configuration.disk.UkrainianSongs;
import org.home.spring.xml_configuration.player.CDPlayer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/beans.xml")
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
    public void shouldJapaneseDiskBeInjectedByBeanName() throws Exception {
        assertThat(diskBox.japaneseDisk).isInstanceOf(JapaneseSongs.class);
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
    public void shouldTheDifferentChineseDiskInstancesBeInjectedWhenScopeIsPrototype() throws Exception {
        assertThat(diskBox.chineseSongs).isInstanceOf(ChineseSongs.class);
        assertThat(diskBox.specialChineseSongs).isInstanceOf(ChineseSongs.class);

        assertThat(diskBox.chineseSongs).isNotEqualTo(diskBox.specialChineseSongs);
    }
}