package org.infy.configuration;

import org.infy.dao.InsuranceDAOImpl;
import org.infy.service.InsuranceServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
	@Bean
	public InsuranceServiceImpl insuranceService() {
		return new InsuranceServiceImpl();
	}
	
	@Bean
	public InsuranceDAOImpl insuranceDAO() {
		return new InsuranceDAOImpl();
	}
}
