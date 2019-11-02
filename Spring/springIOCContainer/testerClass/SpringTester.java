package testerClass;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import beanClass.WelcomeBean;
import configuration.SpringConfig;

public class SpringTester {
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
		WelcomeBean welcomeBean = ctx.getBean(WelcomeBean.class);
		welcomeBean.printBean();
	}
}
