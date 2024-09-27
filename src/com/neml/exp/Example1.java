package com.neml.exp;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Example1 {
	
	public static void main(String[] args) {
		
//1.Write a method that takes a list of objects and returns a map where each key is a unique field value and its value is a list of objects that have that field value.
//Example input: [{name="John", department="Sales"}, {name="Jane", department="Marketing"}, {name="Bob", department="Sales"}] 
//Expected output: {Sales=[{name="John", department="Sales"}, {name="Bob", department="Sales"}], Marketing=[{name="Jane", department="Marketing"}]}
		
		List<Employee> ls = Arrays.asList(new Employee("John","Sales","20")
				,new Employee("Jane","Marketing","25")
				,new Employee("Bob","Sales","25"));
	
//		Map<String,List<Employee>> map = ls.stream().collect(Collectors.groupingBy(Employee :: getDepartment));
//		System.out.println(map);
		
//Question 3: Given a list of objects, find the object that has the maximum value for a specific field. If there are multiple objects with the same maximum value, return the first one.
//Example input: [{name="John", age=25}, {name="Jane", age=30}, {name="Bob", age=30}]
//Expected output: {name="Jane", age=30}
		
		Employee emp = ls.stream().max(Comparator.comparing(Employee :: getAge)).get();
		System.out.println(emp);
		
	}

}
class Employee{
	
	private String name;
	private String department;
	private String age;
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
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", department=" + department + ", age=" +age+ "]";
	}
	public Employee(String name, String department,String age) {
		super();
		this.name = name;
		this.department = department;
		this.age=age;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
}