package com.concurrency;

public class BiCounter {
	private int i = 0;
	private int j = 0;

	synchronized void incrementI() { // thread safe method i.e only 1 thread at a time can use this method
		i++;
		// get i
		// increment
		// set i
	}

	public int getI() {
		return i;
	}

	synchronized void incrementJ() { // thread safe method i.e only 1 thread at a time can use this method
		j++;

		// get i
		// increment
		// set i
	}

	public int getJ() {
		return j;
	}
}
