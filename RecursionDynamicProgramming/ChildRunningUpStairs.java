package RecursionDynamicProgramming;

public class ChildRunningUpStairs {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0; i < 10; i++){
		System.out.println(waysOfRunningUp(i));
		}
	}
	public static int waysOfRunningUp(int n){
		//in how many different ways can a child reach the n-th step taking 1, 2 or 3 steps each time
		if(n == 0 || n == 1 || n == 2 || n == 3) return n;
		
		int[] ways = new int[n+1];
		ways[0] = 0;
		ways[1] = 1;
		ways[2] = 2;
		ways[3] = 3;
		for(int i = 4; i <= n; i++){
			ways[i] = 0;
			for(int j = 1; j < 4; j++){
				ways[i] += ways[i-j];
			}
		}
		return ways[n];
	}

}
