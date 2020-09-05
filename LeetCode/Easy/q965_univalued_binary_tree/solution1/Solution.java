// Source : https://leetcode.com/problems/univalued-binary-tree/
// Author : Julian Ghoncharenko
// Date   : 10-08-2020

/****************************************************************************
 * A binary tree is univalued if every node in the tree has the same value. *
 *                                                                          *
 * Return true if and only if the given tree is univalued.                  *
 *                                                                          *
 *                                                                          *
 *                                                                          *
 * Example 1:                                                               *
 *                                                                          *
 *                                                                          *
 * Input: [1,1,1,1,1,null,1]                                                *
 * Output: true                                                             *
 * Example 2:                                                               *
 *                                                                          *
 *                                                                          *
 * Input: [2,2,2,5,2]                                                       *
 * Output: false                                                            *
 *                                                                          *
 *                                                                          *
 * Note:                                                                    *
 *                                                                          *
 * The number of nodes in the given tree will be in the range [1, 100].     *
 * Each node's value will be an integer in the range [0, 99].               *
 ***************************************************************************/
package com.leet_code.easy.q965_univalued_binary_tree.solution1;

import com.leet_code.utils.TreeNode;

/****************************************************************************
 * @author Julian Ghoncharenko                                              *
 * Thoughts on implementation:                                              *
 * I iterate through all nodes in tree until I reach the end or I find node *
 * whose value is not the same as all other nodes value.                    *
 * This solution is faster than 100.00%                                     *
 * Time complexity is O(n)                                                  *
 * *************************************************************************/
class Solution {
    public boolean isUnivalTree(TreeNode root) {
        return isUnivalTree(root, root.val);
    }
    
    public boolean isUnivalTree(TreeNode root, int val) {
        if(root.left == null && root.right == null && root.val == val)
            return true;
        if(root.val != val)
            return false;
        if(root.left == null && root.right != null)
            return isUnivalTree(root.right, val);
        if(root.left != null && root.right == null)
            return isUnivalTree(root.left, val);
        return isUnivalTree(root.left, val) && isUnivalTree(root.right, val);
    }
}