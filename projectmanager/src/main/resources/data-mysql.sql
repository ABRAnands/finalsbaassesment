INSERT INTO parent_task (parent_id,parent_task) VALUES (1,"PT1");
INSERT INTO parent_task (parent_id,parent_task) VALUES (2,"PT2");
INSERT INTO parent_task (parent_id,parent_task) VALUES (3,"PT3");
INSERT INTO parent_task (parent_id,parent_task) VALUES (4,"PT4");


INSERT INTO project(id,end_date,priority,project,start_date) VALUES(1, CURDATE(), 1, "Project 1", CURDATE());
INSERT INTO project(id,end_date,priority,project,start_date) VALUES(2, CURDATE(), 2, "Project 2", CURDATE());
INSERT INTO project(id,end_date,priority,project,start_date) VALUES(3, CURDATE(), 3, "Project 3", CURDATE());
INSERT INTO project(id,end_date,priority,project,start_date) VALUES(4, CURDATE(), 4, "Project 4", CURDATE());
INSERT INTO project(id,end_date,priority,project,start_date) VALUES(5, CURDATE(), 5, "Project 5", CURDATE());
INSERT INTO project(id,end_date,priority,project,start_date) VALUES(6, CURDATE(), 6, "Project 6", CURDATE());
INSERT INTO project(id,end_date,priority,project,start_date) VALUES(7, CURDATE(), 7, "Project 7", CURDATE());
INSERT INTO project(id,end_date,priority,project,start_date) VALUES(8, CURDATE(), 8, "Project 8", CURDATE());
INSERT INTO project(id,end_date,priority,project,start_date) VALUES(9, CURDATE(), 9, "Project 9", CURDATE());
INSERT INTO project(id,end_date,priority,project,start_date) VALUES(10, CURDATE(), 10, "Project 10", CURDATE());

INSERT INTO task(end_date,priority,start_date,task,parent_task_id, status, project_id )VALUES(CURDATE(),10,CURDATE() ,"T1",1, false, 1);
INSERT INTO task(end_date,priority,start_date,task,parent_task_id, status, project_id)VALUES(CURDATE(),11,CURDATE() ,"T2",1, false, 2);
INSERT INTO task(end_date,priority,start_date,task,parent_task_id, status, project_id)VALUES(CURDATE(),12,CURDATE() ,"T3",1,true, 2);
INSERT INTO task(end_date,priority,start_date,task,parent_task_id, status, project_id)VALUES(CURDATE(),13,CURDATE() ,"T4",1,true, 3);



INSERT INTO users (employee_id,first_name,last_name,project_id,task_id)VALUES(100000,"UserF1", "UserL1",1,1);
INSERT INTO users (employee_id,first_name,last_name,project_id,task_id)VALUES(100001,"UserF2", "UserL2",2,2);
INSERT INTO users (employee_id,first_name,last_name,project_id,task_id)VALUES(100002,"UserF3", "UserL3",1,2);
INSERT INTO users (employee_id,first_name,last_name,project_id,task_id)VALUES(100003,"UserF4", "UserL4",3,3);


