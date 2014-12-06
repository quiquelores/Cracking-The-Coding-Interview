package StacksAndQueues;

public class Stack{
	private int[] data;
	private int pointer;
	int length;
	
	
	public Stack(int cap){
		data = new int[cap];
		pointer = 0;
		length = data.length;
	}
	public Stack(){
		this(100);
	}
	public int pop(){
		int temp = data[--pointer];
		data[pointer] = -1;
		return temp;
	}
	public int peak(){
		return data[pointer-1];
	}
	public void push(int el){
		data[pointer++] = el;
	}
	public boolean isFull(){
		return (pointer == length);
	}
	public boolean isEmpty(){
		return (pointer == 0);
	}
}
