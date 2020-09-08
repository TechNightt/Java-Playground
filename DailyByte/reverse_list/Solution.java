// Author  : Julian Ghoncharenko
// Date    : 06-08-2020
// Problem : Reverse List

/*********************************************************************************************************************************************
 * This question is asked by Facebook. Given a linked list, containing unique values, reverse it, and return the result.                     *
 *                                                                                                                                           *
 * Ex: Given the following linked lists...                                                                                                   *
 *                                                                                                                                           *
 * 1->2->3->null, return a reference to the node that contains 3 which points to a list that looks like the following: 3->2->1->null         *
 * 7->15->9->2->null, return a reference to the node that contains 2 which points to a list that looks like the following: 2->9->15->7->null *
 * 1->null, return a reference to the node that contains 1 which points to a list that looks like the following: 1->null                     *
 ********************************************************************************************************************************************/
package com.daily_byte.date_15_07_2020_reverse_list;

import com.daily_byte.utils.ListNode;

class Solution {

	public static ListNode reverseList(ListNode node) {
		ListNode prev = new ListNode(node.val), helper;
		node = node.next;
		
		while(node != null) {
			helper = new ListNode(node.val);
			helper.next = prev;
			prev = helper;
			node = node.next;
		}
		
		return prev;
	}
	
}