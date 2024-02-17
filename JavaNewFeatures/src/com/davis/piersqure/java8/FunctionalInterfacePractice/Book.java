package com.davis.piersqure.java8.FunctionalInterfacePractice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {
	
	private String name;
	private int yearOfRelease;
	private String auther;
	private String genre;

	
	
}
