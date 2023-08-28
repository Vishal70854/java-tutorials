package com.LoopExamples;

public class WhileNumberPlayerRunner {
	public static void main(String[] args) {
		WhileNumberPlayer player = new WhileNumberPlayer(30);

		// prints square of each number : limit 30
		player.printSquaresUptoLimit();
		System.out.println();
		// prints cube of each number : limit 30
		player.printCubesUptoLimit();
	}
}
