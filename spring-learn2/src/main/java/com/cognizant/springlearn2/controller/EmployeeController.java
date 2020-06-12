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

import com.cognizant.springlearn2.dao.EmployeeDao;
import com.cognizant.springlearn2.model.Employee;
import com.cognizant.springlearn2.service.EmployeeService;

@RestController
public class EmployeeController {

	private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeController.class);
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/employees")
	public List<Employee> getAllEmployees() {
		LOGGER.info("START Controller getAllEmployees()");
		LOGGER.info("END Controller getAllEmployees()");
		return employeeService.getAllEmployees() ;
	}
	
	@PutMapping("/employees/{id}")
	public Employee updateEmployee(@RequestBody Employee employee,@PathVariable int id)
	{
		for (Employee emp : EmployeeDao.EMPLOYEE_LIST) {
			if(emp.getId()==id) {
				emp.setName(employee.getName());
				emp.setSalary(employee.getSalary());
				emp.setDepartment(employee.getDepartment());
			}
		}
		return employee;
	}
}
