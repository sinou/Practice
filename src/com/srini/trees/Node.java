package com.srini.trees;

public class Node {

	int data;
	Node leftChild;
	Node rightChild;
	boolean visited;
	public Node(int data){
		this.data = data;
		this.leftChild = null;
		this.rightChild = null;
		this.visited = false;
	}
	
	public String toString(){
		return this.data + "";
	}
	
}
