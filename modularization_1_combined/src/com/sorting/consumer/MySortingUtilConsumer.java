package com.sorting.consumer;

import java.util.List;

import com.sorting.util.MySortingUtil;

public class MySortingUtilConsumer {
//	private static Logger logger = Logger.getLogger(MySortingUtilConsumer.class.getName());

	public static void main(String[] args) {
		MySortingUtil util = new MySortingUtil();
		List<String> sorted = util.sort(List.of("Range", "vishal", "adam", "eve", "satish"));
		System.out.println(sorted);
//		logger.info(sorted.toString());   

	}
}
