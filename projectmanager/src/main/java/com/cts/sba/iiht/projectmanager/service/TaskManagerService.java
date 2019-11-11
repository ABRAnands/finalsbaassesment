package com.cts.sba.iiht.projectmanager.service;

import java.util.List;

import com.cts.sba.iiht.projectmanager.entity.ParentTask;
import com.cts.sba.iiht.projectmanager.entity.Task;

public interface TaskManagerService {
	
	
	public List<Task> findAllTasks();	
	
	public List<ParentTask> findAllParentTasks();
	
	public Task findTask(Integer id) ;	
	
	public ParentTask findParentTask(Integer id);
	
	public void addTask(Task task);	
	
	public void addParentTask(ParentTask task);
	
	public void updateTask(Task task);
	
	public void deleteTask(Integer id);
	
	public void endTask(Integer id) ;
	
	public List<Task> findTaskByProject(Integer projectId) ;
	
	public void setProject(Task task);
	
	public void setUser(Task task) ;
}