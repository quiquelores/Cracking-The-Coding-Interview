package StacksAndQueues;

public class MyQueue {

	/**
	 * @param args
	 */
	Stack stack;
	Stack queue;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// queue 1, 2: stack 0, queue 1, 2.
		// stack push 1, push 2 -> 2, 1 -> stack pop,pus, pop, push -> 1, 2
		// enqueue 3 -> pop queue onto stack, push 3 onto stack, pop onto queue
	}
	public MyQueue(){
		stack = new Stack();
		queue = new Stack();
	}
	public void enqueue(int n){
		while(!queue.isEmpty()){
			stack.push(queue.pop());
		}
		stack.push(n);
		while(!stack.isEmpty()){
			queue.push(stack.pop());
		}
	}
	public int dequeue(int n){
		return queue.pop();
	}

}
