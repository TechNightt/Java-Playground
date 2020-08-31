package com.daily_byte.date_12_07_2020_find_middle_element;

import static com.daily_byte.date_12_07_2020_find_middle_element.Solution.*;

import com.daily_byte.utils.ListNode;

class Tester {

	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		ListNode res = findMiddleElement(head);
		System.out.println(res.val);
	}
	
}