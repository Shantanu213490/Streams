package com.neml.packages;

import java.util.List;

public class Employee {
	
	private String empid;
	private int age;
	private int salary;
	private List<String> city;
	
	public String getEmpid() {
		return empid;
	}
	public void setEmpid(String empid) {
		this.empid = empid;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public List<String> getCity() {
		return city;
	}
	public void setCity(List<String> city) {
		this.city = city;
	}
	public Employee(String empid, int age, int i, List<String> city) {
		super();
		this.empid = empid;
		this.age = age;
		this.salary = i;
		this.city = city;
	}
	public Employee(String string, int i, int j, List<String> asList, Employee employee) {
		super();
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", age=" + age + ", salary=" + salary + ", city=" + city + "]";
	}
	
	

}

