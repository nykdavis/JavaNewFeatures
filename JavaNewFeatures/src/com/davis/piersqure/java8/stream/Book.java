package com.davis.piersqure.java8.stream;

public class Book {

    private int id;
    private String bookName;
    private int releaseYear;
    private int price;
    private String authorName;
    private String genre;

    public Book(int id, String bookName, int releaseYear, int price, String authorName, String genre) {
        this.id = id;
        this.bookName = bookName;
        this.releaseYear = releaseYear;
        this.price = price;
        this.authorName = authorName;
        this.genre = genre;
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public int getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
    
    

}
