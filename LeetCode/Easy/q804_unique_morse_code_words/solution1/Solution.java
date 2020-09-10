// Source : https://leetcode.com/problems/unique-morse-code-words/
// Author : Julian Ghoncharenko
// Date   : 19-07-2020

/************************************************************************************************************************************************************************************************************************************************************************************
 * International Morse Code defines a standard encoding where each letter is mapped to a series of dots and dashes, as follows: "a" maps to ".-", "b" maps to "-...", "c" maps to "-.-.", and so on.                                                                                *
 *                                                                                                                                                                                                                                                                                  *
 * For convenience, the full table for the 26 letters of the English alphabet is given below:                                                                                                                                                                                       *
 *                                                                                                                                                                                                                                                                                  *
 * [".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."]                                                                                                                *
 * Now, given a list of words, each word can be written as a concatenation of the Morse code of each letter. For example, "cab" can be written as "-.-..--...", (which is the concatenation "-.-." + ".-" + "-..."). We'll call such a concatenation, the transformation of a word. *
 *                                                                                                                                                                                                                                                                                  *
 * Return the number of different transformations among all words we have.                                                                                                                                                                                                          *
 *                                                                                                                                                                                                                                                                                  *
 * Example:                                                                                                                                                                                                                                                                         *
 * Input: words = ["gin", "zen", "gig", "msg"]                                                                                                                                                                                                                                      *
 * Output: 2                                                                                                                                                                                                                                                                        *
 * Explanation:                                                                                                                                                                                                                                                                     *
 * The transformation of each word is:                                                                                                                                                                                                                                              *
 * "gin" -> "--...-."                                                                                                                                                                                                                                                               *
 * "zen" -> "--...-."                                                                                                                                                                                                                                                               *
 * "gig" -> "--...--."                                                                                                                                                                                                                                                              *
 * "msg" -> "--...--."                                                                                                                                                                                                                                                              *
 *                                                                                                                                                                                                                                                                                  *
 * There are 2 different transformations, "--...-." and "--...--.".                                                                                                                                                                                                                 *
 * Note:                                                                                                                                                                                                                                                                            *
 *                                                                                                                                                                                                                                                                                  *
 * The length of words will be at most 100.                                                                                                                                                                                                                                         *
 * Each words[i] will have length in range [1, 12].                                                                                                                                                                                                                                 *
 * words[i] will only consist of lowercase letters.                                                                                                                                                                                                                                 *
 ***********************************************************************************************************************************************************************************************************************************************************************************/
package com.leet_code.easy.q804_unique_morse_code_words.solution1;

import java.util.HashMap;

/************************************************************************************************************************************************************************************************************************************************************************************
 * @author Julian Ghoncharenko                                                                                                                                                                                                                                                      *
 * Thoughts on implementation:                                                                                                                                                                                                                                                      *
 * I iterate on words array and then check each letter in current cell word to turn it into morse code.                                                                                                                                                                             *
 * After that I add the current morse code to HashMap as a key.                                                                                                                                                                                                                     *
 * After finishing the iteration on the array I return the size of the HashMap.                                                                                                                                                                                                     * 
 * This solution is faster than 100.00%                                                                                                                                                                                                                                             *
 * Time complexity is O(nm)                                                                                                                                                                                                                                                         *
 * *********************************************************************************************************************************************************************************************************************************************************************************/
public class Solution {
	public static int uniqueMorseRepresentations(String[] words) {
		String[] morse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--",
				"-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.." };
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for(int i = words.length - 1; i >= 0; --i) {
			StringBuilder cur = new StringBuilder();
			for(int j = 0; j < words[i].length(); ++j) {
				cur.append(morse[words[i].charAt(j) - 97]);
			}
			map.put(cur.toString(), 0);
		}
		return map.size();
	}
}