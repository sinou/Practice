package com.srini.trees;

public class InorderSuccessor {
	
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
		System.out.println(findMySuccessor(t1, 5).data);
	}
	
	public static Node findMySuccessor(Node root, int n){
		Node successor = null;
		if(root == null){
			return null;
		}
		while(root != null){
			if(root.data > n){
				successor = root;
				root = root.leftChild;
			}else if(root.data < n){
				root = root.rightChild;
			}else{
				if(root.rightChild != null){
					successor = findMin(root.rightChild);
				}
			}
		}
		return successor;
	}
	
	public static Node findMin(Node root){
		if(root == null){
			return null;
		}
		while(root != null){
			root = root.leftChild;
		}
		return root;
	}
	
}
