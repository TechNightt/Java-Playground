// Source : https://leetcode.com/problems/n-ary-tree-preorder-traversal/
// Author : Julian Ghoncharenko
// Date   : 02-08-2020

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
package com.leet_code.easy.q589_n_ary_tree_preorder_traversal.solution2;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/******************************************************************************************************************************************************
 * @author Julian Ghoncharenko                                                                                                                        *
 * Thoughts on implementation:                                                                                                                        *
 * I iterate through every child of the tree and use stack to check whether I have iterated through all children.                                     *
 * This solution is faster than 55.86%                                                                                                                *
 * Time complexity is O(n)                                                                                                                            *
 * ***************************************************************************************************************************************************/
public class Solution {

    public List<Integer> preorder(Node root) {
        if(root == null)
            return new ArrayList<Integer>();
    	List<Integer> res = new ArrayList<Integer>();
    	Stack<Node> stack = new Stack<Node>();
    	stack.push(root);
        
    	while(stack.size() > 0) {
    		Node current = stack.pop();
    		res.add(current.val);
    		List<Node> children = current.children;
    		for(int i = children.size() - 1; i >= 0; --i) {
    			
    			stack.push(children.get(i));
    		}
    	}
        
        return res;
    }
    
}