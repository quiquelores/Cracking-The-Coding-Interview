package TreesAndGraphs;

public class BalancedTreeChecker {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//test 1: not balanced tree. 
		/*				5
		 * 			4       9
		 * 				  3     11
		 * 						1	2
		 * 						 6
		 * 						7
		 */
		
		BSTNode head = new BSTNode(5);
		head.setLeft(new BSTNode(4));
		BSTNode nine = new BSTNode(9);
		head.setRight(nine);
		nine.setLeft(new BSTNode(3));
		BSTNode eleven = new BSTNode(11);
		nine.setRight(eleven);
		eleven.setRight(new BSTNode(2));
		eleven.setLeft(new BSTNode(1).setRight(new BSTNode(6).setLeft(new BSTNode(7))));
		
		System.out.println(isBalanced(head));
		
		//test 2: balanced tree
		/*			2
		 * 		  1   3
		 */
		
		BSTNode two = new BSTNode(2);
		two.setLeft(new BSTNode(1));
		two.setRight(new BSTNode(3));
		
		System.out.println(isBalanced(two));
		
		//test 3: not balanced tree with root's children having the same height
		/*				a
		 * 			b		c
		 * 		d		     	e
		 * 	f						g
		 *								
		 *
		 * 
		 */
		
		BSTNode a = new BSTNode(1);
		BSTNode b = new BSTNode(2);
		BSTNode c = new BSTNode(3);
		BSTNode d = new BSTNode(4);
		BSTNode e = new BSTNode(5);
		BSTNode f = new BSTNode(6);
		BSTNode g = new BSTNode(7);

		a.setLeft(b);
		a.setRight(c);
		b.setLeft(d);
		d.setLeft(f);
		c.setRight(e);
		c.setRight(g);
		
		System.out.println(isBalanced(a));

	}
	public static boolean isBalanced(BSTNode node){
		if(node == null) return true;
		
		if(Math.abs(getHeight(node.left) - getHeight(node.right)) > 1){
			return false;
		}
		return isBalanced(node.left) && isBalanced(node.right);
	}
	public static int getHeight(BSTNode node){
		if(node == null) return -1;
		int currHeight = -1;
		int tempHeight;
		if(node.left != null && (tempHeight = getHeight(node.left))> currHeight){
			currHeight = tempHeight;
		}
		if(node.right != null && (tempHeight = getHeight(node.right))> currHeight){
			currHeight = tempHeight;
		}
		return 1 + currHeight;
	}

}
