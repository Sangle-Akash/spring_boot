package com.akash.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TestConnection {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/empdb";
		String username = "root";
		String password = "root";

		try (Connection connection = DriverManager.getConnection(url, username, password)) {
			System.out.println("Connection successful!");
			LocalDateTime now = LocalDateTime.now();

		} catch (Exception e) {
			System.out.println("Connection failed!");
			e.printStackTrace();
		}
	}
}
