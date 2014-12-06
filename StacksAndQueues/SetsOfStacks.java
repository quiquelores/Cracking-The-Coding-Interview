package StacksAndQueues;

public class SetsOfStacks {

	/**
	 * @param args
	 */
	Stack[] stacks;
	int currStack;
	int size;
	
	public SetsOfStacks(int cap, int size){
		this.stacks = new Stack[cap];
		this.currStack = 0;
		this.size = size;
	}
	public void push(int n){
		if(stacks[currStack] == null){
			stacks[currStack] = new Stack(size);
		}
		while(stacks[currStack].isFull()){
			if(stacks[currStack+1] == null){
				stacks[currStack+1] = new Stack(size);
			}
			currStack++;
		}
		stacks[currStack].push(n);
	}
	public int pop(){
		while(stacks[currStack].isEmpty()){
			currStack--;
		}
		return stacks[currStack].pop();
	}
	public int peak(){
		while(stacks[currStack].isEmpty()){
			currStack--;
		}
		return stacks[currStack].peak();
	}
	public int popAt(int index){
		if(currStack > index) currStack = index;
		
		return stacks[index].pop();
	}
	public boolean isEmpty(){
		while(currStack >= 0 && stacks[currStack].isEmpty()){
			currStack--;
		}
		if(currStack == -1) return true;
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SetsOfStacks st = new SetsOfStacks(3, 4);
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);
		st.push(6);
		st.push(7);
		st.push(8);
		while(!st.isEmpty()){
			System.out.println(st.peak());
			System.out.println(st.pop());
		}
	}

}
