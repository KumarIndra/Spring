package com.infy.exercise.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.infy.exercise.dao.ProjectDAO;
import com.infy.exercise.model.Project;
import com.infy.exercise.model.TeamMember;
import com.infy.exercise.validator.Validator;


public class ProjectServiceImpl {
	
	@Autowired
	private ProjectDAO dao;
	
	public Integer addProject(Project project) throws Exception {
		
		List<TeamMember> memberList = project.getMemberList();
		Validator validator = new Validator();
		for(TeamMember member:memberList) {
			validator.validate(member);
		}
		Integer value = dao.addProject(project);
		
		return value;
	}
	
	public List<Project> getProjectDetails(String technology) throws Exception{
		List<Project> pro = new ArrayList<Project>();
		for(Project project :dao.getProjectDetails()) {
			if(project.getTechnologyUsed().equals(technology)) {
				pro.add(project);
			}
		}
			if(pro.size()==0) {
				throw new Exception("Service.PROJECTS_NOT_FOUND");
			}else {
				return pro;
			}
	}
}
