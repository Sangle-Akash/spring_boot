package com.akash.service;

import java.util.List;

import com.akash.dao.EmployeeOperation;
import com.akash.entity.Employee;

public class EmployeeService {

	EmployeeOperation employeeOperataion = new EmployeeOperation();

	public String saveEmployee(Employee emp) {
		String msg;

		msg = employeeOperataion.saveEmployee(emp);

		return msg;

	}

	public Employee getEmployee(int id) {
		
		return employeeOperataion.getEmployee(id);
	}
	
	public List<Employee> getAllEmployee() {
		return employeeOperataion.getAllEmployee();
	}
	
	public Employee myMethod(String id) {
		return employeeOperataion.myMethod(id);
	}
}
