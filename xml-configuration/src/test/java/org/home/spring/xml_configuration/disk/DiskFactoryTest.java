package org.home.spring.xml_configuration.disk;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.inject.Inject;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/beans.xml")
public class DiskFactoryTest {
    @Inject private DiskFactory diskFactory;

    @Test
    public void shouldFactoryCreateDifferentInstances() {
        CompactDisk firstCompactDisk = diskFactory.aCompactDisk();
        CompactDisk secondCompactDisk = diskFactory.aCompactDisk();

        assertThat(firstCompactDisk).isInstanceOf(ChineseSongs.class);
        assertThat(secondCompactDisk).isInstanceOf(ChineseSongs.class);
        assertThat(firstCompactDisk).isNotSameAs(secondCompactDisk);
    }
}