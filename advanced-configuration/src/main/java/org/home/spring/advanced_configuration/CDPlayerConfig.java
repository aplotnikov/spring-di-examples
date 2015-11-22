package org.home.spring.advanced_configuration;

import org.home.spring.advanced_configuration.condition.MyCondition;
import org.home.spring.advanced_configuration.disk.AmericanSongs;
import org.home.spring.advanced_configuration.disk.CompactDisk;
import org.home.spring.advanced_configuration.disk.RussianSongs;
import org.home.spring.advanced_configuration.disk.UkrainianSongs;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import javax.annotation.Nonnull;

@Configuration
@ComponentScan
@PropertySource("classpath:my.properties")
public class CDPlayerConfig {
    @Bean(name = "compactDisk")
    @Profile("dev")
    @Nonnull
    public CompactDisk anUkrainianDisk() {
        return new UkrainianSongs();
    }

    @Bean(name = "compactDisk")
    @Profile("prod")
    @Nonnull
    public CompactDisk anAmericanDisk() {
        return new AmericanSongs();
    }

    @Bean
    @Conditional(MyCondition.class)
    public RussianSongs aRussianSongs() {
        return new RussianSongs();
    }

    @Bean
    @Primary
    public CompactDisk aCompactDisk() {
        return new AmericanSongs();
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertyConfigInDev() {
        //To resolve ${} in @Value
        return new PropertySourcesPlaceholderConfigurer();
    }
}
