package LeetCode.March;

import java.util.ArrayList;

public class SwapListNode {

	public static class ListNode {
		int val;
		ListNode next;
		ListNode() {}
		ListNode(int val) { this.val = val; }
		ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ListNode a = new ListNode(1);
		swapNodes(a,1);
		
	}

	public static ListNode swapNodes(ListNode head, int k) {

		ArrayList<ListNode> nodes = new ArrayList<>();

		ListNode temp = head;
		k = k-1;

		while(temp != null) {
			nodes.add(temp);
			temp = temp.next;
		}
		int tVal = nodes.get(k).val;
		nodes.get(k).val = nodes.get(nodes.size()-1-k).val;
		nodes.get(nodes.size()-1-k).val = tVal;

		return nodes.get(0); 
	}
}
