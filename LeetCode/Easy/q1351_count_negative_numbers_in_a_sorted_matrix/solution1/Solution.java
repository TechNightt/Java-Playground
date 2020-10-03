// Source : https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/

/*****************************************************************************************************
 * Given a m * n matrix grid which is sorted in non-increasing order both row-wise and column-wise.  *
 *                                                                                                   *
 * Return the number of negative numbers in grid.                                                    *
 *                                                                                                   *
 *                                                                                                   *
 *                                                                                                   *
 * Example 1:                                                                                        *
 *                                                                                                   *
 * Input: grid = [[4,3,2,-1],[3,2,1,-1],[1,1,-1,-2],[-1,-1,-2,-3]]                                   *
 * Output: 8                                                                                         *
 * Explanation: There are 8 negatives number in the matrix.                                          *
 * Example 2:                                                                                        *
 *                                                                                                   *
 * Input: grid = [[3,2],[1,0]]                                                                       *
 * Output: 0                                                                                         *
 * Example 3:                                                                                        *
 *                                                                                                   *
 * Input: grid = [[1,-1],[-1,-1]]                                                                    *
 * Output: 3                                                                                         *
 * Example 4:                                                                                        *
 *                                                                                                   *
 * Input: grid = [[-1]]                                                                              *
 * Output: 1                                                                                         *
 *                                                                                                   *
 *                                                                                                   *
 * Constraints:                                                                                      *
 *                                                                                                   *
 * m == grid.length                                                                                  *
 * n == grid[i].length                                                                               *
 * 1 <= m, n <= 100                                                                                  *
 * -100 <= grid[i][j] <= 100                                                                         *
 ****************************************************************************************************/


 package com.leet_code.easy.q1351_count_negative_numbers_in_a_sorted_matrix.solution1;

/*****************************************************************************************************
 * Thoughts on implementation:                                                                       *
 * I iterate on the matrix and count the negative numbers on each grid.                              *
 * This solution is faster than 58.21%                                                               *
 * Time complexity is O(n^2)                                                                         *
 * **************************************************************************************************/

 public class Solution {

    public static int countNegatives(int[][] grid) {
        int c = 0;
        for(int i = 0; i < grid.length; ++i) 
            for(int j  = grid[i].length - 1; j >= 0 && grid[i][j] < 0; --j) 
                    ++c;
        return c;
    }
    
}
