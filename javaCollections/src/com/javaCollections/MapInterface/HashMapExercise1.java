package com.javaCollections.MapInterface;

import java.util.HashMap;

public class HashMapExercise1 {
	// get frequency of each character in a string
	public static HashMap<Character, Integer> getFrequencyOfEachCharacter(HashMap<Character, Integer> hashMap) {
		// This is a great thing
		// we have to find out how many time each character
		// occurs in the string
		String string = "This is awesome occasion. This is fresh party ";
		// char[] characters = string.toCharArray(); // it can also be done to count
		// frequency of characters

		for (int i = 0; i < string.length(); i++) {
			char keyV = string.charAt(i);
			Integer integer = hashMap.get(keyV);
			if (integer == null) { // key not found
				hashMap.put(keyV, 1);
			} else {
				hashMap.put(keyV, integer + 1);
			}
		}
//		System.out.println(hashMap);
		return hashMap;
	}

	// get frequency of each letter in a string
	public static HashMap<String, Integer> getFrequencyOfEachString(HashMap<String, Integer> hashMap) {
		// This is a great thing
		// we have to find out how many time each letters occurs in the string
		String string = "This is awesome occasion. This is fresh party ";
		String[] words = string.split(" ");
		for (String word : words) {
			Integer integer = hashMap.get(word);
			if (integer == null) {// key not found
				hashMap.put(word, 1);
			} else {
				hashMap.put(word, integer + 1);
			}
		}
//		System.out.println(hashMap);
		return hashMap;
	}

	public static void main(String[] args) {
		// frequency of each character in a string
		HashMap<Character, Integer> hashMap1 = new HashMap<>();
		HashMap<Character, Integer> resultHashMap = getFrequencyOfEachCharacter(hashMap1);
		System.out.println("frequency of each character in a string");
		System.out.println(resultHashMap);

		// frequency of each letter in a string
		HashMap<String, Integer> hashMap2 = new HashMap<>();
		HashMap<String, Integer> resultHashMap1 = getFrequencyOfEachString(hashMap2);
		System.out.println("frequency of each character in a string");
		System.out.println(resultHashMap1);

	}

}
