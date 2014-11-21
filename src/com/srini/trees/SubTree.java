package com.srini.trees;

public class SubTree {
	
	public static void main(String args[]){
		
	}
	
	static boolean containsTree(Node t1, Node t2){
		if(t2 == null){
			return true;
		}
		
		return subTree(t1, t2);
	}
	
	static boolean subTree(Node t1, Node t2){
		if(t1 == null){
			return false;
		}
		if(t1.data == t2.data){
			return matchTrees(t1, t2);
		}
		
		return (matchTrees(t1.leftChild, t2) || matchTrees(t1.rightChild, t2));
	}
	
	static boolean matchTrees(Node t1, Node t2){
		
		if(t1 == null && t2 == null){
			return true;
		}
		if(t1 == null || t2 == null){
			return false;
		}
		if(t1.data != t2.data){
			return false;
		}
		
		return (matchTrees(t1.leftChild, t2.leftChild) && matchTrees(t1.rightChild, t2.rightChild));
		
	}
}
