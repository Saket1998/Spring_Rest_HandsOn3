package com.cognizant.springlearn2.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.springlearn2.dao.DepartmentDao;
import com.cognizant.springlearn2.model.Department;

@Service
public class DepartmentService {

	private static final Logger LOGGER = LoggerFactory.getLogger(DepartmentService.class);
	
	@Autowired
	private DepartmentDao departmentDao;
	
	public List<Department> getAllDepartments(){
		LOGGER.info("START Service getAllDepartments()");
		LOGGER.info("END Service getAllDepartments())");
		return departmentDao.getAllDepartments() ;
	}
}
