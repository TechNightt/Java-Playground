// Source : https://leetcode.com/problems/roman-to-integer/

/*****************************************************************************************************************************************
 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.                                                    *
 *                                                                                                                                       *
 * Symbol       Value                                                                                                                    *
 * I             1                                                                                                                       *
 * V             5                                                                                                                       *
 * X             10                                                                                                                      *
 * L             50                                                                                                                      *
 * C             100                                                                                                                     *
 * D             500                                                                                                                     *
 * M             1000                                                                                                                    *
 * For example, two is written as II in Roman numeral, just two one's added together. Twelve is written as, XII, which is simply X + II. *
 * The number twenty seven is written as XXVII, which is XX + V + II.                                                                    *
 *                                                                                                                                       *
 * Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII.                 *
 * Instead, the number four is written as IV. Because the one is before the five we subtract it making four.                             *
 * The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:             *
 *                                                                                                                                       *
 * I can be placed before V (5) and X (10) to make 4 and 9.                                                                              *
 * X can be placed before L (50) and C (100) to make 40 and 90.                                                                          *
 *                                                                                                                                       *
 * C can be placed before D (500) and M (1000) to make 400 and 900.                                                                      *
 * Given a roman numeral, convert it to an integer. Input is guaranteed to be within the range from 1 to 3999.                           *
 *                                                                                                                                       *
 * Example 1:                                                                                                                            *
 *                                                                                                                                       *
 * Input: "III"                                                                                                                          *
 * Example 2:                                                                                                                            *
 *                                                                                                                                       *
 * Input: "IV"                                                                                                                           *
 * Output: 4                                                                                                                             *
 * Example 3:                                                                                                                            *
 *                                                                                                                                       *
 * Input: "IX"                                                                                                                           *
 * Output: 9                                                                                                                             *
 * Example 4:                                                                                                                            *
 *                                                                                                                                       *
 * Input: "LVIII"                                                                                                                        *
 * Output: 58                                                                                                                            *
 * Explanation: L = 50, V= 5, III = 3.                                                                                                   *
 * Example 5:                                                                                                                            *
 *                                                                                                                                       *
 * Input: "MCMXCIV"                                                                                                                      *
 * Output: 1994                                                                                                                          *
 * Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.                                                                                  *
 ****************************************************************************************************************************************/
package com.leet_code.easy.q13_roman_to_integer.solution1;

import java.util.HashMap;
/*****************************************************************************************************************************************
                                                                                                       *
 * In this solution I take each roman numeral in String and check if the current roman numeral is smaller than the next one.             *
 * If it is smaller we need to subtract it from the result number.                                                                       *
 * If it larger than it's ok to add it to the number.                                                                                    *
 * For example MXMXCIV:                                                                                                                  *
 * M is larger than C so we add 1000                1000                                                                                 *
 * C is smaller than the next M so we subtract 100  900                                                                                  *
 * M is larger than X so we add 1000                1900                                                                                 *
 * X is smaller than C so we subtract 10            1890                                                                                 *
 * C is larger than I so we add 100                 1990                                                                                 *
 * I is smaller than V so we subtract I             1989                                                                                 *
 * V is the last roman numeral so we add it         1994                                                                                 *
 * This solution is faster than 65.05%                                                                                                   *
 * Time complexity is O(n)    
 *                                                                                                            *
 ****************************************************************************************************************************************/




 public class Solution {	
    public int romanToInt(String s) {
        HashMap<Character, Integer> romanNumerals = new HashMap<Character, Integer>();
        romanNumerals.put('I',1);
        romanNumerals.put('V',5);
        romanNumerals.put('X',10);
        romanNumerals.put('L',50);
        romanNumerals.put('C',100);
        romanNumerals.put('D',500);
        romanNumerals.put('M',1000);
        int res = 0, helper = 0;
        for (int i = 0; i < s.length(); ++i) {
            helper = romanNumerals.get(s.charAt(i));
            if(i < s.length() - 1 && helper < romanNumerals.get(s.charAt(i + 1)))
            	res += -helper;
            else
            	res += helper;
        }
        return res;
    }
}