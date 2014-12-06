package TreesAndGraphs;

import java.util.*;

public class MultiLevelLinkedList {

	static ArrayList<LinkedList<BSTNode>> lists;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BSTNode head = new BSTNode(5);
		head.setLeft(new BSTNode(4));
		BSTNode nine = new BSTNode(9);
		head.setRight(nine);
		nine.setLeft(new BSTNode(3));
		BSTNode eleven = new BSTNode(11);
		nine.setRight(eleven);
		eleven.setRight(new BSTNode(2));
		eleven.setLeft(new BSTNode(1).setRight(new BSTNode(6).setLeft(new BSTNode(7))));
		
		getLinkedLists(head);
		for(int i = 0; i < lists.size(); i++){
			for(int j = 0; j < lists.get(i).size(); j++){
				System.out.print(lists.get(i).get(j).data + " ");
			}
			System.out.println();
		}
	}
	
	public static void getLinkedLists(BSTNode head){
		lists = new ArrayList<LinkedList<BSTNode>>();
		listTraversal(head, 0);
	}
	public static void listTraversal(BSTNode n, int level){
		while(lists.size() <= level ){
			LinkedList<BSTNode> nl = new LinkedList<BSTNode>();
			lists.add(nl);
		}
		lists.get(level).add(n);
		if(n.left != null) listTraversal(n.left, level +1);
		if(n.right != null) listTraversal(n.right, level +1);
	}
}
