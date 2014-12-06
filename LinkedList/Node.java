package LinkedList;

import java.util.HashSet;

public class Node{
	int data;
	Node next;
	
	public Node(int data){
		this.data = data;
	}
	public Node append(int data){
		Node t = this.getTail();
		t.next = new Node(data);
		return this;
	}
	
	public Node getTail(){
		Node temp = this;
		while(temp.next != null){
			temp = temp.next;
		}
		return temp;
	}
	
	
	public void print(){
		Node temp = this;
		while(temp != null){
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}
	
}