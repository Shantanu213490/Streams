package com.neml.exp;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class NestedGrouping {

	public static void main(String[] args) {
		
		Set<EmpInfo> set = new HashSet<>();
				set.add(new EmpInfo("John", "Sales", "Manager"));
				set.add(new EmpInfo("Jane", "Sales", "Salesperson"));
				set.add(new EmpInfo("Bob", "Marketing", "Manager"));
		
		Map<String, Map<String, Set<EmpInfo>>> result = set.stream().collect(Collectors.groupingBy(EmpInfo :: getDepartment ,  Collectors.groupingBy(EmpInfo::getJobTitle, Collectors.toSet())));
		System.out.println(result);
		

	}

}

class EmpInfo{
	
	private String name;
	private String department;
	private String jobTitle;
	public EmpInfo(String name, String department, String jobTitle) {
		super();
		this.name = name;
		this.department = department;
		this.jobTitle = jobTitle;
	}
	public EmpInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
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
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	@Override
	public String toString() {

		return " [name:" + name + ", department:" + department + ", jobTitle:" + jobTitle + "]";
		
	}
	
}

//Nested Grouping: Write a Java program that uses streams to group a list of employees by their department
//and then by their job title.The output should be a map where the key is the department and 
//the value is another map where the key is the job title and the value is a list of employees.
//
//
//Example input:[{name: "John", department: "Sales", jobTitle: "Manager"},
//{name: "Jane", department: "Sales", jobTitle: "Salesperson"},
//{name: "Bob", department: "Marketing", jobTitle: "Manager"}]
//Example output:
//{
//	Sales: {Manager: [{name: "John", department: "Sales", jobTitle: "Manager"}],
//	Salesperson: [{name: "Jane", department: "Sales", jobTitle: "Salesperson"}]},
//	Marketing: {Manager: [{name: "Bob", department: "Marketing", jobTitle: "Manager"}]}}


