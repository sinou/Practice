package com.srini.trees;

public class CommonAncestor {
	
	public static void main(String args[]){
		
	}
	
	public static Node commonAncestor(Node root, Node t1, Node t2){
		
		if(covers(root.leftChild, t1) && covers(root.leftChild, t2)){
			return commonAncestor(root.leftChild, t1, t2);
		}
		if(covers(root.rightChild, t1) && covers(root.rightChild, t2)){
			return commonAncestor(root.rightChild, t1, t2);
		}
		return root;
		
	}
	
	public static boolean covers(Node root, Node child){
		
		if(root == null){
			return false;
		}
		if(root == child){
			return true;
		}

		return (covers(root.leftChild, child) || covers(root.rightChild, child));
		
	}
	
}
