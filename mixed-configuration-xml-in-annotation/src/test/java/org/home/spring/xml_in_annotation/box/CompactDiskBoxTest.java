package org.home.spring.xml_in_annotation.box;

import org.home.spring.xml_in_annotation.CDPlayerConfig;
import org.home.spring.xml_in_annotation.another_disk.UkrainianSongs;
import org.home.spring.xml_in_annotation.disk.AmericanSongs;
import org.home.spring.xml_in_annotation.disk.RussianSongs;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class CompactDiskBoxTest {
    @Autowired
    private CompactDiskBox box;

    @Test
    public void shouldBeansBeInjectedFromMixedConfiguration() throws Exception {
        assertThat(box.americanDisk).isNotNull().isInstanceOf(AmericanSongs.class);
        assertThat(box.russianDisk).isNotNull().isInstanceOf(RussianSongs.class);
        assertThat(box.ukrainianSongs).isNotNull().isInstanceOf(UkrainianSongs.class);
    }
}