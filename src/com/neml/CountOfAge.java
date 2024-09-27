package com.neml;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountOfAge {

	public static void main(String[] args) {
		
		List<Person> person = Arrays.asList(new Person("John", 25, "NY"), new Person("Jane", 30, "NY"),
				new Person("Bob", 25, "LA"), new Person("Alice", 30, "LA"));
		
		Map<String ,Map<Integer,Long>> map = person.stream().collect(Collectors.groupingBy(Person :: getCity ,Collectors.groupingBy(Person :: getAge, Collectors.counting())));
		
		System.out.println(map);
		
		
		
		
		

	}

}
class Person{
	
	private String name;
	private int age;
	private String city;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Person(String name, int age, String city) {
		super();
		this.name = name;
		this.age = age;
		this.city = city;
		
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", city=" + city + "]";
	}
	
}


//2. Group a list of objects by multiple fields and calculate aggregates
//Given a list of Person objects with fields name, age, and city, use the Stream API 
//to group the list by city and age, and calculate the average age and count of people in each group.

//Example input: [new Person("John", 25, "NY"), new Person("Jane", 30, "NY"), new Person("Bob", 25, "LA"), new Person("Alice", 30, "LA")]
//Expected output: {NY={25=1, 30=1}, LA={25=1, 30=1}}