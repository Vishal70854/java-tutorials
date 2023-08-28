package com.javaCodingExercise3;

public class WeatherAdviser {

	public String provideWeatherAdvisory(int temperature) {
		if (temperature < 0) {
			return "It's freezing! Wear a heavy coat.";
		} else if (temperature >= 0 && temperature <= 10) {
			return "It's cold! Bundle up.";
		} else if (temperature >= 11 && temperature <= 20) {
			return "It's cool! A light jacket will do.";
		} else if (temperature > 20) {
			return "It's warm! Enjoy the day.";
		}
		return "";
	}

	public static void main(String[] args) {
		WeatherAdviser weatherAdviser = new WeatherAdviser();
		System.out.println(weatherAdviser.provideWeatherAdvisory(17));
	}
}
