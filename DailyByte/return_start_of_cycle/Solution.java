// Problem : Return Start Of Cycle

/*******************************************************************************************************************************************************************************************************
 * This question is asked by Apple. Given a potentially cyclical linked list where each value is unique, return the node at which the cycle starts. If the list does not contain a cycle, return null. *
 *                                                                                                                                                                                                     *
 * Ex: Given the following linked lists...                                                                                                                                                             *
 *                                                                                                                                                                                                     *
 * 1->2->3, return null                                                                                                                                                                                *
 * 1->2->3->4->5->2 (5 points back to 2), return a reference to the node containing 2                                                                                                                  *
 * 1->9->3->7->7 (7 points to itself), return a reference to the node containing 7                                                                                                                     *
 ******************************************************************************************************************************************************************************************************/
package com.daily_byte.date_14_07_2020_return_start_of_cycle;

import java.util.HashMap;

import com.daily_byte.utils.ListNode;

class Solution {
	
	public static ListNode startOfCycle(ListNode node) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		ListNode prevNode = null;
		
		while(node != null) {
			if(map.get(node.val) != null)
				return prevNode;
			map.put(node.val, node.val);
			prevNode = node;
			node = node.next;
		}
		
		return null;
	}
	
}