package com.srini.trees;

public class SimilarTrees {
	
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
		Node u1 = new Node(1);
		Node u2 = new Node(2);
		Node u3 = new Node(3);
		Node u4 = new Node(4);
		Node u5 = new Node(5);
		Node u6 = new Node(6);
		Node u7 = new Node(7);
		u1.leftChild = u2;
		u1.rightChild = u3;
		u2.leftChild = u4;
		u2.rightChild = u5;
		u3.leftChild = u6;
		u3.rightChild = u7;
		System.out.println(areSimilar(t1, u1));
	}
	
	public static boolean areSimilar(Node t1,  Node t2){
		if(t1 == null && t2 == null){
			return true;
		}
		if(t1 != null && t2 != null){
			return (t1.data == t2.data && areSimilar(t1.leftChild, t2.leftChild) && 
					areSimilar(t1.rightChild, t2.rightChild));
		}
		
		return false;
	}
	
}
