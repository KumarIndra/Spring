package org.infy.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
	@Bean
	public InsuranceServiceImpl insuranceService() {
		return new insuranceServiceImpl();
	}
	
	@Bean
	public InsuranceDAOImpl insuranceDAO() {
		return new InsuranceDAOImpl();
	}
}
