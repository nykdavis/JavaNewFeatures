package com.davis.java11.toArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ToArrayPractice {

	public static void main(String[] args) {
	
		List<Integer> intList = new ArrayList<>();
		intList.add(2);
		intList.add(8);
		intList.add(32);
		intList.add(7);
		
		System.out.println(intList);
		
		Integer[] intArr = intList.toArray(Integer[] :: new);
		System.out.println(Arrays.toString(intArr));
		
		List<String> strList = new ArrayList<>();
		strList.add("Davis");
		strList.add("Reetu");
		strList.add("Niki");
		
		System.out.println(strList);
		
		String[] strArr = strList.toArray(String[] :: new);
		System.out.println(Arrays.toString(strArr));

	}

}
