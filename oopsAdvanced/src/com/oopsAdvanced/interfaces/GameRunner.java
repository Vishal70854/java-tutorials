package com.oopsAdvanced.interfaces;

public class GameRunner {

	public static void main(String[] args) {
		// note : we can give the type as Interface type and then initialze object using
		// the Class constructor

		// MarioGame game = new MarioGame(); // it can also be done
		GamingConsole game = new MarioGame(); // providing type as Interface type(superclass)
		game.up();
		game.down();
		game.left();
		game.right();

		// object creation for chess game

		// ChessGame game = new ChessGame(); // it can also be done
		GamingConsole game1 = new ChessGame(); // providing type as Interface type(superclass)
		game1.up();
		game1.down();
		game1.left();
		game1.right();

	}

}
