package com.srini.graph;

import java.util.ArrayList;
import java.util.List;

public final class GraphNode {
	
	int data;
	List<GraphNode> neighbors;
	
	public GraphNode(int data){
		this.data = data;
		neighbors = new ArrayList<GraphNode>();
	}
	
}
