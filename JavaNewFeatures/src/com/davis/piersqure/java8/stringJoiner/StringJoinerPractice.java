package com.davis.piersqure.java8.stringJoiner;

import java.util.StringJoiner;

public class StringJoinerPractice {

	public static void main(String[] args) {
		StringJoiner joiner = new StringJoiner(":");
		joiner.add("Reetu");
		joiner.add("Niki");
		joiner.add("Gudesh");
		joiner.add("Gudu");
		joiner.add("Pikesh");
		joiner.add("Riya");
		joiner.add("Mukesh");
		
		System.out.println(joiner);

	}

}
