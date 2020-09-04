package com.daily_byte.date_16_07_2020_validate_characters;

import static com.daily_byte.date_16_07_2020_validate_characters.Solution.*;

class Tester {

	public static void main(String[] args) {
		String str = "(){}[]";
		System.out.println(validateCharacters(str));
		str = "(({[]}))";
		System.out.println(validateCharacters(str));
		str = "{(})";
		System.out.println(validateCharacters(str));
		str = "{[(){[]}]{}()}()";
		System.out.println(validateCharacters(str));
		str = "[[(])]";
		System.out.println(validateCharacters(str));
	}
	
}