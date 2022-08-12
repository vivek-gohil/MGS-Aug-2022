package com.mindgate.main;

import java.util.List;

import com.mindgate.pojo.Employee;
import com.mindgate.repository.EmployeeRepository;

public class EmployeeRepositoryMain {

	public static void main(String[] args) {
		EmployeeRepository employeeRepository = new EmployeeRepository();

		Employee employee1 = new Employee(1, "Test 1", 1000);
		Employee employee2 = new Employee(2, "Test 2", 1000);
		Employee employee3 = new Employee(3, "Test 3", 1000);

		employeeRepository.addEmployee(employee1);
		employeeRepository.addEmployee(employee2);
		employeeRepository.addEmployee(employee3);

//		List<Employee> employees = employeeRepository.getAllEmployees();
//
//		for (Employee employee : employees) {
//			System.out.println(employee);
//		}
//
//		System.out.println();
//		Employee e = employeeRepository.getEmployeeByEmployeeId(20);
//		System.out.println(e);

		System.out.println("B4 Delete");
		List<Employee> employees = employeeRepository.getAllEmployees();

		for (Employee employee : employees) {
			System.out.println(employee);
		}

		boolean result = employeeRepository.deleteEmployeeByEmployeeId(2);

		System.out.println("After Delete");
		employees = employeeRepository.getAllEmployees();

		for (Employee employee : employees) {
			System.out.println(employee);
		}

	}

}
