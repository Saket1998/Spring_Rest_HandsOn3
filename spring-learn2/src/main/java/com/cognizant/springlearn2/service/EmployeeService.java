package com.cognizant.springlearn2.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cognizant.springlearn2.dao.EmployeeDao;
import com.cognizant.springlearn2.model.Employee;

@Service
public class EmployeeService {

	private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeService.class);
	
	@Autowired
	private EmployeeDao employeeDao;
	
	@Transactional
	public List<Employee> getAllEmployees(){
		LOGGER.info("START Service getAllEmployees()");
		LOGGER.info("END Service getAllEmployees())");
		return employeeDao.getAllEmployees() ;
	}
}
