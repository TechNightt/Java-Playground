package com.daily_byte.date_03_07_2020_jewels_and_stones;
import static com.daily_byte.date_03_07_2020_jewels_and_stones.Solution.*;

class Tester {

	public static void main(String[] args) {
		String jewels = "abc", stones = "ac";
		System.out.println(jewelsAndStones(jewels, stones));
		jewels = "AaaddfFf";
		stones = "Af";
		System.out.println(jewelsAndStones(jewels, stones));
		jewels = "AYOPD";
		stones = "ayopd";
		System.out.println(jewelsAndStones(jewels, stones));
	}
	
}