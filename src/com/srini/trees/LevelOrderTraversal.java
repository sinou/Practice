package com.srini.trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {
	
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
		doLevelOrderTraversal(t1);
	}
	
	public static void doLevelOrderTraversal(Node root){
		Queue<Node> q = new LinkedList<Node>();
		//ArrayList<ArrayList<Node>> levelOrdered = new ArrayList<ArrayList<Node>>();
		ArrayList<Node> currentArray = new ArrayList<Node>();
		ArrayList<Node> nextArray = new ArrayList<Node>();
		q.add(root);
		root.visited = true;
		currentArray.add(root);
		System.out.println(currentArray);
		while(currentArray.size() != 0){
			Node temp = currentArray.remove(0);
			Node child = null;
			while((child = getUnvisitedChild(temp)) != null){
				nextArray.add(child);
				//q.add(child);
				child.visited = true;
				//System.out.println(child.data);
			}
			if(currentArray.size() == 0){
				System.out.println(nextArray);
				currentArray = nextArray;
				nextArray = new ArrayList<Node>();
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
	
}
