package LinkedList;

public class KthElementFinder {

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = new Node(0);
		head.append(1).append(2).append(3).append(4).append(5).append(6).append(7).append(8).append(9);
		Node n = findKthToLastElement(head, 6);
		System.out.println(n.data);
	}
	
	public static Node findKthToLastElement(Node head, int k){
		Node leader = head;
		Node runner = head;
		for(int i = 0; i < k && leader != null; i++){
			leader = leader.next;
		}
		while(leader != null){
			leader = leader.next;
			runner = runner.next;
		}
		return runner;
	}

}
