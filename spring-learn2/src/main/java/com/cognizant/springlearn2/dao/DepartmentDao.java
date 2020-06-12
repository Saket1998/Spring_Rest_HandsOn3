package com.cognizant.springlearn2.dao;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Repository;

import com.cognizant.springlearn2.model.Department;

@Repository
public class DepartmentDao {

	private static final Logger LOGGER = LoggerFactory.getLogger(DepartmentDao.class);
	
	public static List<Department> DEPARTMENT_LIST = new ArrayList<Department>() ;
	
	public DepartmentDao() {
		ApplicationContext context = new ClassPathXmlApplicationContext("employee.xml");
		DEPARTMENT_LIST=(List<Department>)context.getBean("departmentList");
	}

	public List<Department> getAllDepartments(){
		LOGGER.info("START Dao getAllDepartments()");
		LOGGER.info("END Dao getAllDepartments())");
		return DEPARTMENT_LIST;
	}
}
