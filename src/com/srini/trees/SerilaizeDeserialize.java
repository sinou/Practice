package com.srini.trees;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerilaizeDeserialize {
	
	static final int min = Integer.MIN_VALUE;
	
	public static void main(String args[]){
		
	}
	
	public static void serialize(Node root, ObjectOutputStream stream){
		
		try{
			if(root == null){
				stream.writeInt(min);
			}
			stream.writeInt(root.data);
			serialize(root.leftChild, stream);
			serialize(root.rightChild, stream);
		}catch(IOException iOE){
			System.out.println("IOException: " + iOE);
		}
		
	}
	
	public static Node deserialize(ObjectInputStream stream){
		Node root = null;
		try{
			int val = stream.readInt();
			if(val == min){
				return null;
			}
			
			root = new Node(stream.readInt());
			root.leftChild = deserialize(stream);
			root.rightChild = deserialize(stream);
			return root;
		}catch(IOException iOE){
			System.out.println("IOException: " + iOE);
		}
		return root;
	}
	
}
