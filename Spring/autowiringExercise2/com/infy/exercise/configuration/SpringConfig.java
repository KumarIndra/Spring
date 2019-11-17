package com.infy.exercise.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.infy.exercise.dao.ProjectDAOImpl;
import com.infy.exercise.service.ProjectServiceImpl;



@Configuration
public class SpringConfig {
	
	@Bean
	public ProjectServiceImpl projectServiceImpl() {
		return new ProjectServiceImpl();
	}
	
	@Bean
	public ProjectDAOImpl projectDAOImpl() {
		return new ProjectDAOImpl();
	}
}
