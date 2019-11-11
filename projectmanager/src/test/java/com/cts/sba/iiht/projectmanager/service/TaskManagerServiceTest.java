package com.cts.sba.iiht.projectmanager.service;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.junit.Assert.assertNotNull;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.cts.sba.iiht.projectmanager.entity.ParentTask;
import com.cts.sba.iiht.projectmanager.entity.Task;
import com.cts.sba.iiht.projectmanager.entity.User;
import com.cts.sba.iiht.projectmanager.repository.ParentTaskRepository;
import com.cts.sba.iiht.projectmanager.repository.ProjectRepository;
import com.cts.sba.iiht.projectmanager.repository.TaskManagerRepository;
import com.cts.sba.iiht.projectmanager.repository.UserRepository;
import com.cts.sba.iiht.projectmanager.service.impl.UserServiceImpl;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskManagerServiceTest {


	@Autowired
    private TaskManagerService taskService;
	@Autowired
	private UserRepository userRepo;
	@Autowired
	private UserServiceImpl service;
	@Autowired
	private ProjectRepository  projectRepo;
	@Autowired
	private ParentTaskRepository  parentTaskRepo;
	@Autowired
	private TaskManagerRepository taskRepo ;
	
	
	@Test
    public void findAllTasks() {
		addTask();
    	List<Task> tasks = taskService.findAllTasks();
    	assertNotNull(tasks);
    }
	
	@Test
    public void findAllParentTasks() {
		addParentTask();
    	List<ParentTask> tasks = taskService.findAllParentTasks();
    	assertNotNull(tasks);
    	//assertThat(tasks, hasSize(4));
    }

    @Test
    public void findById() {
    	assertNotNull(taskService.findTask(1));
    }

    @Test
    public void updateTask() {
    	final Task task = taskService.findTask(1);
    	task.setEndDate(new Date());
    	taskService.updateTask(task);
    }
    
    @Test
    public void completeTask() {
    	final Task task = taskService.findTask(1);
    	task.setEndDate(new Date());
    	task.setStatus(true);
    	taskService.updateTask(task);
    }

    @Test()
    public void addTask() {
        final Task task = new Task();
        task.setTask("Test Task");
        task.setStartDate(new Date());
        task.setPriority(1);
        task.setEndDate(new Date());
        taskService.addTask(task);
    }
    
    @Test()
    public void addTaskALL() {
        final Task task = new Task();
        task.setTask("super Test");
        task.setStartDate(new Date());
        task.setPriority(1);
        task.setEndDate(new Date());
        task.setParentTask(parentTaskRepo.findById(1).get());
        task.setUserId(101);
        taskService.addTask(task);
        List<Task> tasks = taskRepo.findByTask("super Test");
    }
    
    @Test(expected = javax.validation.ConstraintViolationException.class)
    public void addTaskTest() {
        final Task task = new Task();
        task.setTask("Test Task");
        task.setStartDate(new Date());
        taskService.addTask(task);
    }
    
    @Test
    public void addParentTask() {
        final ParentTask task = new ParentTask();
        task.setTask("ParentTest Task");
        taskService.addParentTask(task);
    }
    
    @Test
    public void endTask() {
    	taskService.endTask(1);
    }
    
    @Test
    public void findUserByTask() {
	User user = service.findUserByTask(1);
	//assertNotNull(user);
	}
    
     
}
