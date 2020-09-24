// Source : https://leetcode.com/problems/defanging-an-ip-address/


/**********************************************************************************
 * Given a valid (IPv4) IP address, return a defanged version of that IP address. *
 *                                                                                *
 * A defanged IP address replaces every period "." with "[.]".                    *
 *                                                                                *
 *                                                                                *
 *                                                                                *
 * Example 1:                                                                     *
 *                                                                                *
 * Input: address = "1.1.1.1"                                                     *
 * Output: "1[.]1[.]1[.]1"                                                        *
 * Example 2:                                                                     *
 *                                                                                *
 * Input: address = "255.100.50.0"                                                *
 * Output: "255[.]100[.]50[.]0"                                                   *
 *                                                                                *
 *                                                                                *
 * Constraints:                                                                   *
 *                                                                                *
 * The given address is a valid IPv4 address.                                     *
 *********************************************************************************/
package com.leet_code.easy.q1108_defanging_ip_address.solution1;

/**********************************************************************************
 * Thoughts on implementation:                                                    *                                                                                *
 * Simple solution. I pass on the String and check if the letter is '.'.          *
 * If it is then it is changed to '[.]' accordingly.                              *
 * This solution is faster than 15.50%                                            *
 * Time complexity is O(n)                                                        *
 *********************************************************************************/
public class Solution {
    public static String defangIPaddr(String address) {
    	String res = "";
    	for (int i = 0; i < address.length(); ++i) 
			if(address.charAt(i) == '.')
				res += "[" + address.charAt(i) + "]"; 
			else
				res += address.charAt(i);		
    	return res;
    }	
}