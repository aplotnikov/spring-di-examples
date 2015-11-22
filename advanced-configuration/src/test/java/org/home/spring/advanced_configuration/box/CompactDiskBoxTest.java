package org.home.spring.advanced_configuration.box;

import org.home.spring.advanced_configuration.CDPlayerConfig;
import org.home.spring.advanced_configuration.disk.AmericanSongs;
import org.home.spring.advanced_configuration.disk.RussianSongs;
import org.home.spring.advanced_configuration.disk.UkrainianSongs;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.inject.Inject;

import static java.lang.Boolean.TRUE;
import static java.math.BigDecimal.TEN;
import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
@ActiveProfiles("dev")
public class CompactDiskBoxTest {
    @Inject
    private CompactDiskBox box;

    @Test
    public void shouldUkrainianDiskBeInjectedFromActiveProfile() throws Exception {
        assertThat(box.compactDisk).isNotNull().isInstanceOf(UkrainianSongs.class);
    }

    @Test
    public void shouldRussianSongsBeInjectedWhenEnvironmentParameterIsSet() throws Exception {
        assertThat(box.aRussianDisk).isNotNull().isInstanceOf(RussianSongs.class);
    }

    @Test
    public void shouldValueFromPropertyFileBeInjected() throws Exception {
        assertThat(box.activeRussian).isEqualTo(TRUE.toString());
    }

    @Test
    public void shouldPrimaryCompactDiskBeInjected() throws Exception {
        assertThat(box.primaryCompactDisk).isNotNull().isInstanceOf(AmericanSongs.class);
    }

    @Test
    public void shouldBeanBeInjectedByCustomAnnotation() throws Exception {
        assertThat(box.ukrainianSongs).isNotNull().isInstanceOf(UkrainianSongs.class);
    }

    @Test
    public void shouldBigDecimalValueBeInjectedFromSpEL() throws Exception {
        assertThat(box.bigDecimal).isEqualTo(TEN);
    }
}