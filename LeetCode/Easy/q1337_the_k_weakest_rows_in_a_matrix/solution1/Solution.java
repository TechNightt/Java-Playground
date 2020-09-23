// Source : https://leetcode.com/problems/the-k-weakest-rows-in-a-matrix/


/*******************************************************************************************************************************************************************************************************************************************************************************************
 * Given a m * n matrix mat of ones (representing soldiers) and zeros (representing civilians), return the indexes of the k weakest rows in the matrix ordered from the weakest to the strongest.                                                                                          *
 *                                                                                                                                                                                                                                                                                         *
 * A row i is weaker than row j, if the number of soldiers in row i is less than the number of soldiers in row j, or they have the same number of soldiers but i is less than j. Soldiers are always stand in the frontier of a row, that is, always ones may appear first and then zeros. *
 *                                                                                                                                                                                                                                                                                         *
 *                                                                                                                                                                                                                                                                                         *
 *                                                                                                                                                                                                                                                                                         *
 * Example 1:                                                                                                                                                                                                                                                                              *
 *                                                                                                                                                                                                                                                                                         *
 * Input: mat =                                                                                                                                                                                                                                                                            *
 * [[1,1,0,0,0],                                                                                                                                                                                                                                                                           *
 *  [1,1,1,1,0],                                                                                                                                                                                                                                                                           *
 *  [1,0,0,0,0],                                                                                                                                                                                                                                                                           *
 *  [1,1,0,0,0],                                                                                                                                                                                                                                                                           *
 *  [1,1,1,1,1]],                                                                                                                                                                                                                                                                          *
 * k = 3                                                                                                                                                                                                                                                                                   *
 * Output: [2,0,3]                                                                                                                                                                                                                                                                         *
 * Explanation:                                                                                                                                                                                                                                                                            *
 * The number of soldiers for each row is:                                                                                                                                                                                                                                                 *
 * row 0 -> 2                                                                                                                                                                                                                                                                              *
 * row 1 -> 4                                                                                                                                                                                                                                                                              *
 * row 2 -> 1                                                                                                                                                                                                                                                                              *
 * row 3 -> 2                                                                                                                                                                                                                                                                              *
 * row 4 -> 5                                                                                                                                                                                                                                                                              *
 * Rows ordered from the weakest to the strongest are [2,0,3,1,4]                                                                                                                                                                                                                          *
 * Example 2:                                                                                                                                                                                                                                                                              *
 *                                                                                                                                                                                                                                                                                         *
 * Input: mat =                                                                                                                                                                                                                                                                            *
 * [[1,0,0,0],                                                                                                                                                                                                                                                                             *
 *  [1,1,1,1],                                                                                                                                                                                                                                                                             *
 *  [1,0,0,0],                                                                                                                                                                                                                                                                             *
 *  [1,0,0,0]],                                                                                                                                                                                                                                                                            *
 * k = 2                                                                                                                                                                                                                                                                                   *
 * Output: [0,2]                                                                                                                                                                                                                                                                           *
 * Explanation:                                                                                                                                                                                                                                                                            *
 * The number of soldiers for each row is:                                                                                                                                                                                                                                                 *
 * row 0 -> 1                                                                                                                                                                                                                                                                              *
 * row 1 -> 4                                                                                                                                                                                                                                                                              *
 * row 2 -> 1                                                                                                                                                                                                                                                                              *
 * row 3 -> 1                                                                                                                                                                                                                                                                              *
 * Rows ordered from the weakest to the strongest are [0,2,3,1]                                                                                                                                                                                                                            *
 *                                                                                                                                                                                                                                                                                         *
 *                                                                                                                                                                                                                                                                                         *
 * Constraints:                                                                                                                                                                                                                                                                            *
 *                                                                                                                                                                                                                                                                                         *
 * m == mat.length                                                                                                                                                                                                                                                                         *
 * n == mat[i].length                                                                                                                                                                                                                                                                      *
 * 2 <= n, m <= 100                                                                                                                                                                                                                                                                        *
 * 1 <= k <= m                                                                                                                                                                                                                                                                             *
 * matrix[i][j] is either 0 or 1.                                                                                                                                                                                                                                                          *
 ******************************************************************************************************************************************************************************************************************************************************************************************/
package com.leet_code.easy.q1337_the_k_weakest_rows_in_a_matrix.solution1;

import java.util.ArrayList;
import java.util.List;

/*******************************************************************************************************************************************************************************************************************************************************************************************
 * Thoughts on implementation:                                                                                                                                                                                                                                                             *
 * I map all the possible casee inside a list of lists and then I iterate through the whole list of lists and check all those who have elements in them.                                                                                                                                   *
 * This solution is faster than 48.64%                                                                                                                                                                                                                                                     *
 * Time complexity is O(n*m)                                                                                                                                                                                                                                                               *
 * ****************************************************************************************************************************************************************************************************************************************************************************************/
class Solution {
	public int[] kWeakestRows(int[][] mat, int k) {
		int[] res = new int[k];
		List<List<Integer>> helper = new ArrayList<>();

		for (int i = 0; i <= mat[0].length; ++i) {
			helper.add(new ArrayList<Integer>());
		}

		for (int i = 0; i < mat.length; ++i) {
			int count = 0;
			for (int j = 0; j < mat[i].length && mat[i][j] == 1; ++j)
				++count;
			helper.get(count).add(i);
		}

		int l = 0;

		for (int i = 0; i < helper.size() && l < k; ++i) {
			for (int j = 0; j < helper.get(i).size() && l < k; ++j) {
				res[l] = helper.get(i).get(j);
				++l;
			}
		}

		return res;
	}
}
