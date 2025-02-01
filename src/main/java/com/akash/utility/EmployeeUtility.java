package com.akash.utility;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import com.akash.entity.Employee;

public class EmployeeUtility {

	public static Employee printMenu(Scanner sc, boolean value) {
		String productID = null;
		if (value) {
			System.out.println("enter the emp id :-");
			productID = sc.next();
		} else {
			LocalDateTime now = LocalDateTime.now();
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMddmm");
			productID = now.format(formatter);

		}

		System.out.println("enter the did:-");
		int did = sc.nextInt();

		System.out.println("enter the name:-");
		String name = sc.next();

		System.out.println("enter the salary");
		double salary = sc.nextDouble();

		System.out.println("enter the address");
		String address = sc.next();

		Employee employee = new Employee(productID, did, name, salary, address);

		return employee;

	}
}
