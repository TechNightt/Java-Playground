package com.daily_byte.date_08_07_2020_uncommon_words;

import static com.daily_byte.date_08_07_2020_uncommon_words.Solution.*;
import java.util.List;

class Tester {

	public static void main(String[] args) {
		String sentence1 = "the quick", sentence2 = "brown fox";
		List<String> res = uncommonWords(sentence1, sentence2);
		for (int i = 0; i < res.size(); ++i) {
			System.out.println(res.get(i) + " ");
		}
		
		System.out.println();
		sentence1 = "the tortoise beat the haire";
		sentence2 = "the tortoise lost to the haire";
		res = uncommonWords(sentence1, sentence2);
		for (int i = 0; i < res.size(); ++i) {
			System.out.println(res.get(i) + " ");
		}
		
		System.out.println();
		sentence1 = "copper coffee pot";
		sentence2 = "hot coffee pot";
		res = uncommonWords(sentence1, sentence2);
		for (int i = 0; i < res.size(); ++i) {
			System.out.println(res.get(i) + " ");
		}
	}
	
}