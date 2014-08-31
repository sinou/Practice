package com.srini.trees;

import java.util.Stack;

public class TreePerimeter {
	
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
		printMeTreeParameter(t1);
	}
	
	public static void printMeTreeParameter(Node root){
		
		if(root != null){
			System.out.print(root.data + ", ");
		}
		
		printLeftPart(root.leftChild);
		if(root.leftChild != null || root.rightChild != null){
			printLeaf(root);
		}
		printRightPart(root.rightChild);
		
	}
	
	public static void printLeftPart(Node root){
		if(root == null){
			return;
		}
		int current;
		while(root != null){
			current = root.data;
			if(root.leftChild != null){
				root = root.leftChild;
			}else if(root.rightChild != null){
				root = root.rightChild;
			}else{
				break;
			}
			System.out.print(current + ", ");
		}
	}
	
	public static void printRightPart(Node root){
		if(root == null){
			return;
		}
		Stack s = new Stack();
		int current;
		while(root != null){
			current = root.data;
			if(root.rightChild != null){
				root = root.rightChild;
			}else if(root.leftChild != null){
				root = root.leftChild;
			}else{
				break;
			}
			s.push(current);

		}
		while(!s.isEmpty()){
			System.out.print(s.pop() + ", ");
		}
		
	}
	
	public static void printLeaf(Node root){
		if(root!= null){
			printLeaf(root.leftChild);
			printLeaf(root.rightChild);
			if(root.leftChild == null && root.rightChild == null){
				System.out.print(root.data + ", ");
			}
		}
	}
	
}
