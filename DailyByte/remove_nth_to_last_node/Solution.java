// Problem : Remove Nth to Last Node

/*************************************************************************************************************************************
 * This question is asked by Facebook. Given a linked list and a value n, remove the nth to last node and return the resulting list. *
 *                                                                                                                                   *
 * Ex: Given the following linked lists...                                                                                           *
 *                                                                                                                                   *
 * 1->2->3->null, n = 1, return 1->2->null                                                                                           *
 * 1->2->3->null, n = 2, return 1->3->null                                                                                           *
 * 1->2->3->null, n = 3, return 2->3->null                                                                                           *
 ************************************************************************************************************************************/

 
import com.daily_byte.utils.ListNode;

class Solution {

	static ListNode removeNth(ListNode head, int n) {
		ListNode l3 = new ListNode(), l4 = l3;
		int c = countNumberOfNodes(head), indexToRemove = c - n, i = 0;
		while(i < indexToRemove) {
			l3.next = new ListNode(head.val);
			l3 = l3.next;
			head = head.next;
			++i;
		}
		l3.next = head.next;
		return l4.next;
	}
	
	private static int countNumberOfNodes(ListNode head) {
		int c = 0;
		while(head != null) {
			++c;
			head = head.next;
		}
		return c;
	}
	
}