package com.sugar.leetcode.impl;

import com.sugar.leetcode.Question;

public class  Q2_AddTwoNumbers implements Question{

	@Override
	public void run() {
		ListNode inseideNode1_1 = new ListNode(3, null);
		ListNode inseideNode1_2 = new ListNode(4, inseideNode1_1);
		ListNode node01 = new ListNode(2, inseideNode1_2);
		ListNode inseideNode2_1 = new ListNode(4, null);
		ListNode inseideNode2_2 = new ListNode(6, inseideNode2_1);
		ListNode node02 = new ListNode(5, inseideNode2_2);
		
		
		addTwoNumbers(node01, node02);
//		System.out.println("RETURN: [" + retVal[0] + "," + retVal[1] + "]");
	}
	
    public void addTwoNumbers(ListNode l1, ListNode l2) {
    	System.out.println();
    }
    
    public class ListNode {
    	int val;
    	ListNode next;
    	ListNode(int x) { val = x; }
    	
    	public ListNode(int val, ListNode next) {
    		this.val = val;
    		this.next = next;
    	}
    }
}
