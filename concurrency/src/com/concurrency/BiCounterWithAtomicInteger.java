package com.concurrency;

import java.util.concurrent.atomic.AtomicInteger;

public class BiCounterWithAtomicInteger {

	private AtomicInteger i = new AtomicInteger(); // create atomicinteger instance
	private AtomicInteger j = new AtomicInteger();

	void increment() { // thread safe method i.e only 1 thread at a time can use this method
		// atomic integer is used for getting atomically incremented int values
		// otherwise we have used lock for thread safety.
		i.incrementAndGet();

	}

	public int getI() {
		return i.get();
	}

	void incrementJ() { // thread safe method i.e only 1 thread at a time can use this method
		j.incrementAndGet();
	}

	public int getJ() {
		return j.get();
	}
}
