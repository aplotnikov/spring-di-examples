package org.home.spring.xml_in_annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan(basePackages = {"org.home.spring.xml_in_annotation.disk", "org.home.spring.xml_in_annotation.box"})
@Import(AnotherCDPlayerConfig.class)
@ImportResource("classpath:beans.xml")
public class CDPlayerConfig {

}