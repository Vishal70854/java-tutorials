package com.concurrency;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.LongAdder;

public class ConcurrentMapRunner {

	public static void main(String[] args) {
		// longAdder gives atomic increment/decrement operations
		// we have used ConcurrentHashMap for providing different locks at different
		// regions and also it provides atomic operations to be done smoothly.
		ConcurrentMap<Character, LongAdder> occurences = new ConcurrentHashMap<>();

		String str = "ABCD ABCD ABCD";
		for (char character : str.toCharArray()) { // convert String to Character array
			// this code is same as code below
			// here we have used concurrentmap for thread safe code
			// used lambda function
			occurences.computeIfAbsent(character, ch -> new LongAdder()).increment();

			// same as line 17 code
//			LongAdder longAdder = occurences.get(character);
//			if (longAdder == null) {
//				longAdder = new LongAdder();
//			}
//			longAdder.increment();
//			occurences.put(character, longAdder);
		}

		System.out.println(occurences);

	}

}