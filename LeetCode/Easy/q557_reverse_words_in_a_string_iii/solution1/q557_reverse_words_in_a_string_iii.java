// Source : https://leetcode.com/problems/reverse-words-in-a-string-iii/


/********************************************************************************************************************************************************
 * Given a string, you need to reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order. *
 *                                                                                                                                                      *
 * Example 1:                                                                                                                                           *
 * Input: "Let's take LeetCode contest"                                                                                                                 *
 * Output: "s'teL ekat edoCteeL tsetnoc"                                                                                                                *
 * Note: In the string, each word is separated by single space and there will not be any extra space in the string.                                     *
 *******************************************************************************************************************************************************/
package com.leet_code.easy.q557_reverse_words_in_a_string_iii.solution1;

/********************************************************************************************************************************************************
                                                                                                                   *
 * Thoughts on implementation:                                                                                                                          *
 * Firstly I split the word that I receive by every white space inside the word.                                                                        *
 * After that I iterate through every word inside the received String and I reverse it.                                                                 *
 * After I reverse every word inside the String that I have received I return it as a new String.                                                       *
 * This solution is faster than 61.81%                                                                                                                  *
 * Time complexity is O(n)                                                                                                                              *
 * *****************************************************************************************************************************************************/


 class Solution {
	
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < words.length; ++i) {
        	StringBuilder current_word_builder = new StringBuilder();
        	String current_word = words[i];
        	
        	for(int j = current_word.length() - 1; j >= 0; --j) {
        		current_word_builder.append(current_word.charAt(j));
        	}
        	
        	result.append(current_word_builder);
        	if(i < words.length - 1)
        		result.append(' ');
        }
        
        return result.toString();
    }
    
}