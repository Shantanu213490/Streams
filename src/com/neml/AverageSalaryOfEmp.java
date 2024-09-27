package com.neml;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AverageSalaryOfEmp {

	public static void main(String[] args) {
		
		List<EmpInfo> emp = Arrays.asList(new EmpInfo("John", BigDecimal.valueOf(50000.00)),
				new EmpInfo("Alice", BigDecimal.valueOf(60000.00)),
				new EmpInfo("Bob", BigDecimal.valueOf(70000.00)));

		BigDecimal avgSalary = emp.stream().map(EmpInfo::getSalary).reduce(BigDecimal.ZERO, (a, b) -> a.add(b))
				.divide(BigDecimal.valueOf(emp.size()), RoundingMode.CEILING);
		
		System.out.println(avgSalary);

	}

}

class EmpInfo {

	private String name;
	private BigDecimal salary;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "EmpInfo [name=" + name + ", salary=" + salary + "]";
	}

	public EmpInfo(String name, BigDecimal d) {
		super();
		this.name = name;
		this.salary = d;
	}

	public EmpInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
//Question 2: Write a Java 8 Stream API expression to find the average salary of employees in a list,
//where each employee is represented by an object with name and salary properties.
//The salaries are stored as BigDecimal objects.
//
//Example:
//Input: [{"name": "John", "salary": 50000.00},
//        {"name": "Alice", "salary": 60000.00},
//        {"name": "Bob", "salary": 70000.00}]
//Output: 60000.00