package com.neml.streams;

import java.util.Comparator;

public class NameComparartor implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		return o1.getFirstName().compareTo(o2.getFirstName())* -1;
	}

}
