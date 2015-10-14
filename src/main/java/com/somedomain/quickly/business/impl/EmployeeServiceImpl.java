package com.somedomain.quickly.business.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.somedomain.quickly.bean.Employee;
import com.somedomain.quickly.business.EmployeeService;
import com.somedomain.quickly.entity.Person;
import com.somedomain.quickly.orm.PersonDAO;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private PersonDAO personDAO;
	
	@Override	
	@Transactional
	public List<Employee> getEmployees() {
		/*
		 * Mock 
		List<Employee> employees = new ArrayList<Employee>();
		Employee employee = new Employee();
		employee.setName("employee");
		employees.add(employee);
		return employees;*/
		List<Person> personList = personDAO.getPersons();
		List<Employee> employeeList = new ArrayList<Employee>();
		for (Person person : personList) {			
			employeeList.add(new Employee(person.getName()));
		}
		return employeeList;
	}

}
