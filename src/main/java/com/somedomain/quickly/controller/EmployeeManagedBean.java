package com.somedomain.quickly.controller;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.somedomain.quickly.bean.Employee;
import com.somedomain.quickly.business.EmployeeService;

@ManagedBean
@Controller
@SessionScoped
public class EmployeeManagedBean {
	
	@Autowired
	EmployeeService employeeService;

	private String name;
	
	public List<Employee> getEmployees(){
		return employeeService.getEmployees();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
