package com.daily_byte.date_09_07_2020_merge_linked_list;

import static com.daily_byte.date_09_07_2020_merge_linked_list.Solution.*;
import com.daily_byte.utils.ListNode;

class Tester {

	public static void main(String[] args) {
		ListNode n1 = new ListNode(1);
		n1.next = new ListNode(2);
		n1.next.next = new ListNode(3);
		
		ListNode n2 = new ListNode(4);
		n2.next = new ListNode(5);
		n2.next.next = new ListNode(6);
		
		ListNode n3 = mergeLinkedListIterative(n1, n2);
		while(n3 != null) {
			System.out.println(n3.val);
			n3 = n3.next;
		}
	}
	
}