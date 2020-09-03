// Problem : Contain Cycle

/******************************************************************************************************************************
 * This question is asked by Microsoft. Given a linked list, containing unique numbers, return whether or not it has a cycle. *
 * Note: a cycle is a circular arrangement (i.e. one node points back to a previous node)                                     *
 *                                                                                                                            *
 * Ex: Given the following linked lists...                                                                                    *
 *                                                                                                                            *
 * 1->2->3->1 -> true (3 points back to 1)                                                                                    *
 * 1->2->3 -> false                                                                                                           *
 * 1->1 true (1 points to itself)                                                                                             *
 *****************************************************************************************************************************/
package com.daily_byte.date_13_07_2020_contain_cycle;

import java.util.HashMap;

import com.daily_byte.utils.ListNode;

class Solution {

	static boolean containsCycleFlag(ListNode head) {
		int val = head.val;
		head = head.next;
		while(head != null) {
			if(head.val == val)
				return true;
			head.val = val;
			head = head.next;
		}
		return false;
	}
	
	static boolean containsCycleMap(ListNode head) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		while(head != null) {
			int cur = map.getOrDefault(head.val, 0) + 1;
			if(cur > 1)
				return true;
			map.put(head.val, cur);
			head = head.next;
		}	
		return false;
	}
	
}