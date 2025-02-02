package com.akash.controller;

import java.util.List;
import java.util.Scanner;

import com.akash.entity.Employee;
import com.akash.service.EmployeeService;
import com.akash.utility.EmployeeUtility;

public class Test {

	public static void main(String[] args) {


		
		EmployeeService empservice = new EmployeeService();


		EmployeeService empservice1 = new EmployeeService();
		Scanner sc = new Scanner(System.in);

		System.out.println("what do you want to do ??" + " 1 : save " + " 2 : delete" + " 3 : update " + " 4 : get"
				+ "5 getAllEmployee" + "  6 :- getEmployee with Id pass empId");
		int choice = sc.nextInt();
		switch (choice) {

		case 1: {
			Employee employee = EmployeeUtility.printMenu(sc, false);

			String message = empservice.saveEmployee(employee);

			System.out.println(message);
			break;
		}
		case 2: {
			break;
		}
		case 3: {
			break;
		}
		case 4: {
			System.out.println("enter id :");

			int empid = sc.nextInt();

			Employee employee = empservice.getEmployee(empid);
			if (employee == null) {
				System.out.println("employee not found with this id : " + empid);
			} else {
				System.out.println("Record fetch successfully  OF EMPLOYEE WITH id " + empid + " : " + employee);
			}

			break;
		}
		case 5: {
			List<Employee> list = empservice.getAllEmployee();
			for (int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i));
			}

			break;
		}
		case 6: {
			System.out.println("enter empid :");

			String empid = sc.next();
			Employee employee = empservice.myMethod(empid);
			System.out.println(employee);
			;
		}
		default: {
			System.out.println("enter the correct choice  :- ");
			break;
		}
		}
		
	
	}
}
