package com.infy.exercise.dao;

import java.util.ArrayList;
import java.util.List;

import com.infy.exercise.model.Project;
import com.infy.exercise.model.TeamMember;

public class ProjectDAOImpl implements ProjectDAO{
	public List<Project> projectList;
	public Integer projectId;
	
	public ProjectDAOImpl() {
		
	}
	public Integer addProject(Project project) {
		System.out.println("DATABASE UPLOAD");
		System.out.println("Details of Project");
		System.out.println(project.getProjectName());
		System.out.println(project.getTechnologyUsed());
		System.out.println(project.getCost());
		for(TeamMember member:project.getMemberList()) {
			System.out.println(member.getEmployeeId()+" "+member.getEmployeeName());
		}
		return 5005;
	}
	public List<Project> getProjectDetails(){
		List<Project> projects = new ArrayList<>();
		
		//JavaMember Lists
		List<TeamMember> javamember = new ArrayList<>();
		TeamMember member1 = new TeamMember();
		member1.setEmployeeId(722056);
		member1.setEmployeeName("Ram");
		member1.setDesignation("SSC");
		member1.setSkills("JAVA,ORACLE");
		javamember.add(member1);
		
		TeamMember member2 = new TeamMember();
		member2.setEmployeeId(722002);
		member2.setEmployeeName("Chandra");
		member2.setDesignation("SSC");
		member2.setSkills("JAVA,DOTNET");
		javamember.add(member2);
		
		//DotNet member Lists
		List<TeamMember> dotNetmember = new ArrayList<>();
		TeamMember member3 = new TeamMember();
		member3.setEmployeeId(722056);
		member3.setEmployeeName("Ram");
		member3.setDesignation("SSC");
		member3.setSkills("JAVA,ORACLE");
		dotNetmember.add(member3);
		
		TeamMember member4 = new TeamMember();
		member4.setEmployeeId(722002);
		member4.setEmployeeName("Chandra");
		member4.setDesignation("SSC");
		member4.setSkills("JAVA,DOTNET");
		dotNetmember.add(member4);
		
		//Project class instances
		Project java = new Project();
		java.setProjectName("FSADM8");
		java.setCost(200000);
		java.setTeamSize(5);
		java.setTechnologyUsed("JAVA");
		java.setMemberList(javamember);
		
		Project dotnet = new Project();
		dotnet.setProjectName("FSADM9");
		dotnet.setCost(200000);
		dotnet.setTeamSize(5);
		dotnet.setTechnologyUsed("DOTNET");
		dotnet.setMemberList(dotNetmember);
		
		//Adding Project
		projects.add(java);
		projects.add(dotnet);
		
	
		return projects;
	}
}
