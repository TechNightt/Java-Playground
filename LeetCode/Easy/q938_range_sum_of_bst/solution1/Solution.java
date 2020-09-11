// Date   : 06-07-2020

/******************************************************************************************************************************
 * Given the root node of a binary search tree, return the sum of values of all nodes with value between L and R (inclusive). *
 *                                                                                                                            *
 * The binary search tree is guaranteed to have unique values.                                                                *
 *                                                                                                                            *
 *                                                                                                                            *
 *                                                                                                                            *
 * Example 1:                                                                                                                 *
 *                                                                                                                            *
 * Input: root = [10,5,15,3,7,null,18], L = 7, R = 15                                                                         *
 * Output: 32                                                                                                                 *
 * Example 2:                                                                                                                 *
 *                                                                                                                            *
 * Input: root = [10,5,15,3,7,13,18,1,null,6], L = 6, R = 10                                                                  *
 * Output: 23                                                                                                                 *
 *                                                                                                                            *
 *                                                                                                                            *
 * Note:                                                                                                                      *
 *                                                                                                                            *
 * The number of nodes in the tree is at most 10000.                                                                          *
 * The final answer is guaranteed to be less than 2^31.                                                                       *
 *****************************************************************************************************************************/
package com.leet_code.easy.q938_range_sum_of_bst.solution1;

import com.leet_code.utils.TreeNode;

/******************************************************************************************************************************
   Thoughts on implementation:                                                                                                *
 * I take L and R numbers and switch them so that the L number will be the smaller one.                                       *
 * Then I use helper method and recursion to iterate on all TreeNodes and check if their values are between L and R.          *
 * This solution is faster than 52.10%                                                                                        *
 * Time complexity is O(n)                                                                                                    *
 * ***************************************************************************************************************************/
public class Solution {
    public int rangeSumBST(TreeNode root, int L, int R) {
        if(L > R) 
        	L = R + L - (R = L);
    	return rangeSumBST(L, R, root);
    }
    public int rangeSumBST(int min, int max, TreeNode root) {
        if(root == null) {
            return 0;
        }
        if(root.left == null && root.right == null) {
        	return root.val >= min && root.val <= max ? root.val : 0;
        }
        int val = root.val >= min && root.val <= max ? root.val : 0;
        return val + rangeSumBST(min, max, root.left) + rangeSumBST(min, max, root.right);
    }
}