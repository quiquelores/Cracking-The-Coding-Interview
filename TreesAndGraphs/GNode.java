package TreesAndGraphs;

import java.util.*;
	
public class GNode {
	int data;
	ArrayList<GNode> edges;
	public GNode(int data){
		this.data = data;
		edges = new ArrayList<GNode>();
	}
	public void addEdge(GNode u){
		edges.add(u);
	}
}
