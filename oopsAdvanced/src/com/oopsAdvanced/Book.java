package com.oopsAdvanced;

import java.util.ArrayList;

public class Book {
	// state or member variable
	private int id;
	private String name;
	private String author;
	private ArrayList<Review> reviews = new ArrayList<Review>();

	// creation of constructor
	public Book(int id, String name, String author) {
		this.id = id;
		this.name = name;
		this.author = author;
	}

	public void addReview(Review review) {
		this.reviews.add(review);
	}

	// information about the class/object
	@Override
	public String toString() {
		return String.format("id - %d, name - %s, author - %s, reviews - %s", id, name, author, reviews);
	}

}
