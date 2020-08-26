package com.daily_byte.date_10_07_2020_remove_nth_to_last_node;

import static com.daily_byte.date_10_07_2020_remove_nth_to_last_node.Solution.*;
import com.daily_byte.utils.ListNode;

class Tester {

	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(2);
		l1.next.next = new ListNode(3);
		l1 = removeNth(l1, 1);
		while(l1 != null) {
			System.out.println(l1.val);
			l1 = l1.next;
		}
		System.out.println();
		l1 = new ListNode(1);
		l1.next = new ListNode(2);
		l1.next.next = new ListNode(3);
		l1 = removeNth(l1, 2);
		while(l1 != null) {
			System.out.println(l1.val);
			l1 = l1.next;
		}
		System.out.println();
		l1 = new ListNode(1);
		l1.next = new ListNode(2);
		l1.next.next = new ListNode(3);
		l1 = removeNth(l1, 3);
		while(l1 != null) {
			System.out.println(l1.val);
			l1 = l1.next;
		}
	}
	
}