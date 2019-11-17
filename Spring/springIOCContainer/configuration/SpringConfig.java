package configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import beanClass.WelcomeBean;

@Configuration
@ComponentScan(basePackages = "beanClass")
public class SpringConfig {
//	@Bean
//	public WelcomeBean welcomeBean() {
//		return new WelcomeBean();
//	}
}
