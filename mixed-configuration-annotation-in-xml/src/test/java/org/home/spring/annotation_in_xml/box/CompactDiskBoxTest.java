package org.home.spring.annotation_in_xml.box;

import org.home.spring.annotation_in_xml.disk.AmericanSongs;
import org.home.spring.annotation_in_xml.disk.RussianSongs;
import org.home.spring.annotation_in_xml.disk.UkrainianSongs;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:beans.xml")
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