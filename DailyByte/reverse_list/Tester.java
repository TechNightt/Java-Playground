package com.daily_byte.date_15_07_2020_reverse_list;

import static com.daily_byte.date_15_07_2020_reverse_list.Solution.*;

import com.daily_byte.utils.ListNode;

class Tester {

	public static void main(String[] args) {
		ListNode node = new ListNode(1);
		node.next = new ListNode(2);
		node.next.next = new ListNode(3);
		node = reverseList(node);
		while(node != null) {
			System.out.println(node.val);
			node = node.next;
		}
		
		System.out.println();
		node = new ListNode(7);
		node.next = new ListNode(15);
		node.next.next = new ListNode(9);
		node.next.next.next = new ListNode(2);
		node = reverseList(node);
		while(node != null) {
			System.out.println(node.val);
			node = node.next;
		}
	}
	
}