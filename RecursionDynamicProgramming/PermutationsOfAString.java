package RecursionDynamicProgramming;

public class PermutationsOfAString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] res = findPermutations("abc");
		for(int i = 0 ;  i < res.length; i++){
			System.out.println(res[i]);
		}
	}
	
	//abc
	//a --> ab -> ba  --> cab acb abc cba bca bac
	public static String[] findPermutations(String s){
		if(s == null || s.length() == 0 ) return null;
		
		String[] prev = findPermutations(s.substring(0, s.length()-1));
		
		if(prev == null){
			String[] res = {s};
			return res;
		}
		String[] res = new String[prev.length * (prev[0].length()+1)];
		int index = 0;
		char curr = s.charAt(s.length()-1);
		for(int i = 0; i < prev.length; i ++){
			String prevStr = prev[i];
			res[index++] = curr + prevStr;
			for(int a = 1; a < prevStr.length(); a++){
				res[index++] = prevStr.substring(0, a) + curr + prevStr.substring(a, prevStr.length());
			}
			res[index++] = prevStr + curr;
		}
		return res;
	}

}
