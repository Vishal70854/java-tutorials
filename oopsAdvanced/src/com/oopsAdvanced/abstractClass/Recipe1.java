package com.oopsAdvanced.abstractClass;

public class Recipe1 extends AbstractRecipe {

	@Override
	void getReady() {
		System.out.println("get the raw materials");

	}

	@Override
	void doTheDish() {
		// TODO Auto-generated method stub
		System.out.println("do the dish");

	}

	@Override
	void cleanUp() {
		// TODO Auto-generated method stub
		System.out.println("clean the dish");

	}

}
