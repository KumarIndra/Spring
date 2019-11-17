package com.infy.exercise.service;

import java.util.List;

import com.infy.exercise.model.Project;

public interface ProjectService {
	public Integer addProject(Project project);
	public List<Project> getProjectDetails(String technology);
}
