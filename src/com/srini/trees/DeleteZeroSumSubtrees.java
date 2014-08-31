package com.srini.trees;

public class DeleteZeroSumSubtrees {
	
	public static void main(String args[]){
		Node t1 = new Node(1);
		Node t2 = new Node(2);
		Node t3 = new Node(3);
		Node t4 = new Node(-1);
		Node t5 = new Node(-1);
		Node t6 = new Node(6);
		Node t7 = new Node(7);
		t1.leftChild = t2;
		t1.rightChild = t3;
		t2.leftChild = t4;
		t2.rightChild = t5;
		t3.leftChild = t6;
		t3.rightChild = t7;
		DFT.dFT(DeleteZeroSums(t1));
	}
	
	public static Node DeleteZeroSums(Node root){
		if(root == null){
			return root;
		}
		
		if(awesomeRecursion(root) == 0){
			root = null;
		}
		return root;
	}
	
	public static int awesomeRecursion(Node root){
		if(root == null){
			return 0;
		}
		
		int leftSum = awesomeRecursion(root.leftChild);
		int rightSum = awesomeRecursion(root.rightChild);
		
		if(leftSum == 0){
			root.leftChild = null;
		}
		if(rightSum == 0){
			root.rightChild = null;
		}
		
		return root.data + leftSum + rightSum;
	}
}
