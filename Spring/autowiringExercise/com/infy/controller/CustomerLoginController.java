package com.infy.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.infy.configuration.SpringConfig;
import com.infy.model.CustomerLogin;
import com.infy.service.CustomerLoginService;
import com.infy.service.CustomerLoginServiceImpl;

public class CustomerLoginController {
    public static void main(String[] args) throws Exception {
         CustomerLogin c = new CustomerLogin();
         c.setLoginName("tom");
         c.setPassword("tom123");
         ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
         CustomerLoginService c1 = ctx.getBean(CustomerLoginServiceImpl.class);
         Boolean isValid = c1.authenticateCustomerLogin(c);
         if (isValid == true)
             System.out.println("Customer logged in successfully");
         else
             System.out.println("Invalid credentials.");
    }
}
