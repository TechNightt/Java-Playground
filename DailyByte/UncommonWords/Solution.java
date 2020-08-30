
/**************************************************************************************************************************************************************************************************************************************************************************************************************************
 * This question is asked by Amazon. Given two strings representing sentences, return the words that are not common to both strings (i.e. the words that only appear in one of the sentences). You may assume that each sentence is a sequence of words (without punctuation) correctly separated using space characters. *
 *                                                                                                                                                                                                                                                                                                                        *
 * Ex: given the following strings...                                                                                                                                                                                                                                                                                     *
 *                                                                                                                                                                                                                                                                                                                        *
 * sentence1 = "the quick", sentence2 = "brown fox", return ["the", "quick", "brown", "fox"]                                                                                                                                                                                                                              *
 * sentence1 = "the tortoise beat the haire", sentence2 = "the tortoise lost to the haire", return ["beat", "to", "lost"]                                                                                                                                                                                                 *
 * sentence1 = "copper coffee pot", sentence2 = "hot coffee pot", return ["copper", "hot"]                                                                                                                                                                                                                                *
 *************************************************************************************************************************************************************************************************************************************************************************************************************************/
package com.daily_byte.date_08_07_2020_uncommon_words;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution {

	static List<String> uncommonWords(String s1, String s2) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		List<String> res = new ArrayList<String>();
		String[] words1 = s1.split(" ");
		String[] words2 = s2.split(" ");
		
		for (int i = words1.length - 1; i >= 0; --i)
			map.put(words1[i], map.getOrDefault(words1[i], 0) + 1);
		
		for (int i = words2.length - 1; i >= 0; --i)
			map.put(words2[i], map.getOrDefault(words2[i], 0) + 1);
		
		for (String word: map.keySet())
			if (map.get(word) == 1)
				res.add(word);
		
		return res;
	}
	
}