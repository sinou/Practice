package com.srini.trees;

import java.util.Stack;

public class InOrderIterator {
	static Stack<Node> s = new Stack<Node>();
	public static void main(String args[]){
		
	}
	
	public static void iterator(Node root){
		if(root == null){
			return;
		}
		while(!s.isEmpty() || root != null){
			if(root != null){
				s.add(root);
				root = root.leftChild;
			}
		}
	}
	
	public static boolean hasNext(){
		return !s.isEmpty();
	}
	
	public static Node getNext(){
		if(s.isEmpty()){
			return null;
		}
		
		Node rVal = s.pop();
		Node temp = rVal.rightChild;
		while(temp != null){
			s.add(temp);
			temp = temp.leftChild;
		}
		return rVal;
	}
	
}
