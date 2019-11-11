package com.cts.sba.iiht.projectmanager.service;

import java.util.List;
import java.util.Optional;

import com.cts.sba.iiht.projectmanager.entity.User;

public interface UserService {

	public List<User> findAllUsers();

	public User findUser(Integer employeeId);
	
	public User findUserByProject(Integer projectId);
		
	public User findUserByTask(Integer taskId);	
	
	public void addUser(User user);

	public void updateUser(User user);

	public void deleteUser(Integer employeeId);
}
