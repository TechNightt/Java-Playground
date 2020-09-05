package com.daily_byte.date_17_07_2020_compare_keystrokes;

import static com.daily_byte.date_17_07_2020_compare_keystrokes.Solution.*;

class Tester {

	public static void main(String[] args) {
		String str1 = "ABC#", str2 = "CD##AB";
		System.out.println(compareKeystrokes(str1, str2));
		str1 = "como#pur#ter";
		str2 = "computer";
		System.out.println(compareKeystrokes(str1, str2));
		str1 = "cof#dim#ng";
		str2 = "code";
		System.out.println(compareKeystrokes(str1, str2));
	}
	
}