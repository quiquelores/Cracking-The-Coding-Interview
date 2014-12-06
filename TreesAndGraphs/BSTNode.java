package TreesAndGraphs;

public class BSTNode {

	public BSTNode right;
	public BSTNode left;
	public BSTNode parent; //only to be used for some of the exercises
	
	public int data;
	
	public BSTNode(int data){
		this.data = data;
	}
	public BSTNode setLeft(BSTNode left){
		this.left = left;
		this.left.parent = this;
		return this;
	}
	public BSTNode setRight(BSTNode right){
		this.right = right;
		this.right.parent = this;
		return this;
	}
	
	public void print(){
		visitPrint(this);
		}
	public static void visitPrint(BSTNode n){
		System.out.print(n.data + " ");
		if(n.left != null) visitPrint(n.left);
		if(n.right != null) visitPrint(n.right);
	}

}
