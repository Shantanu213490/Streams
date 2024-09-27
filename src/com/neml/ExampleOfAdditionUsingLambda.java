package com.neml;

public class ExampleOfAdditionUsingLambda {

	public static void main(String[] args) {
		Add add = (a,b)-> a+b;				
		int result = add.sumOfNumbers(5,6);
		System.out.println(result);	
	}
}
@FunctionalInterface
interface Add{
	int  sumOfNumbers(int a, int b);
}