package com.davis.piersqure.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapPractice {

	public static void main(String[] args) {

	//Problem 1:Given a list of strings, find the lengths of each string in the list.
	List<String> list = Arrays.asList("Davis","Reetu","Niki","Sanju","Anju","Riya");
	System.out.println(list.stream().map(i->i.length()).collect(Collectors.toList()));
	
	//Problem 2: Given a list of integers, find the square of each integer in the list.
	List<Integer> list1 = Arrays.asList(3,2,5,33,44,23,41,87,7,1);
	System.out.println(list1.stream().map(i->i*i).collect(Collectors.toList()));
	
	//Problem 3:Given a list of strings, convert each string to uppercase.
    System.out.println(list.stream().map(i->i.toUpperCase()).collect(Collectors.toList()));
    
    //Problem 4:Given a list of strings, extract the first character of each string.
    System.out.println(list.stream().map(i->i.substring(0, 1)).collect(Collectors.toList()));

	}

}
