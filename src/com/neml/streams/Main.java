package com.neml.streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		
		
		List<Student> list = Arrays.asList(
			    new Student(1, "Rohit", "Mall", 30, "Male", "Mechanical Engineering", 2015, "Mumbai", 122),
			    new Student(2, "Pulkit", "Singh", 56, "Male", "Computer Engineering", 2018, "Delhi", 67),
			    new Student(3, "Ankit", "Patil", 25, "Female", "Mechanical Engineering", 2019, "Kerala", 164),
			    new Student(4, "Satish Ray", "Malaghan", 30, "Male", "Mechanical Engineering", 2014, "Kerala", 26),
			    new Student(5, "Roshan", "Mukd", 23, "Male", "Biotech Engineering", 2022, "Mumbai", 12),
			    new Student(6, "Chetan", "Star", 24, "Male", "Mechanical Engineering", 2023, "Karnataka", 90),
			    new Student(7, "Arun", "Vittal", 26, "Male", "Electronics Engineering", 2014, "Karnataka", 324),
			    new Student(8, "Nam", "Dev", 31, "Male", "Computer Engineering", 2014, "Karnataka", 433),
			    new Student(9, "Sonu", "Shankar", 27, "Female", "Computer Engineering", 2018, "Karnataka", 7),
			    new Student(10, "Shubham", "Pandey", 26, "Male", "Instrumentation Engineering", 2017, "Mumbai", 98));
		
//		Collections.sort(list,new NameComparartor());
//		System.out.println(list);
		
	
//		Double avgAge = list.stream().filter(i -> {
//			if (i.getFirstName().startsWith("a")||i.getFirstName().startsWith("e")|| 
//					i.getFirstName().startsWith("i")||i.getFirstName().startsWith("o")||i.getFirstName().startsWith("u")) {
//				return true;
//			} else {
//				return false;
//			}
//		}).collect(Collectors.averagingDouble(Student::getAge));
		
		Double avgAge = list.stream().filter(i -> {
		    if (i.getFirstName().toLowerCase().startsWith("a")||i.getFirstName().toLowerCase().startsWith("e")|| 
		            i.getFirstName().toLowerCase().startsWith("i")||i.getFirstName().toLowerCase().startsWith("o")||i.getFirstName().toLowerCase().startsWith("u")) {
		        return true;
		    } else {
		        return false;
		    }
		}).collect(Collectors.averagingDouble(Student::getAge));
		
//		double avgAge = list.stream()
//		        .filter(i -> "aeiou".indexOf(Character.toLowerCase(i.getFirstName().charAt(0))) != -1)
//		        .mapToDouble(Student::getAge)
//		        .average()
//		        .orElse(0.0); // default value if the stream is empty
		System.out.println(avgAge);
		
	}

}
