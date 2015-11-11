package org.home.spring.annotation_configuration;

import org.home.spring.annotation_configuration.disk.CompactDisk;
import org.home.spring.annotation_configuration.disk.JapaneseSongs;
import org.home.spring.annotation_configuration.disk.RussianSongs;
import org.home.spring.annotation_configuration.disk.UkrainianSongs;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
//@ComponentScan(basePackages = "org.home.spring.annotation_configuration")
//@ComponentScan(basePackages = {"org.home.spring.annotation_configuration"})
//@ComponentScan(basePackageClasses = {CDPlayer.class})
public class CDPlayerConfig {
    @Bean
    public CompactDisk anUkrainianDisk() {
        return new UkrainianSongs();
    }

    @Bean(name = "myRussianDisk")
    public CompactDisk aRussianDisk() {
        return new RussianSongs();
    }

    @Bean(name = "myJapaneseDisk")
    public CompactDisk aJapaneseDisk(JapaneseSongs japaneseSongs) {
        return japaneseSongs;
    }
}
