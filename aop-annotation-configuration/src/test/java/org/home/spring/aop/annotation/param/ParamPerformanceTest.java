package org.home.spring.aop.annotation.param;

import org.home.spring.aop.annotation.PerformanceConfiguration;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.inject.Inject;

import static org.assertj.core.api.Assertions.assertThat;
import static org.home.spring.aop.annotation.param.ParamAudience.TRACK_COUNT;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = PerformanceConfiguration.class)
public class ParamPerformanceTest {
    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

    @Inject
    private ParamPerformance performance;

    @Test
    public void shouldAOPStepsBeApplied() {
        assertThat(TRACK_COUNT).hasSize(0);

        performance.playTrack(1);
        performance.playTrack(1);
        performance.playTrack(1);

        performance.playTrack(2);
        performance.playTrack(2);

        performance.playTrack(3);

        assertThat(systemOutRule.getLog()).isEqualTo("Perform track id 1\n"
                                                     + "Perform track id 1\n"
                                                     + "Perform track id 1\n"
                                                     + "Perform track id 2\n"
                                                     + "Perform track id 2\n"
                                                     + "Perform track id 3\n");

        assertThat(TRACK_COUNT).hasSize(3)
                               .containsEntry(1, 3)
                               .containsEntry(2, 2)
                               .containsEntry(3, 1);
    }
}