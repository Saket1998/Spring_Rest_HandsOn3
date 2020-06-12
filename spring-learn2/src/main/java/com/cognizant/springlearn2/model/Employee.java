package com.cognizant.springlearn2.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Employee {

	private static final Logger LOGGER = LoggerFactory.getLogger(Employee.class);

	private int id;
	private String name;
	private double salary;
	private String department;
	
	public Employee() {
		LOGGER.debug("Inside Employee Constructor");
	}

	public Employee(int id, String name, double salary, String department) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.department = department;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		LOGGER.debug("Set Employee ID : {}",id);
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		LOGGER.debug("Set Employee Name : {}",name);
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		LOGGER.debug("Set Employee Salary : {}",salary);
		this.salary = salary;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		LOGGER.debug("Set Employee Department : {}",department);
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", department=" + department + "]";
	}

}
