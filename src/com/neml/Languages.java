package com.neml;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.xml.stream.events.Characters;

public class Languages {

	public static void main(String[] args) {
		
		List<Employee> employees = Arrays.asList(new Employee("John", 50000, Arrays.asList("Java", "Python")),
                new Employee("Mary", 60000, Arrays.asList("C++", "JavaScript")),
                new Employee("David", 70000, Arrays.asList("Java", "C#")),
                new Employee("Emily", 40000, Arrays.asList("Python", "Ruby")),
                new Employee("Michael", 65000, Arrays.asList("Java", "JavaScript")),
                new Employee("John", 50000, Arrays.asList("Java", "golang")),
                new Employee("Emily", 100000, Arrays.asList("Scala", "Php")),
                new Employee("Natsu", 50000, Arrays.asList("C#", "Mandarin")));
//		
//		Map<String, List<CourseEmp>> collect = employees.stream().flatMap(i -> i.getLanguages()
//				.stream().map(course->new CourseEmp(course, i.getName())))
//				.collect(Collectors.groupingBy(CourseEmp::getCourse));
//		
//		System.out.println(collect);
		
		List<Character> charList = employees.stream()
				.flatMap(model -> model.getName().chars().mapToObj(c -> (char) c)).collect(Collectors.toList());
		
		System.out.println(charList);
	
		
		
				
		
	

	}

}

class CourseEmp {

	String course;
	String name;

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public CourseEmp(String course, String name) {
		super();
		this.course = course;
		this.name = name;
	}
	@Override
	public String toString() {
		
		return this.getCourse()+" : "+this.getName();
	}

}

class Employee {

	private String name;
	private int salary;
	private List<String> languages;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public List<String> getLanguages() {
		return languages;
	}

	public void setLanguages(List<String> languages) {
		this.languages = languages;
	}

	public Employee(String name, int salary, List<String> languages) {
		super();
		this.name = name;
		this.salary = salary;
		this.languages = languages;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", languages=" + languages + "]";
	}

}
