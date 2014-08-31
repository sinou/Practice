package com.srini.trees;

public class MirrorBinaryTree {
	
	public static void main(String args[]){
		
	}
	
	public static Node mirrorMe(Node root){
		
		if(root == null){
			return null;
		}
		
		if(root.leftChild != null){
			mirrorMe(root.leftChild);
		}
		
		if(root.rightChild != null){
			mirrorMe(root.rightChild);
		}
		
		Node temp = root.leftChild;
		root.leftChild = root.rightChild;
		root.rightChild = temp;
		
		return root;
		
	}
	
}
