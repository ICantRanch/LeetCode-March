package LeetCode.March;

import java.util.ArrayList;

public class IntersectionLinkedList {
	
	
	public static class ListNode {
		int val;
		ListNode next;
		ListNode(int x) {
			val = x;
			next = null;
		}
	}
	

	public static void main(String[] args) {
		ListNode a = new ListNode(1);
		ListNode b = new ListNode(2);
		ListNode c = new ListNode(3);
		ListNode d = new ListNode(4);
		ListNode x = new ListNode(-1);
		a.next = b;
		b.next = c;
		c.next = d;
		x.next = c;
		int val = getIntersectionNode(a, x).val;
		System.out.println(val);

	}
	
	public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
      
		ListNode temp = headA;
        ArrayList<ListNode> aList = new ArrayList<>();
        while(temp != null){
            aList.add(temp);
            temp = temp.next;
        }
        
        temp = headB;
        ArrayList<ListNode> bList = new ArrayList<>();
        while(temp != null){
            bList.add(temp);
            temp = temp.next;
        }
        System.out.println(aList);
        System.out.println(bList);
        
        int aSize = aList.size();
        int bSize = bList.size();
        if(aList.get(aSize-1) == bList.get(bSize-1)) {
        	for (int i = 1; i < Math.min(aSize, bSize); i++) {
        		
        		if(aList.get(aSize-i-1) != bList.get(bSize-i-1)) {

        			return aList.get(aSize-i);
        		}
        	}
        }
        return null;
    }

}
