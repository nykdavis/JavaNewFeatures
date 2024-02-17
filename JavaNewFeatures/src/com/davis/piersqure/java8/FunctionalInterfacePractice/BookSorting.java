package com.davis.piersqure.java8.FunctionalInterfacePractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class BookSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Book> bookList = new ArrayList<>(); 
		bookList.add(new Book("Book1", 2013,"Auther1","RomCOM"));
		bookList.add(new Book("Book2", 2013,"Auther2","RomCOM"));
		bookList.add(new Book("Book3", 2013,"Auther3","Si-Fi"));
		bookList.add(new Book("Book4", 2013,"Auther4","Si-Fi"));
		bookList.add(new Book("Book5", 2013,"Auther5","Si-Fi"));
		bookList.add(new Book("Book6", 2013,"Auther6","BioPic"));
		bookList.add(new Book("Book7", 2013,"Auther7","BioPic"));
		bookList.add(new Book("Book8", 2013,"Auther8","AutoBio"));
		bookList.add(new Book("Book9", 2013,"Auther9","RomCOM"));
		bookList.add(new Book("Book10", 2013,"Auther10","AutoBio"));
		bookList.add(new Book("Book11", 2013,"Auther11","RomCOM"));
		
		
		Map<String,Long> map = bookList.stream()
				.collect(Collectors.groupingBy(Book::getGenre,Collectors.counting()));
		
		System.out.println(map);

	}

}

