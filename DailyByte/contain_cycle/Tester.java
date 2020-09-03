package com.daily_byte.date_13_07_2020_contain_cycle;

import static com.daily_byte.date_13_07_2020_contain_cycle.Solution.*;
import com.daily_byte.utils.ListNode;

class Tester {

	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(2);
		l1.next.next = new ListNode(3);
		//l1.next.next.next = l1;
		l1.next.next.next = new ListNode(4);
		
		System.out.println(containsCycleFlag(l1));
		l1 = new ListNode(1);
		l1.next = new ListNode(2);
		l1.next.next = new ListNode(3);
		//l1.next.next.next = l1;
		l1.next.next.next = new ListNode(4);
		System.out.println(containsCycleMap(l1));
	}
	
}