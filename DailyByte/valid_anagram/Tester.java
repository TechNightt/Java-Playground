package com.daily_byte.date_04_07_2020_valid_anagram;
import static com.daily_byte.date_04_07_2020_valid_anagram.Solution.*;

class Tester {

	public static void main(String[] args) {
		String s = "cat", t = "tac";
		System.out.println(validAnagram(s, t));
		s = "listen";
		t = "silent";
		System.out.println(validAnagram(s, t));
		s = "program";
		t = "function";
		System.out.println(validAnagram(s, t));
	}
	
}