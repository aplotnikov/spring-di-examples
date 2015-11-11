package org.home.spring.annotation_configuration.factory;

import org.home.spring.annotation_configuration.CDPlayerConfig;
import org.home.spring.annotation_configuration.disk.IndianSongs;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.inject.Inject;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class IndianDiskFactoryTest {
    @Inject
    private IndianDiskFactory factory;

    @Test
    public void shouldNewInstanceOfUkrainianSongsDiskBeCreated() throws Exception {
        IndianSongs firstIndianSongsDisk = factory.anIndianSongsDisk();
        IndianSongs secondIndianSongsDisk = factory.anIndianSongsDisk();

        assertThat(firstIndianSongsDisk).isInstanceOf(IndianSongs.class);
        assertThat(secondIndianSongsDisk).isInstanceOf(IndianSongs.class);

        assertThat(firstIndianSongsDisk).isEqualTo(secondIndianSongsDisk);
    }
}