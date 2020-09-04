// Source : https://leetcode.com/problems/jewels-and-stones/


/*****************************************************************************************************************************************************************************************************************************************
 * You're given strings J representing the types of stones that are jewels, and S representing the stones you have.  Each character in S is a type of stone you have.  You want to know how many of the stones you have are also jewels. *
 *                                                                                                                                                                                                                                       *
 * The letters in J are guaranteed distinct, and all characters in J and S are letters. Letters are case sensitive, so "a" is considered a different type of stone from "A".                                                             *
 *                                                                                                                                                                                                                                       *
 * Example 1:                                                                                                                                                                                                                            *
 *                                                                                                                                                                                                                                       *
 * Input: J = "aA", S = "aAAbbbb"                                                                                                                                                                                                        *
 * Output: 3                                                                                                                                                                                                                             *
 * Example 2:                                                                                                                                                                                                                            *
 *                                                                                                                                                                                                                                       *
 * Input: J = "z", S = "ZZ"                                                                                                                                                                                                              *
 * Output: 0                                                                                                                                                                                                                             *
 * Note:                                                                                                                                                                                                                                 *
 *                                                                                                                                                                                                                                       *
 * S and J will consist of letters and have length at most 50.                                                                                                                                                                           *
 * The characters in J are distinct.                                                                                                                                                                                                     *
 ****************************************************************************************************************************************************************************************************************************************/
package com.leet_code.easy.q771_jewels_and_stones.solution1;

/*****************************************************************************************************************************************************************************************************************************************
 * Thoughts on implementation:                                                                                                   																										 *
 * I iterate on stones string and count how many occurrences of specific characters are there.      																																	 *
 * Then I iterate on jewels string and count the number of letters from jewels string in stones string.                                                             																	 *
 * This solution is faster than 23.92%                                                                                           																										 *
 * The time complexity is O(n)                                                                                                   																										 *
 ****************************************************************************************************************************************************************************************************************************************/
public class Solution {
    public static int numJewelsInStones(String J, String S) {
    	int[] charArr = new int[52];
    	int c = 0;
    	for(int i = 0; i < S.length(); ++i) {
    		if(S.charAt(i) >= 'a' && S.charAt(i) <= 'z') {			
    			++charArr[S.charAt(i) - 97];
    		} else {
    			++charArr[S.charAt(i) - 39];
    		}
    	} 
        for (int i = 0; i < J.length(); ++i) { 
        	if(J.charAt(i) >= 'a' && J.charAt(i) <= 'z') {
        		c += charArr[J.charAt(i) - 97];	
        	} else {
        		c += charArr[J.charAt(i) - 39];
        	}
        }
        return c;
    }
}