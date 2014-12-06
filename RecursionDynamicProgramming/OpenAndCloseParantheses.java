package RecursionDynamicProgramming;

import java.util.ArrayList;

public class OpenAndCloseParantheses {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> res = combinationsOfParantheses(5);
		for(int i = 0 ; i < res.size(); i++){
			System.out.println(res.get(i));
		}
	}

	public static ArrayList<String> combinationsOfParantheses(int n){
		if(n == 0) return null;
		if(n == 1) {
			String str = "()";
			ArrayList<String> res = new ArrayList<String>();
			res.add(str);
			return res;
		}
		ArrayList<String> prev = combinationsOfParantheses(n-1);
		ArrayList<String> res = new ArrayList<String>();
		// () -> (()), ()(), ()()
		for(int i = 0; i < prev.size(); i++){
			res.add("()" + prev.get(i));
			res.add("(" + prev.get(i) + ")");
			if(!res.contains(prev.get(i) + "()")) res.add(prev.get(i) + "()");
		}
		return res;
	}
}
