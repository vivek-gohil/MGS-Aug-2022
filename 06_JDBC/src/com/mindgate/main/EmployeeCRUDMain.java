package com.mindgate.main;

import java.util.List;
import java.util.Scanner;

import com.mindgate.pojo.Employee;
import com.mindgate.service.EmployeeService;
import com.mindgate.service.EmployeeServiceInterface;

public class EmployeeCRUDMain {
	public static void main(String[] args) {
		EmployeeServiceInterface employeeServiceInterface = new EmployeeService();

		Scanner scanner = new Scanner(System.in);
		int employeeId;
		String name;
		double salary;
		int choice;
		String continueChoice;
		List<Employee> allEmployees;
		do {
			System.out.println("1. Add New Employee");
			System.out.println("2. Update Employee");
			System.out.println("3. Delete Employee");
			System.out.println("4. Select One Employee");
			System.out.println("5. Select All Employees");
			System.out.println("Enter your choice");
			choice = scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter employeeId");
				employeeId = scanner.nextInt();
				scanner.nextLine();
				System.out.println("Enter Name");
				name = scanner.nextLine();
				System.out.println("Enter Salary");
				salary = scanner.nextDouble();

				Employee employee = new Employee(employeeId, name, salary);
				// Employee employee = new Employee(76, "X", 1000);

				boolean result = employeeServiceInterface.addNewEmployee(employee);

				if (result) {
					System.out.println("Insert Successfull");
				} else {
					System.out.println("Insert Failed");
				}
				break;
			case 5:
				allEmployees = employeeServiceInterface.getAllEmployees();
				for (Employee e : allEmployees) {
					System.out.println(e);
				}
				break;
			case 3:
				System.out.println("Enter employeeId");
				employeeId = scanner.nextInt();

				result = employeeServiceInterface.deleteEmployeeByEmployeeId(employeeId);

				if (result) {
					System.out.println("Insert Successfull");
				} else {
					System.out.println("Insert Failed");
				}
				break;
			default:
				System.out.println("Invalid Choice");
				break;
			}
			System.out.println("Do you want to continue ?");
			continueChoice = scanner.next();
		} while (continueChoice.equals("yes"));
	}
}
