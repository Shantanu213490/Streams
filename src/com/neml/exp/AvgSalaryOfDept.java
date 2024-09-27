package com.neml.exp;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AvgSalaryOfDept {

	public static void main(String[] args) {
		
//3. Given a list of employees, write a stream pipeline that returns a map where the keys are the employee
//departments and the values are the average salaries of each department.
		
		List<Employee1> employees = Arrays.asList(
			    new Employee1("John", "Sales", 50000),
			    new Employee1("Jane", "Marketing", 60000),
			    new Employee1("Bob", "Sales", 70000),
			    new Employee1("Alice", "Marketing", 80000)
			);
		
		Map<String, Double> result = employees.stream().collect(Collectors.groupingBy(Employee1 :: getDepartment,Collectors.averagingDouble(Employee1 :: getSalary)));
		
		result.forEach((department, averageSalary) -> 
        System.out.println(department + ": " + averageSalary));
		
		System.out.println(result);

		
			
	}

}
class Employee1 {
	
	private String name;
	private String department;
	private int salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Employee1(String name, String department, int salary) {
		super();
		this.name = name;
		this.department = department;
		this.salary = salary;
	}
	public Employee1() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee1 [name=" + name + ", department=" + department + ", salary=" + salary + "]";
	}
	
	
	
}