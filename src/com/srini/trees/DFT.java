package com.srini.trees;

import java.util.Stack;

public class DFT {

	public static void main(String args[]){
		Node t1 = new Node(1);
		Node t2 = new Node(2);
		Node t3 = new Node(3);
		Node t4 = new Node(4);
		Node t5 = new Node(5);
		Node t6 = new Node(6);
		Node t7 = new Node(7);
		t1.leftChild = t2;
		t1.rightChild = t3;
		t2.leftChild = t4;
		t2.rightChild = t5;
		t3.leftChild = t6;
		t3.rightChild = t7;
		dFT(t1);
	}
	
	public static void dFT(Node root){
		
		Stack s = new Stack();
		s.push(root);
		root.visited = true;
		print(root);
		
		while(!s.isEmpty()){
			Node t = (Node) s.peek();
			Node child = getUnvisitedChild(t);
			if(child != null){
				child.visited = true;
				print(child);
				s.push(child);
			}else{
				s.pop();
			}
		}
		
	}
	
	public static Node getUnvisitedChild(Node t){
		if(t.leftChild != null){if(t.leftChild.visited == false){
			return t.leftChild;
		}
		}if(t.rightChild != null){if(t.rightChild.visited == false){
			return t.rightChild;
		}
		}
		return null;
	}
	
	public static void print(Node t){
		System.out.println(t.data);
	}
}
	
