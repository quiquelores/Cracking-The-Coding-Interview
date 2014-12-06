package RecursionDynamicProgramming;

import java.util.*;

public class SubsetFinder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> s = new HashSet<Integer>();
		s.add(1);
		s.add(2);
		s.add(3);
		s.add(4);
		s.add(5);
		s.add(6);
		s.add(7);
		s.add(8);
		s.add(9);
		s.add(10);
		ArrayList<Set<Integer>> sol = findSubsets(s);
		for(int i = 0; i < sol.size(); i++){
			Set<Integer> ss = sol.get(i);
			System.out.println(ss.toString());
		}
	}
	
	public static ArrayList<Set<Integer>> findSubsets(Set<Integer> s){
		ArrayList<Set<Integer>> sol = new ArrayList<Set<Integer>>();
		Iterator<Integer> it = s.iterator();
		while(it.hasNext()){
			Integer curr = (Integer) it.next();
			int size = sol.size();
			for(int i = 0; i < size; i ++){
				Set<Integer> pre = sol.get(i);
				Set<Integer> subset = new HashSet();
				Iterator<Integer> currIt = pre.iterator();
				while(currIt.hasNext()){
					subset.add(currIt.next());
				}
				subset.add(curr);
				sol.add(subset);
			}
			Set<Integer> singleItem = new HashSet<Integer>();
			singleItem.add(curr);
			sol.add(singleItem);
		}
		return sol;
	}

}
