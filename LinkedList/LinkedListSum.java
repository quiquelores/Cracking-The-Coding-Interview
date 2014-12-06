package LinkedList;

public class LinkedListSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = new Node(9);
		head.append(9).append(9); // 4 9 1
		Node head2 = new Node(9);
		head2.append(9).append(9); // 3 2 7 //+491 = 818
		
		head.print();
		head2.print();
		sum(head, head2).print();
		
	}
	
	public static Node sum(Node n1, Node n2){
		int leftOver = 0;
		Node newHead = null;
		Node lastObj = null;
		while(n1 != null && n2 != null){
			Node newN = new Node((n1.data + n2.data + leftOver)%10);
			leftOver = Math.round((n1.data + n2.data + leftOver) / 10);
			
			if(newHead == null){
				newHead = newN;
				lastObj = newN;
			}
			else{
				lastObj.next = newN;
				lastObj = newN;
			}
			n1 = n1.next;
			n2 = n2.next;
		}
		if(leftOver>0){
			Node newN = new Node(leftOver);
			lastObj.next = newN;
			lastObj = newN;
		}
		return newHead;
	}

}
