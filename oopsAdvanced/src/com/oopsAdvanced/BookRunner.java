package com.oopsAdvanced;

public class BookRunner {

	public static void main(String[] args) {
		Book book = new Book(1, "Harry potter", "vishal");
		book.addReview(new Review(1, "awesome", 4));
		book.addReview(new Review(20, "great", 5));
		System.out.println(book);

	}

}
