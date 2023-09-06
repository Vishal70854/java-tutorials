package com.concurrency;

public class Counter {
	private int i = 0;

	synchronized void increment() { // thread safe method i.e only 1 thread at a time can use this method
		i++;
		// get i
		// increment
		// set i
	}

	public int getI() {
		return i;
	}

}
