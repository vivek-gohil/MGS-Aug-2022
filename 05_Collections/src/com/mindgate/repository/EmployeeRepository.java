package com.mindgate.repository;

import java.util.ArrayList;
import java.util.List;

import com.mindgate.pojo.Employee;

public class EmployeeRepository {
	private List<Employee> employeeList = new ArrayList<Employee>();

	public boolean addEmployee(Employee employee) {
//		boolean result = employeeList.add(employee);
		return employeeList.add(employee);
	}

	public List<Employee> getAllEmployees() {
		return employeeList;
	}

	public Employee getEmployeeByEmployeeId(int employeeId) {
		for (Employee employee : employeeList) {
			if (employee.getEmployeeId() == employeeId) {
				return employee;
			}
		}
		return null;
	}
	
	public boolean deleteEmployeeByEmployeeId(int employeeId) {
		for (Employee employee : employeeList) {
			if(employee.getEmployeeId() == employeeId) {
				boolean result = employeeList.remove(employee);
				return result;
			}
		}
		return false;
	}
	
	
	
	
	
	
	
}
