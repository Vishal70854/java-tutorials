package com.oopsAdvanced.abstractClass;

public class RecipeWithMicrowave extends AbstractRecipe {

	@Override
	void getReady() {
		System.out.println("get the raw materials");
		System.out.println("switch on the microwave");

	}

	@Override
	void doTheDish() {
		// TODO Auto-generated method stub
		System.out.println("do the dish");
		System.out.println("cook using microwave");

	}

	@Override
	void cleanUp() {
		// TODO Auto-generated method stub
		System.out.println("clean the dish");
		System.out.println("switch off the microwave");

	}

}
