package TreesAndGraphs;

public class BSTFromArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,6,7};
		BSTNode bst = new BSTNode(0);
				bst = makeBSTFromArray(arr);
				bst.print();
	}
	
	public static BSTNode makeBSTFromArray(int[] array){
		//plan of attack: recursively call make subtree from array from index to index
		return makeSubtreeFromArray(array, 0, array.length -1);
	}
	public static BSTNode makeSubtreeFromArray(int[] array, int i, int j){
		
		if(i > j) return null;
		if(i == j) return new BSTNode(array[i]);
		
		int mid = (i+j)/2;
		
		BSTNode head = new BSTNode(array[mid]);
		head.setLeft(makeSubtreeFromArray(array, i, mid-1));
		head.setRight(makeSubtreeFromArray(array, mid+1, j));
		return head;
	}

}
