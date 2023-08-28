package com.oopsAdvanced;

public class Review {
	// state
	private int id;
	private String description;
	private int rating;

	// constructor
	public Review(int id, String description, int rating) {
		super();
		this.id = id;
		this.description = description;
		this.rating = rating;
	}

	// information about the class/object
	@Override
	public String toString() {
		return id + " " + description + " " + rating;
	}
}
