package com.oopsAdvanced;

public class FanRunner {

	public static void main(String[] args) {
		Fan fan = new Fan("Hawells", 0.4575, "red");

		fan.switchOn();
		System.out.println(fan);
		fan.setSpeed((byte) 3);
		System.out.println(fan);
		fan.switchOff();
		System.out.println(fan);

	}

}
