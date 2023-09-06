package com.concurrency;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListRunner {

	public static void main(String[] args) {
		List<String> list = new CopyOnWriteArrayList<>();
		/*
		 * copyonwritearraylist also implements List interface and it has all methods as
		 * arraylist but the advantage is that for every new element added here. the
		 * copyonwritearraylist will create new arraylist each time. thus, expensive in
		 * terms of adding new data but very fast in terms of reading
		 * 
		 * here add() method is synchronizes only and get() method is free enough to
		 * prefer concurrency.
		 * 
		 * thus if we have higher reads and less writes then we will prefer the above
		 */

		// threads - 3 writes
		list.add("Ant");
		list.add("Bat");
		list.add("Rat");

		// threads - 1000 reads
		for (String str : list) {
			System.out.println(str);
		}
	}

}
