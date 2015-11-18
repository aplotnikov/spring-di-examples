package org.home.spring.xml_in_annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.home.spring.xml_in_annotation.another_disk")
public class AnotherCDPlayerConfig {

}
