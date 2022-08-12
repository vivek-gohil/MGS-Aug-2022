package com.mindgate.main;

import java.util.HashSet;
import java.util.Set;

import com.mindgate.pojo.Employee;

public class EmployeeSetMain {
	public static void main(String[] args) {
		Set<Employee> employeeSet = new HashSet<>();

		Employee e1 = new Employee(1, "X", 100);
		System.out.println("e1 :: " + e1.hashCode());
		Employee e2 = new Employee(1, "X", 100);
		System.out.println("e2 :: " + e2.hashCode());

		employeeSet.add(e1);
		employeeSet.add(e2);

		for (Employee employee : employeeSet) {
			System.out.println(employee);
		}
	}
}
