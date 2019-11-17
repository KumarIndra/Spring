package com.infy.autoScan.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.infy.autoScan.configuration.SpringConfig;
import com.infy.autoScan.dao.DesktopAllocationDAOImpl;
import com.infy.autoScan.model.Desktop;
import com.infy.autoScan.model.Trainee;
import com.infy.autoScan.service.DesktopAllocationService;
import com.infy.autoScan.service.DesktopAllocationServiceImpl;

public class UserInteface {
	
	static ApplicationContext ctx;
	static DesktopAllocationService service;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserInteface ui = new UserInteface();
		ui.addNewTrainee();
//		ui.getAllocationDetails();
		
	}
	
	public void addNewTrainee() {
		ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
		service = (DesktopAllocationService) ctx.getBean("desktopAllocationService");
		Desktop desktop = new Desktop();
		desktop.setMachineName("MYSORESYSTEM1");
		desktop.setMake("DELL");
		Trainee trainee = new Trainee();
		trainee.setId(1006);
		trainee.setName("Aadhitya");
		trainee.setDesktop(desktop);
		
		try{
			Integer value = service.addNewTrainee(trainee);
			System.out.println(value);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	public void getAllocationDetails() {
		
	}

}
