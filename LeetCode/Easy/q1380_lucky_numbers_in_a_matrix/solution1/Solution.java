// Source : https://leetcode.com/problems/lucky-numbers-in-a-matrix/
// Author : Julian Ghoncharenko
// Date   : 01-08-2020

/*************************************************************************************************************************
 * Given a string s and an integer array indices of the same length.                                                     *
 *                                                                                                                       *
 * The string s will be shuffled such that the character at the ith position moves to indices[i] in the shuffled string. *
 *                                                                                                                       *
 * Return the shuffled string.                                                                                           *
 *                                                                                                                       *
 *                                                                                                                       *
 *                                                                                                                       *
 * Example 1:                                                                                                            *
 *                                                                                                                       *
 *                                                                                                                       *
 * Input: s = "codeleet", indices = [4,5,6,7,0,2,1,3]                                                                    *
 * Output: "leetcode"                                                                                                    *
 * Explanation: As shown, "codeleet" becomes "leetcode" after shuffling.                                                 *
 * Example 2:                                                                                                            *
 *                                                                                                                       *
 * Input: s = "abc", indices = [0,1,2]                                                                                   *
 * Output: "abc"                                                                                                         *
 * Explanation: After shuffling, each character remains in its position.                                                 *
 * Example 3:                                                                                                            *
 *                                                                                                                       *
 * Input: s = "aiohn", indices = [3,1,4,2,0]                                                                             *
 * Output: "nihao"                                                                                                       *
 * Example 4:                                                                                                            *
 *                                                                                                                       *
 * Input: s = "aaiougrt", indices = [4,0,2,6,7,3,1,5]                                                                    *
 * Output: "arigatou"                                                                                                    *
 * Example 5:                                                                                                            *
 *                                                                                                                       *
 * Input: s = "art", indices = [1,0,2]                                                                                   *
 * Output: "rat"                                                                                                         *
 *                                                                                                                       *
 *                                                                                                                       *
 * Constraints:                                                                                                          *
 *                                                                                                                       *
 * s.length == indices.length == n                                                                                       *
 * 1 <= n <= 100                                                                                                         *
 * s contains only lower-case English letters.                                                                           *
 * 0 <= indices[i] < n                                                                                                   *
 * All values of indices are unique (i.e. indices is a permutation of the integers from 0 to n - 1).                     *
 ************************************************************************************************************************/
package com.leet_code.easy.q1380_lucky_numbers_in_a_matrix.solution1;

import java.util.ArrayList;
import java.util.List;

/*************************************************************************************************************************
 * @author Julian Ghoncharenko                                                                                           *
 * Thoughts on implementation:                                                                                           *
 * I iterate through every row in the matrix and when I find the smallest number in that row I iterate through column    *
 * I check if it's the largest number in the column.                                                                     *
 * This solution is faster than 97.89%                                                                                   *
 * Time complexity is O(m*n)                                                                                             *
 * **********************************************************************************************************************/
class Solution {

    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> res = new ArrayList<Integer>();
        for(int i = 0; i < matrix.length; ++i) {
            int[] min_in_row = checkColumns(matrix, i);
            int max_in_column = checkRows(matrix, min_in_row[1]);
            
            if(min_in_row[0] == max_in_column)
                res.add(max_in_column);
        }
        return res;
    }
    
    private int[] checkColumns(int[][] matrix, int row) {
        int min = matrix[row][0], index = 0;

        for(int i = 1, j = matrix[row].length - 1; i < j + 1; ++i, --j) {
            if(matrix[row][i] < min) {
                min = matrix[row][i];
                index = i;
            } 
            if(matrix[row][j] < min) {
                min = matrix[row][j];
                index = j;
            }
        }
        
        return new int[] { min, index };
    }
    
    private int checkRows(int[][] matrix, int column) {
        int max = matrix[0][column];
        
        for(int i = 1, j = matrix.length - 1; i < j + 1; ++i, --j) {
            if(matrix[i][column] > max) {
                max = matrix[i][column];
            } 
            if(matrix[j][column] > max) {
                max = matrix[j][column];
            } 
        }
        
        return max;
    }
          
}
