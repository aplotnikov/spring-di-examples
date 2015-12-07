package org.home.spring.aop.annotation;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.inject.Inject;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = PerformanceConfiguration.class)
public class AroundPerformanceTest {
    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

    @Inject
    private AroundPerformance performance;

    @Test
    public void shouldAOPStepsBeApplied() {
        performance.perform();

        assertThat(systemOutRule.getLog()).isEqualTo("Silencing cell phones\n"
                                                     + "Taking seats\n"
                                                     + "Performance\n"
                                                     + "CLAP CLAP CLAP!!!\n");
    }
}