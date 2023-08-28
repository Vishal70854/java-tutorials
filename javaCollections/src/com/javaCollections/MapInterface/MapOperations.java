package com.javaCollections.MapInterface;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapOperations {
	public static void main(String[] args) {
		// immutable HashMap by using Map.of()
		Map<String, Integer> map = Map.of("A", 3, "b", 5, "Z", 10);
		System.out.println(map);

		// get any key value by using map.get(key)
		System.out.println(map.get("Z")); // 10
		System.out.println(map.get("A")); // 3

		// check if map is empty by using isEmpty()
		System.out.println(map.isEmpty()); // false

		// check the size of map by map.size()
		System.out.println(map.size()); // 3

		// check if it contains a key by containsKey(key)
		System.out.println(map.containsKey("A")); // true

		// check if it contains a key by containsValue(value)
		System.out.println(map.containsValue(12)); // false

		// get the complete set of key by using map.keySet()
		System.out.println(map.keySet());

		// get the complete set of values by using map.values()
		System.out.println(map.values());

		// ******************************************************
		// comparison between Hashmap, linkedhashmap, treemap
		// ******************************************************

		// in hashmap, we dont have order of the elements and neither sorted
		// now we will create mutable hashmap with existing map values
		Map<String, Integer> hashMap = new HashMap<>(map);

		// add elements in hashMap using put(key, value)
		hashMap.put("B", 43);
		System.out.println("in HashMap no sorted no order maintained - " + hashMap);

		// ******************************************************
		// in linkedhashmap, we have order of the elements but not sorted
		LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
		linkedHashMap.put("B", 4);
		linkedHashMap.put("S", 8);
		linkedHashMap.put("K", 2);
		System.out.println("linked hashmap(order maintained here_ - " + linkedHashMap);

		// ******************************************************
		// in treemap, we have order of the elements but not sorted

		TreeMap<String, Integer> treeMap = new TreeMap<>();
		treeMap.put("D", 65);
		treeMap.put("Z", 21);
		treeMap.put("E", 9);
		treeMap.put("A", 34);
		System.out.println("tree map(sorted manner output) - " + treeMap);
	}
}
