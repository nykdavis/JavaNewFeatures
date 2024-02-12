package com.davis.piersqure.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterPractice {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(3,6,11,54,2,34,65,32,89,48);
		
		System.out.println("Printing the even numbers in the given List.");
		System.out.println(list.stream().filter(i -> i%2 == 0).collect(Collectors.toList()));
		
		System.out.println("Printing the odd numbers in the given List.");
		System.out.println(list.stream().filter(i -> i%2 == 1).collect(Collectors.toList()));

	}

}
