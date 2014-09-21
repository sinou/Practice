package com.srini.linkedList;

public class LList {
	int data;
	LList next;
	public LList(int data){
		this.data = data;
		this.next = null;
	}
	
	public String toString(){
		String printMe = "";
		LList temp = this;
		while(temp != null){
			printMe += temp.data + "->";
			temp = temp.next;
		}
		return printMe + "null";
	}
}
