package com.davis.piersqure.java8.stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UniqueElements {

	public static void main(String[] args) {
        List<Integer> li1 = Arrays.asList(2,5,6,3,2,7,3,89,34); 
		List<Integer> li2 = Arrays.asList(2,51,6,23,2,7,33,89,31); 
		
		
		//1. Find the unique elements of li1 and li2 into a new list
		List<Integer> list = Stream.concat(li1.stream(), li2.stream())
				.distinct()
				.collect(Collectors.toList());
		
		System.out.println(list);
		
		//2. Find the unique elements of both the array and print		
		Stream.concat(li1.stream(), li2.stream()).distinct().forEach(element-> System.out.print(element+ " "));
		
		System.out.println("\n");
		
		//3.common elements
		li1.stream().filter(li2::contains).forEach(element -> System.out.print(element+" "));
		
	}

}
