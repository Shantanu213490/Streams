package com.neml;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ExampleOfArrays {

	public static void main(String[] args) {
		
		int[] arr = {2,7,4,8,3};
		int[] arr1 = {1,9,5,6,0};
		
		int[] a = IntStream.concat(Arrays.stream(arr), Arrays.stream(arr1))
        .sorted()
        .toArray();
		
		for(int i : a) {
			System.out.println(a[i]);
		}

	}

}
