package com.davis.piersqure.java8.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class BookOperation {

	public static void main(String[] args) {

		List<Book> books = Arrays.asList(new Book(1, "Java", 1995, 234, "Mr. Davis", "Educational"),
				new Book(2, "Python", 2000, 200, "Ms. Smith", "Educational"),
				new Book(3, "C++", 1998, 180, "Dr. Johnson", "Educational"),
				new Book(4, "JavaScript", 2005, 150, "Mr. Wilson", "Educational"),
				new Book(5, "Data Structures", 2010, 300, "Ms. Lee", "Educational"),
				new Book(6, "Algorithms", 2012, 280, "Dr. Brown", "Educational"),
				new Book(7, "Artificial Intelligence", 2018, 400, "Mr. White", "Educational"),
				new Book(8, "Machine Learning", 2016, 350, "Ms. Johnson", "Educational"),
				new Book(9, "Deep Learning", 2020, 380, "Dr. Smith", "Educational"),
				new Book(10, "Computer Networks", 2014, 320, "Mr. Green", "Educational"));

		// 1. Find the average book price.
		System.out.println("Avg. book price:  " + books.stream().mapToDouble(Book::getPrice).average().orElse(0));

		// 2. Find the book with the highest price
		Optional<Book> bookPrice = books.stream().max(Comparator.comparing(Book::getPrice));
		bookPrice.ifPresent(b -> System.out.println(b.getPrice()));

		// 3. Find all the book published after 2000
		books.stream().filter(book -> book.getReleaseYear() >= 2000)
				.forEach(book -> System.out.print(book.getBookName() + " "));

		// 4. Find total price of all the book published after 2000
		System.out.println("\n"+
				books.stream().filter(book -> book.getReleaseYear() >= 2000).mapToDouble(Book::getPrice).sum());

	}

}
