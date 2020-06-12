package com.cognizant.springlearn2.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Department {

	private static final Logger LOGGER = LoggerFactory.getLogger(Department.class);
	
	private int id;
	private String name;
	private String location;
	
	public Department() {
		LOGGER.debug("Inside Department Constructor");
	}

	public Department(int id, String name, String location) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		LOGGER.debug("Set Department ID : {}",id);
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		LOGGER.debug("Set Department Name : {}",name);
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		LOGGER.debug("Set Department Location : {}",location);
		this.location = location;
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + ", location=" + location + "]";
	}
	
}
