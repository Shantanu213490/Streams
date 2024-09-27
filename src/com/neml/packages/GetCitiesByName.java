package com.neml.packages;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.neml.streams.Student;

public class GetCitiesByName {

	public static void main(String[] args) {
		
//		List<Employee> emp = Arrays.asList( new Employee("N1", 29, 301000, Arrays.asList("nagpur","pune","mumbai")), new Employee("N2", 28, 302,Arrays.asList("nagpur","pune")));

		
	List<Employee> emp = new ArrayList<>();
		  
		Employee e1 = new Employee("N1", 29, 301000, Arrays.asList("nagpur","pune","mumbai"));
        Employee e3 = new Employee("N2", 28, 302,Arrays.asList("nagpur","pune"));
        Employee e6 = new Employee("N3", 27, 302,Arrays.asList("nagpur","pune","mumbai","delhi"));
        Employee e5 = new Employee("N4", 28, 3069,Arrays.asList("nagpur","pune","mumbai","delhi"));
        Employee e2 = new Employee("N5", 25, 305,Arrays.asList("nagpur"));
        Employee e4 = new Employee("N6", 30, 3069,Arrays.asList("bhopal","pune","mumbai","delhi"));
        Employee e8 = new Employee("N7", 31, 306,Arrays.asList("jaipur","pune","mumbai","delhi"));
        
         emp.add(e1);
         emp.add(e3);
         emp.add(e6);
         emp.add(e5);
         emp.add(e2);
         emp.add(e4);
         emp.add(e8);
//         String commonCity = "pune";
//         
//         List<Employee> employeesWithCommonCity = emp.stream()
//                 .filter(employee -> employee.getCity().contains(commonCity))
//                 .collect(Collectors.toList());
	

       
         List<List<Employee>> emp1 = new ArrayList<List<Employee>>();
         List<Employee> finalList = emp1.stream().flatMap(i -> i.stream()).collect(Collectors.toList());
         
         
       
	}

}
