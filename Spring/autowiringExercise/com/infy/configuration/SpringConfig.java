package com.infy.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.infy.dao.CustomerLoginDAOImpl;
import com.infy.service.CustomerLoginServiceImpl;

@Configuration
public class SpringConfig {
     @Bean
     public CustomerLoginServiceImpl customerLoginServiceImpl() {
          return new CustomerLoginServiceImpl();
     }
     @Bean
     public CustomerLoginDAOImpl customerLoginDAOImpl() {
          return new CustomerLoginDAOImpl();
     }
}

