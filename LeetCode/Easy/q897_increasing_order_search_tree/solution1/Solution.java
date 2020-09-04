// Source : https://leetcode.com/problems/increasing-order-search-tree/


/******************************************************************************************************************************************************************************************
 * Given a binary search tree, rearrange the tree in in-order so that the leftmost node in the tree is now the root of the tree, and every node has no left child and only 1 right child. *
 *                                                                                                                                                                                        *
 * Example 1:                                                                                                                                                                             *
 * Input: [5,3,6,2,4,null,8,1,null,null,null,7,9]                                                                                                                                         *
 *                                                                                                                                                                                        *
 *        5                                                                                                                                                                               *
 *       / \                                                                                                                                                                              *
 *     3    6                                                                                                                                                                             *
 *    / \    \                                                                                                                                                                            *
 *   2   4    8                                                                                                                                                                           *
 *  /        / \                                                                                                                                                                          *
 * 1        7   9                                                                                                                                                                         *
 *                                                                                                                                                                                        *
 * Output: [1,null,2,null,3,null,4,null,5,null,6,null,7,null,8,null,9]                                                                                                                    *
 *                                                                                                                                                                                        *
 *  1                                                                                                                                                                                     *
 *   \                                                                                                                                                                                    *
 *    2                                                                                                                                                                                   *
 *     \                                                                                                                                                                                  *
 *      3                                                                                                                                                                                 *
 *       \                                                                                                                                                                                *
 *        4                                                                                                                                                                               *
 *         \                                                                                                                                                                              *
 *          5                                                                                                                                                                             *
 *           \                                                                                                                                                                            *
 *            6                                                                                                                                                                           *
 *             \                                                                                                                                                                          *
 *              7                                                                                                                                                                         *
 *               \                                                                                                                                                                        *
 *                8                                                                                                                                                                       *
 *                 \                                                                                                                                                                      *
 *                  9                                                                                                                                                                     *
 *                                                                                                                                                                                        *
 *                                                                                                                                                                                        *
 * Constraints:                                                                                                                                                                           *
 *                                                                                                                                                                                        *
 * The number of nodes in the given tree will be between 1 and 100.                                                                                                                       *
 * Each node will have a unique integer value from 0 to 1000.                                                                                                                             *
 *****************************************************************************************************************************************************************************************/
package com.leet_code.easy.q897_increasing_order_search_tree.solution1;

import java.util.ArrayList;
import java.util.List;

import com.leet_code.utils.TreeNode;

/******************************************************************************************************************************************************************************************
 * Thoughts on implementation:                                                                                                                                                            *
 * I go through the whole tree and build a list of all nodes of the tree in-order. Then I iterate through the list elements and build a new tree with all children to the right.          *
 * This solution is faster than 100.00%                                                                                                                                                   *
 * Time complexity is O(n)                                                                                                                                                                *
 * ***************************************************************************************************************************************************************************************/
class Solution {

    public TreeNode increasingBST(TreeNode root) {
        List<Integer> list = increasingBST(root, new ArrayList<Integer>());
        return buildTree(list);
    }
    
    public List<Integer> increasingBST(TreeNode root, List<Integer> list) {
        if(root.left == null && root.right == null) {
            list.add(root.val);
            return list;
        }
        if(root.left != null)
            list = increasingBST(root.left, list);    
        list.add(root.val);
        if(root.right != null)
            list = increasingBST(root.right, list);    
        return list;
    }
    
    public TreeNode buildTree(List<Integer> list) {
        if(list == null || list.size() == 0)
            return null;
        TreeNode res = new TreeNode(list.get(0)), helper = res;
        for(int i = 1; i < list.size(); ++i) {
            res.right = new TreeNode(list.get(i));
            res = res.right;
        }    
        return helper;
    }
	
}