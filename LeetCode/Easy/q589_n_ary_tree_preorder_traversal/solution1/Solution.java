// Source : https://leetcode.com/problems/n-ary-tree-preorder-traversal/

/******************************************************************************************************************************************************
 * Given an n-ary tree, return the preorder traversal of its nodes' values.                                                                           *
 *                                                                                                                                                    *
 * Nary-Tree input serialization is represented in their level order traversal, each group of children is separated by the null value (See examples). *
 *                                                                                                                                                    *
 *                                                                                                                                                    *
 *                                                                                                                                                    *
 * Follow up:                                                                                                                                         *
 *                                                                                                                                                    *
 * Recursive solution is trivial, could you do it iteratively?                                                                                        *
 *                                                                                                                                                    *
 *                                                                                                                                                    *
 *                                                                                                                                                    *
 * Example 1:                                                                                                                                         *
 *                                                                                                                                                    *
 *                                                                                                                                                    *
 *                                                                                                                                                    *
 * Input: root = [1,null,3,2,4,null,5,6]                                                                                                              *
 * Output: [1,3,5,6,2,4]                                                                                                                              *
 * Example 2:                                                                                                                                         *
 *                                                                                                                                                    *
 *                                                                                                                                                    *
 *                                                                                                                                                    *
 * Input: root = [1,null,2,3,4,5,null,null,6,7,null,8,null,9,10,null,null,11,null,12,null,13,null,null,14]                                            *
 * Output: [1,2,3,6,7,11,14,4,8,12,5,9,13,10]                                                                                                         *
 *                                                                                                                                                    *
 *                                                                                                                                                    *
 * Constraints:                                                                                                                                       *
 *                                                                                                                                                    *
 * The height of the n-ary tree is less than or equal to 1000                                                                                         *
 * The total number of nodes is between [0, 10^4]                                                                                                     *
 *****************************************************************************************************************************************************/
package com.leet_code.easy.q589_n_ary_tree_preorder_traversal.solution1;

import java.util.ArrayList;
import java.util.List;

/******************************************************************************************************************************************************
                                                                                                                      *
 * Thoughts on implementation:                                                                                                                        *
 * I perform preorder traversal on the tree and then I add every node's value to the result list.                                                     *
 * This solution is faster than 100.00%                                                                                                               *
 * Time complexity is O(n)                                                                                                                            *
 * ***************************************************************************************************************************************************/



 public class Solution {
	
    public List<Integer> preorder(Node root) {
        return preorder(root, new ArrayList<Integer>());
    }
    
    public List<Integer> preorder(Node root, List<Integer> res) {
        if(root.children == null)
            return res;
        res.add(root.val);
        for(Node child : root.children) 
            res = preorder(child, res);
        return res;
    }
    
}