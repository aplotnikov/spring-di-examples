package org.home.spring.annotation_configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
//@ComponentScan(basePackages = "org.home.spring.annotation_configuration")
//@ComponentScan(basePackages = {"org.home.spring.annotation_configuration"})
//@ComponentScan(basePackageClasses = {CDPlayer.class})
public class CDPlayerConfig {

}
