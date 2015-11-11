package org.home.spring.xml_configuration.player;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.assertj.core.api.Assertions.assertThat;

public class CDPlayerTest {
    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

    private AbstractApplicationContext context;
    private MediaPlayer                player;

    @Before
    public void setUp() throws Exception {
        //context = new FileSystemXmlApplicationContext("src/main/resources/beans.xml");
        context = new ClassPathXmlApplicationContext("beans.xml");
        player = context.getBean(MediaPlayer.class);
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