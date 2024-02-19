package com.davis.piersqure.java8.FunctionalInterfacePractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BookSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Book> bookList = new ArrayList<>(); 
		bookList.add(new Book("Book1", 2013,"Auther1","RomCOM"));
		bookList.add(new Book("Book2", 2010,"Auther2","RomCOM"));
		bookList.add(new Book("Book3", 2022,"Auther3","Si-Fi"));
		bookList.add(new Book("Book4", 2024,"Auther4","Si-Fi"));
		bookList.add(new Book("Book5", 2019,"Auther5","Si-Fi"));
		bookList.add(new Book("Book6", 2021,"Auther6","BioPic"));
		bookList.add(new Book("Book7", 2020,"Auther7","BioPic"));
		bookList.add(new Book("Book8", 2013,"Auther8","AutoBio"));
		bookList.add(new Book("Book9", 2022,"Auther9","RomCOM"));
		bookList.add(new Book("Book10", 2017,"Auther10","AutoBio"));
		bookList.add(new Book("Book11", 2016,"Auther11","RomCOM"));
		
		//Filter out the books in each genre and store in a map
		Map<String,Long> map = bookList.stream()
				.collect(Collectors.groupingBy(Book::getGenre,Collectors.counting()));
		
		System.out.println(map);
		
		//Find out the book name which has been release after 2020.
		System.out.println(bookList.stream().filter(b -> b.getYearOfRelease()>2019)
				.map(Book::getName)
				.collect(Collectors.toList()));
		
		//Find out the one book name of each genre
		System.out.println(bookList.stream()
				.map(Book::getGenre)
				.distinct()
				.toList());

	}

}

