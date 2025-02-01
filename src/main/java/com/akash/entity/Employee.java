package com.akash.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Employee {
	@Id
	@Column(name = "empId", unique = true, nullable = false)
	private String empId;

	@Column(name = "empDId", unique = false, nullable = true)
	private int empDId;

	@Column(name = "empName", unique = false, nullable = false)
	private String empName;

	@Column(name = "empSalary", unique = false, nullable = true)
	private double empSalary;

	@Column(name = "address", unique = false, nullable = true)
	private String address;

	public Employee() {
		super();
	}

	public Employee(String empId, int empDId, String empName, double empSalary, String address) {
		super();
		this.empId = empId;
		this.empDId = empDId;
		this.empName = empName;
		this.empSalary = empSalary;
		this.address = address;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public int getEmpDId() {
		return empDId;
	}

	public void setEmpDId(int empDId) {
		this.empDId = empDId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empDId=" + empDId + ", empName=" + empName + ", empSalary=" + empSalary
				+ ", address=" + address + "]";
	}

}
