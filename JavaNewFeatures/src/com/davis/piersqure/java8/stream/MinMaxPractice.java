package com.davis.piersqure.java8.stream;

import java.util.Arrays;
import java.util.List;

public class MinMaxPractice {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(3,6,11,54,2,34,65,32,89,48);
		
		//Min integer in the given List
		System.out.println(list.stream().min((a,b)->a.compareTo(b)).get());
		
		//Max integer in the given List
		System.out.println(list.stream().max((a,b)->a.compareTo(b)).get());

	}

}
