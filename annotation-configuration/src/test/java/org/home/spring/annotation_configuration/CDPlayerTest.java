package org.home.spring.annotation_configuration;

import org.home.spring.annotation_configuration.player.CDPlayer;
import org.home.spring.annotation_configuration.player.MediaPlayer;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import static org.assertj.core.api.Assertions.assertThat;

public class CDPlayerTest {
    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

    private AbstractApplicationContext context;
    private MediaPlayer                player;

    @Before
    public void setUp() throws Exception {
        context = new AnnotationConfigApplicationContext(CDPlayerConfig.class);
        player = context.getBean(CDPlayer.class);
    }

    @After
    public void tearDown() throws Exception {
        if (context != null) {
            context.close();
        }
    }

    @Test
    public void shouldBeNotNullInjectedInstance() {
        assertThat(player).isNotNull();
    }

    @Test
    public void shouldSpecialMessageBeGenerated() throws Exception {
        player.play();

        assertThat(systemOutRule.getLog()).isEqualTo("Playing Sgt. Pepper's Lonely Hearts Club Band by The Beatles");
    }
}