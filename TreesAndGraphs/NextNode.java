package TreesAndGraphs;

public class NextNode {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

	public BSTNode nextNode(BSTNode n){
		if(n==null) return null;
		if(n.right != null){
			BSTNode temp = n.right;
			while(n.left != null){
				temp = n.left;
			}
			return temp;
		}
		if(isLeftChild(n)) return n.parent;
		
		BSTNode temp = n;
		while(!isRightChild(temp)){
			temp = temp.parent;
		}
		return temp.parent;
	}
	public static boolean isLeftChild(BSTNode n){
		if(n.parent!= null && n.parent.left == n) return true;
		return false;
	}
	public static boolean isRightChild(BSTNode n){
		if(n.parent!= null && n.parent.right == n) return true;
		return false;
	}
}
