package com.oopsAdvanced.interfaces;

public class MarioGame implements GamingConsole {

	@Override
	public void up() {
		System.out.println("Jump");

	}

	@Override
	public void down() {
		System.out.println("goes into a hole");

	}

	@Override
	public void left() {
		System.out.println("go backward");
	}

	@Override
	public void right() {
		System.out.println("go forward");

	}

}
