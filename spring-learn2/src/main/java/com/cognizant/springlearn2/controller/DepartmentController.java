package com.cognizant.springlearn2.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.springlearn2.dao.DepartmentDao;
import com.cognizant.springlearn2.model.Department;
import com.cognizant.springlearn2.service.DepartmentService;

@RestController
public class DepartmentController {

	private static final Logger LOGGER = LoggerFactory.getLogger(DepartmentController.class);
	
	@Autowired
	private DepartmentService departmentService;
	
	@GetMapping("/departments")
	public List<Department> getAllDepartments()  {
		LOGGER.info("START Controller getAllDepartments()");
		LOGGER.info("END Controller getAllDepartments()");
		return departmentService.getAllDepartments() ;
	}
	
	@PutMapping("/departments/{id}")
	public Department updateDepartment(@RequestBody Department department,@PathVariable int id)
	{
		for (Department dept : DepartmentDao.DEPARTMENT_LIST) {
			if(dept.getId()==id) {
				dept.setName(department.getName());
				dept.setLocation(department.getLocation());
			}
		}
		return department;
	}
}
