package com.daily_byte.date_06_07_2020_spot_the_difference;
import static com.daily_byte.date_06_07_2020_spot_the_difference.Solution.*;

class Tester {

	public static void main(String[] args) {
		String s = "foobar", t = "barfoot";
		System.out.println(spotTheDifference(s, t));
		s = "ide";
		t = "idea";
		System.out.println(spotTheDifference(s, t));
		s = "coding";
		t = "ingcod";
		System.out.println(spotTheDifference(s, t));
	}
	
}