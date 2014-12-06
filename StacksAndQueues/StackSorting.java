package StacksAndQueues;

public class StackSorting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack stack = new Stack(10);
		stack.push(1);
		stack.push(3);
		stack.push(2);
		stack.push(9);
		stack.push(4);
		stack.push(8);
		stack.push(7);
		stack.push(5);
		stack.push(6);
		sort(stack);
		while(!stack.isEmpty()){
			System.out.println(stack.pop());
		}
	}
	
	public static void sort(Stack stack){
		Stack helper = new Stack();
		int temp = Integer.MIN_VALUE;

		while(true){
			helper.push(stack.pop());
			while(!stack.isEmpty() && stack.peak() > helper.peak()){
				helper.push(stack.pop());
			}
			if(stack.isEmpty()){
				break;	
			}
			
			temp = stack.pop();
			
			while(!helper.isEmpty()){
				if(temp > helper.peak()){
					stack.push(temp);
					temp = Integer.MIN_VALUE;
				}
				stack.push(helper.pop());
			}
			if(temp != Integer.MIN_VALUE) stack.push(temp);
			temp = Integer.MIN_VALUE;
			
		}
		while(!helper.isEmpty()){
			stack.push(helper.pop());
		}

	}	
}
