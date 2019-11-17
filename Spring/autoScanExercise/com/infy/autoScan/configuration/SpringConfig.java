package com.infy.autoScan.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.infy.autoScan.dao com.infy.autoScan.service")
public class SpringConfig {

}
