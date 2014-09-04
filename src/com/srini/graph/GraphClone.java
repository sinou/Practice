package com.srini.graph;

import java.util.HashMap;

public class GraphClone {
	
	public static void main(String args[]){
		
	}
	
	public static GraphNode cloneMe(GraphNode root, HashMap<GraphNode, GraphNode> alreadyVisited){
		if(root == null){
			return null;
		}
		
		GraphNode clone = new GraphNode(root.data);
		alreadyVisited.put(root, clone);
		
		for(GraphNode node: root.neighbors ){
			GraphNode temp = alreadyVisited.get(node);
			if(temp == null){
				clone.neighbors.add(cloneMe(node, alreadyVisited));
			}else{
				clone.neighbors.add(temp);
			}
		}
		
		return clone;
	}
	
}
