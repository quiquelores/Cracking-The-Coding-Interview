package TreesAndGraphs;

public class BSTChecker {

	/**
	 * @param args
	 */
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
		System.out.println(checkBST(head));
		
		BSTNode five = new BSTNode(5);
		five.setLeft(new BSTNode(3));
		five.setRight(new BSTNode(8));
		System.out.println(checkBST(five));
	}
	public static boolean checkBST(BSTNode n){
		return checkBST(n, Integer.MIN_VALUE, Integer.MAX_VALUE); 
	}
	public static boolean checkBST(BSTNode n, int min, int max){
		if(n.left == null && n.right == null ) return true;
		if(n.left != null && n.left.data > n.data) return false;
		if(n.right != null && n.right.data < n.data) return false;
	
		return checkBST(n.left, min, n.data) && checkBST(n.right, n.data, max); 
	}
}
