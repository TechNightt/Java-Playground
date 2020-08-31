// Problem : Find Middle Element

/***************************************************************************************************************************************************************************************************
 * This question is asked by Amazon. Given a non-empty linked list, return the middle node of the list. If the linked list contains an even number of elements, return the node closer to the end. *
 *                                                                                                                                                                                                 *
 *                                                                                                                                                                                                 *
 * 1->2->3->null, return 2                                                                                                                                                                         *
 * 1->2->3->4->null, return 3                                                                                                                                                                      *
 * 1->null, return 1                                                                                                                                                                               *
 **************************************************************************************************************************************************************************************************/

 package com.daily_byte.date_12_07_2020_find_middle_element;

import com.daily_byte.utils.ListNode;

class Solution {

	static ListNode findMiddleElement(ListNode head) {
		int c = countNumberOfNodes(head);
		for(int i = 0; i < c/2; ++i) 
			head = head.next;
		return head;
	}
	
	private static int countNumberOfNodes(ListNode head) {
		int c = 0;
		while(head != null) {
			head = head.next;
			++c;
		}
		return c;
	}
	
}