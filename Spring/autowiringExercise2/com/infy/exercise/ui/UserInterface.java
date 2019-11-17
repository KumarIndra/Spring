package com.infy.exercise.ui;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.infy.exercise.configuration.SpringConfig;
import com.infy.exercise.model.Project;
import com.infy.exercise.model.TeamMember;
import com.infy.exercise.service.ProjectServiceImpl;

public class UserInterface {
	static ApplicationContext ctx;
	static ProjectServiceImpl service;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserInterface ui = new UserInterface();
		ui.addProject();
		ui.getProjectDetails();
	}
	public void addProject() {
		ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
		service = ctx.getBean(ProjectServiceImpl.class);
		//TeamMember list
				List<TeamMember> member = new ArrayList<>();
				TeamMember member1 = new TeamMember();
				member1.setEmployeeId(722000);
				member1.setEmployeeName("Ram Chandra");
				member1.setDesignation("SSC");
				member1.setSkills("JAVA,ORACLE");
				member.add(member1);
				
				TeamMember member2 = new TeamMember();
				member2.setEmployeeId(722002);
				member2.setEmployeeName("Ravi Chandra");
				member2.setDesignation("SSC");
				member2.setSkills("JAVA,DOTNET");
				member.add(member2);
				
		//Project class inputs
		Project project = new Project();
		project.setProjectName("FSADM8");
		project.setCost(200000);
		project.setTeamSize(5);
		project.setTechnologyUsed("JAVA");
		project.setMemberList(member);
		
		
		try {
			Integer projectId;
			projectId = service.addProject(project);
			System.out.println("New project successfully added with projectId: "+projectId);
		}catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println("Employee id is not valid");
		}
		
		
	}
	public void getProjectDetails() {
		ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
		service = ctx.getBean(ProjectServiceImpl.class);
		try {
			List<Project> project = service.getProjectDetails("JAVA");
			System.out.println("Team Member Details");
			System.out.println("MemberId\t\tMemberName\t\tSkills");
			System.out.println("********\t\t**********\t\t******");
			for(Project pro:project) {
				for(TeamMember mem:pro.getMemberList()) {
					System.out.println(mem.getEmployeeId()+"\t\t\t"+mem.getEmployeeName()+"\t\t\t"+mem.getSkills());
				}
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println("No projects found for the specified technology");
		}
		
	}

}
