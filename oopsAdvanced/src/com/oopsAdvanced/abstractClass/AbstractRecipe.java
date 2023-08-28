package com.oopsAdvanced.abstractClass;

public abstract class AbstractRecipe {

	public void execute() {
		getReady();
		doTheDish();
		cleanUp();
	}

	abstract void getReady();// prepare

	abstract void doTheDish();// recipe

	abstract void cleanUp();// cleanup
	// note : we can have normal variable, normal methods also in abstract class

	public void recipeInfo() {
		System.out.println("WELCOME TO ABSTRACT RECIPE CLASS");
	}

}
