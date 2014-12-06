package LinkedList;

import java.util.HashSet;

public class DuplicateRemover{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = new Node(1);
		head.append(1).append(5).append(-5).append(23).append(5).append(22).append(Integer.MAX_VALUE);
		head.print();
		removeDuplicatesWithoutBuffer(head);
		head.print();
	}
	
	public static Node removeDuplicatesWithBuffer(Node head){
		HashSet<Integer> hs = new HashSet<Integer>();
		Node temp = head;
		Node parent = head;
		while(temp != null){
			if(hs.contains(temp.data)){
				parent.next = temp.next;
			}
			hs.add(temp.data);
			parent = temp;
			temp = temp.next;
		}
		return head;
	}
	
	public static Node removeDuplicatesWithoutBuffer(Node head){
		Node temp = head;
		Node parent = head;
		while(temp != null){
			Node backtracker = head;
			while(backtracker.data != temp.data){
				backtracker = backtracker.next;
			}
			if(backtracker != temp){
				parent.next = temp.next;
			}
			parent = temp;
			temp = temp.next;
		}
		return head;
	}
	//mistakes to be on the lookout for: updating parent, updating temp, correctly deleting, null pointer bugs
	

 
}

