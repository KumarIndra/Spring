package com.infy.exercise.dao;

import java.util.List;

import com.infy.exercise.model.Project;

public interface ProjectDAO {
	public Integer addProject(Project project);
	public List<Project> getProjectDetails();
}
