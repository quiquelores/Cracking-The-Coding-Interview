package LinkedList;

import java.util.*;

public class CircularList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = new Node(0);
		Node first = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		Node fourth = new Node(4);
		Node fifth = new Node(5);
		head.next = first;
		first.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		fifth.next = third;
		// 0 -> 1 -> 2 -> 3 -> 4 -> 5 -> 3
		
		System.out.println(sourceOfLoopWithExtraSpace(head).data);
		System.out.println(sourceOfLoopWithoutExtraSpace(head).data);

	}
	public static Node sourceOfLoopWithExtraSpace(Node head){
		HashSet<Node> hs = new HashSet<Node>();
		Node temp = head;
		while(temp!=null){
			if(hs.contains(temp))
				return temp;
			hs.add(temp);
			temp = temp.next;
		}
		return null;
	}
	public static Node sourceOfLoopWithoutExtraSpace(Node head){
		Node fast = head;
		Node slow = head;
		do{
		fast = fast.next.next;
			slow = slow.next;
		}  while( fast != null && slow != null && fast != slow);

		if(fast!=slow){
			return new Node(-1);
		}
		fast = head;
		while(fast != slow){
			fast = fast.next;
			slow = slow.next;
		}
		return slow;
	}
}
