package com.davis.piersqure.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortingPractice {

	public static void main(String[] args) {
		
		//Problem 1: Sort the array 
		List<Integer> list = Arrays.asList(3,2,5,33,44,23,41,87,7,1);
		System.out.println(list.stream().sorted().collect(Collectors.toList()));
		
		//Problem 2: Sorting the array in Descending order
		System.out.println(list.stream().sorted((a,b)->b.compareTo(a)).collect(Collectors.toList()));

	}

}
