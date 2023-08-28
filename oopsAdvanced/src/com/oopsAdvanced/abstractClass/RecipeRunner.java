package com.oopsAdvanced.abstractClass;

public class RecipeRunner {

	public static void main(String[] args) {
		// abstract class can extends another abstract class and the concrete class
		// should implement all abstract methods inside it an interface can extend
		Recipe1 recipe1 = new Recipe1();
		// note : we can have normal variable, normal methods also in abstract class
		recipe1.recipeInfo();
		recipe1.execute();

		// recipeWithMicrowave object creation
		RecipeWithMicrowave recipeWithMicrowave = new RecipeWithMicrowave();
		recipeWithMicrowave.execute();

	}

}
