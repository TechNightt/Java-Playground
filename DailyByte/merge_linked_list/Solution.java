// Problem : Merge Linked List

/****************************************************************************************************************************************************
 * This question is asked by Apple. Given two sorted linked lists, merge them together in ascending order and return a reference to the merged list *
 *                                                                                                                                                  *
 * Ex: Given the following lists...                                                                                                                 *
 *                                                                                                                                                  *
 * list1 = 1->2->3, list2 = 4->5->6->null, return 1->2->3->4->5->6->null                                                                            *
 * list1 = 1->3->5, list2 = 2->4->6->null, return 1->2->3->4->5->6->null                                                                            *
 * list1 = 4->4->7, list2 = 1->5->6->null, return 1->4->4->5->6->7->null                                                                            *
 ***************************************************************************************************************************************************/
package com.daily_byte.date_09_07_2020_merge_linked_list;

import com.daily_byte.utils.ListNode;

class Solution {

	static ListNode mergeLinkedListRecursive(ListNode l1, ListNode l2) {
		if(l1 == null) 
			return l2;
		if(l2 == null) 
			return l1;
		if(l1.val <= l2.val) {
			l1.next = mergeLinkedListRecursive(l1.next, l2);
			return l1;
		}
		l2.next = mergeLinkedListRecursive(l1, l2.next);
		return l2;
	}

	static ListNode mergeLinkedListIterative(ListNode l1, ListNode l2) {
		ListNode l3 = new ListNode(), l4 = l3;
		while(l1 != null || l2 != null) {
			if(l1 != null && l2 == null) {
				l3.next = new ListNode(l1.val);
				l3 = l3.next;
				l1 = l1.next;
			} else if(l2 != null && l1 == null) {
				l3.next = new ListNode(l2.val);
				l3 = l3.next;
				l2 = l2.next;
			} else if(l1 != null && l2 != null && l1.val <= l2.val) {
				l3.next = new ListNode(l1.val);
				l3 = l3.next;
				l1 = l1.next;
			} else if(l1 != null && l2 != null && l2.val < l1.val) {
				l3.next = new ListNode(l2.val);
				l3 = l3.next; 
				l2 = l2.next;
			}
		}
		return l4.next;
	}
	
}