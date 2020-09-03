package com.daily_byte.date_14_07_2020_return_start_of_cycle;

import static com.daily_byte.date_14_07_2020_return_start_of_cycle.Solution.*;
import com.daily_byte.utils.ListNode;

class Tester {

	public static void main(String[] args) {
		ListNode node = new ListNode(1);
		node.next = new ListNode(2);
		node.next.next = new ListNode(3);
		ListNode res = startOfCycle(node);
		if(res == null)
			System.out.println("null");
		else
			System.out.println(res.val);
		
		System.out.println();
		node = new ListNode(1);
		node.next = new ListNode(2);
		node.next.next = new ListNode(3);
		node.next.next.next = new ListNode(4);
		node.next.next.next.next = new ListNode(5);
		node.next.next.next.next.next = node.next;
		res = startOfCycle(node);
		System.out.println(res.val);
		
		System.out.println();
		node = new ListNode(1);
		node.next = new ListNode(9);
		node.next.next = new ListNode(3);
		node.next.next.next = new ListNode(7);
		node.next.next.next.next = node.next.next.next;
		res = startOfCycle(node);
		System.out.println(res.val);
	}
	
}