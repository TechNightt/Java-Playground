package com.daily_byte.date_18_07_2020_remove_adjacent_duplicates;

import static com.daily_byte.date_18_07_2020_remove_adjacent_duplicates.Solution.*;

public class Tester {
	
	public static void main(String[] args) {
		String str = "abccba";
		System.out.println(removeAdjacentDuplicates(str));
		str = "foobar";
		System.out.println(removeAdjacentDuplicates(str));
		str = "abccbefggfe";
		System.out.println(removeAdjacentDuplicates(str));
	}
	
}