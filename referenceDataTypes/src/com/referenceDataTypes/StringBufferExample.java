package com.referenceDataTypes;

public class StringBufferExample {

	public static void main(String[] args) {

		// note: ***************************************
		// when we want to make changes in string then it will be costly since String is
		// non-primitive(reference type) which refers to objects
		// that's why if we want to make changes in String then we will use
		// StringBuffer(if we don't want multi-threading)(thread safe)
		// or we will use StringBuilder (if we want multi-threading)
		// ************************************************

		// example :
		String newStr = "this is a lot of text";
		String newStr1 = "hello this is vishal";

		System.out.println("String example - " + newStr + newStr1); // costly in Strings

		// in the above example we can see we are concatenating 2 string objects which
		// is very costly
		// therefore we use StringBuffer or StringBuilder if we have changes in strings
		// since its mutable

		// ******************** String Buffer ****************************

		// StringBuffer is mutable and we append, replace, remove, delete and many more
		// StringBuffer is synchronized and it do not provide multi-threading and so it
		// may be
		// slow
		StringBuffer sb = new StringBuffer("TEst");
		System.out.println("StringBuffer example - " + sb);

		// append string in StringBuffer
		sb.append("Vishal");
		System.out.println(sb);

		// replace a character in StringBuffer
		sb.setCharAt(1, 'e'); // replace 'E' with 'e'
		System.out.println(sb);

		// ******************** String Builder ****************************

		// StringBuilder is similar to StringBuffer but this class support
		// multi-threading
		// it is faster than StringBuffer because multiple threads can execute at a
		// time.
		// if we want multi-threading then we can use StringBuilder
		StringBuilder sb1 = new StringBuilder("new test");
		System.out.println("StringBuilder example - " + sb1);

		// append a string in StringBuilder sb1
		sb1.append("hey test");
		System.out.println(sb1);

	}

}
