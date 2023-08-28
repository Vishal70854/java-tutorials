package com.oopsAdvanced.interfaces;

public class ChessGame implements GamingConsole {
	@Override
	public void up() {
		System.out.println("goes up");

	}

	@Override
	public void down() {
		System.out.println("goes down");

	}

	@Override
	public void left() {
		System.out.println("go left");
	}

	@Override
	public void right() {
		System.out.println("go right");

	}
}
