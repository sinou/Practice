package com.srini.trees;

import java.util.Stack;

public class InOrderIterative {
	
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
		doInOrderIteratively(t1);
	}
	
	public static void doInOrderIteratively(Node root){
		
		if(root == null){
			return;
		}
		
		Stack s = new Stack();
		
		while(!s.isEmpty() || root != null){
			if(root != null){
				s.add(root);
				root = root.leftChild;
				continue;
			}
			System.out.println(((Node)s.peek()).data);
			root = ((Node)s.pop()).rightChild;
			
		}
		
	}
	
}
