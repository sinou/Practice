package com.srini.trees;

public class TellIfBinarySearchTree {
	
	static int prev = Integer.MIN_VALUE;
	static boolean isBST = true;
	public static void main(String args[]){
		Node t1 = new Node(4);
		Node t2 = new Node(2);
		Node t3 = new Node(6);
		Node t4 = new Node(1);
		Node t5 = new Node(3);
		Node t6 = new Node(5);
		Node t7 = new Node(7);//7
		t1.leftChild = t2;
		t1.rightChild = t3;
		t2.leftChild = t4;
		t2.rightChild = t5;
		t3.leftChild = t6;
		t3.rightChild = t7;
		isBST(t1);
		System.out.println(isBST);
	}
	
	public static void isBST(Node root){
		
		if(root == null){
			return;
		}
		
		isBST(root.leftChild);
		if(prev <= root.data){
			prev = root.data;
		}else{
			isBST = false;
		}
		isBST(root.rightChild);
		
	}
	
	
}
