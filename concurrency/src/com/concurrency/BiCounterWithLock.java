package com.concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BiCounterWithLock {
	private int i = 0;
	private int j = 0;

	Lock lockForI = new ReentrantLock(); // create lock instance
	Lock lockForJ = new ReentrantLock();

	void incrementI() { // thread safe method i.e only 1 thread at a time can use this method
		lockForI.lock();// Get Lock for I
		i++;
		lockForI.unlock();// Release Lock for I

	}

	public int getI() {
		return i;
	}

	void incrementJ() { // thread safe method i.e only 1 thread at a time can use this method
		lockForJ.lock();// Get Lock for J
		i++;
		lockForJ.unlock();// Release Lock for J
	}

	public int getJ() {
		return j;
	}
}
