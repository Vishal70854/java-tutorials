package com.LoopExamples;

public class WhileNumberPlayer {

	private int limit;

	public WhileNumberPlayer(int limit) {
		// TODO Auto-generated constructor stub
		this.limit = limit;
	}

	public void printSquaresUptoLimit() {
		// TODO Auto-generated method stub
		int i = 1;
		while (i * i <= limit) {
			System.out.print(i * i + " ");
			i++;
		}

	}

	public void printCubesUptoLimit() {
		// TODO Auto-generated method stub
		int i = 1;
		while (i * i * i <= limit) {
			System.out.print(i * i * i + " ");
			i++;
		}
	}

}
