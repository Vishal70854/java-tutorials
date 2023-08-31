package com.generics;

import java.util.ArrayList;

// if we write <T extends Number> then it means we can only take in Number values
public class MyCustomList<T> { // here T means we are saying it can accept any type of data
	ArrayList<T> arrayList = new ArrayList<>();

	public void addElement(T element) { // T means accept any data i.e not necessarily of same type
		arrayList.add(element);
	}

	public void removeElement(T element) {
		arrayList.remove(element);
	}

	// return element of type provided by the user. i.e return type T
	public T get(int index) {
		return arrayList.get(index);
	}

	// provide info about the object using toString()
	@Override
	public String toString() {
		return arrayList.toString();
	}
}
