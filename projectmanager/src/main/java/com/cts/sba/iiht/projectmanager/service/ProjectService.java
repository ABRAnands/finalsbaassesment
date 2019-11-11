package com.cts.sba.iiht.projectmanager.service;

import java.util.List;
import com.cts.sba.iiht.projectmanager.entity.Project;

public interface ProjectService {
	
	public List<Project> findAllProjects();	
	
	public List<Project> findAllProjectsWithTask() ;

	public Project findProject(Integer projectId);

	public void addProject(Project project);

	public void updateProject(Project project);
	
	public void endProject(Integer id);	
	
}
