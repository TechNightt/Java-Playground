// Source : https://leetcode.com/problems/maximum-depth-of-binary-tree/

/**********************************************************************************************************************
 * Given a binary tree, find its maximum depth.                                                                       *
 *                                                                                                                    *
 * The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node. *
 *                                                                                                                    *
 * Note: A leaf is a node with no children.                                                                           *
 *                                                                                                                    *
 * Example:                                                                                                           *
 *                                                                                                                    *
 * Given binary tree [3,9,20,null,null,15,7],                                                                         *
 *                                                                                                                    *
 *     3                                                                                                              *
 *    / \                                                                                                             *
 *   9  20                                                                                                            *
 *     /  \                                                                                                           *
 *    15   7                                                                                                          *
 * return its depth = 3.                                                                                              *
 *********************************************************************************************************************/
package com.leet_code.easy.q104_maximum_depth_of_binary_tree.solution1;

import com.leet_code.utils.TreeNode;

/**********************************************************************************************************************
                                                                                  *
 * Thoughts on implementation:                                                                                        *
 * I go through the whole tree recursively and count the depth of each branch. Then I return the maximum depth from   *
 * two branches.                                                                                                      *
 * This solution is faster than 100.00%                                                                               *
 * Time complexity is O(n)                                                                                            *
 * *******************************************************************************************************************/
class Solution {
    public int maxDepth(TreeNode root) {
        if(root == null)
            return 0;
        if(root.right == null && root.left == null)
            return 1;
        int left = 0, right = 0;
        if(root.left != null)
            left = maxDepth(root.left);
        if(root.right != null)
            right = maxDepth(root.right);
        if(left > right)
            return left + 1;
        return right + 1;
   }
}