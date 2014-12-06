package TreesAndGraphs;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class RouteBetweenTwoNodes {
	
	public static void main(String args[]){
		GNode a = new GNode(1);
		GNode b = new GNode(2);
		GNode c = new GNode(3);
		GNode d = new GNode(4);
		GNode e = new GNode(5);
		GNode f = new GNode(6);
		GNode h = new GNode(7);
		
		a.addEdge(b);
		b.addEdge(c);
		c.addEdge(d);
		b.addEdge(e);
		b.addEdge(f);
		d.addEdge(f);
		f.addEdge(a);
		
		System.out.println(PathFromAtoB(a, b));
		System.out.println(PathFromAtoB(a, h));
		System.out.println(PathFromAtoB(a, f));
	}


	public static boolean PathFromAtoB(GNode a, GNode b){
		//approach using BSF
		if(a == null || b == null) return false;
		if(a == b) return true;
		
		HashSet<GNode> visited = new HashSet<GNode>();
		Queue<GNode> queue = new LinkedList<GNode>();
		visited.add(a);
		queue.add(a);
		while(!queue.isEmpty()){
			GNode temp = queue.poll();
			for(int i = 0 ; i < temp.edges.size(); i ++){
				GNode next = temp.edges.get(i);
				if(!visited.contains(next)){
					if(next == b) return true;
					visited.add(temp.edges.get(i));
					queue.add(next);					
				}
			}
		}
		return false;
	}

}