package LinkedList;

public class NodeRemover {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = new Node(0);
		head.append(1).append(2).append(3).append(4).append(5).append(6).append(7).append(8).append(9);
		head.print();
		removeNode(head.next.next.next.next);
		head.print();
		
	}
	public static boolean removeNode(Node n){
		if(n == null || n.next == null)
			return false;
		Node next = n.next;
		n.data = next.data;
		n.next = next.next;
		return true;
	}
}
