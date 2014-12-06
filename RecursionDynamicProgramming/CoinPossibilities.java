package RecursionDynamicProgramming;

public class CoinPossibilities {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countWays(100));
	}
	public static int countWays(int n){
		int[] ways = new int[n+1];
		ways[0] = 1;
		for(int i = 1; i <= n; i++){
			ways[i] += ways[i-1];
			if(i>=5) ways[i] += ways[i-5];
			if(i>=10) ways[i] += ways[i-10];
			if(i>=25) ways[i] += ways[i-25];
		}
		return ways[n];
	}

}
