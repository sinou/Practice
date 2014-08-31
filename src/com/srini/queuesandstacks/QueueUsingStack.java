package com.srini.queuesandstacks;

import java.util.Stack;

public class QueueUsingStack {
	static Stack s1 = new Stack();
	static Stack s2 = new Stack();
	public static void main(String args[]){
		
	}
	
	public static boolean add(int n){
		try{
			s1.push(n);
		}catch(Exception e){
			return false;
		}
		return true;
	}
	
	public static int remove(int n){
		if(s2.isEmpty()){
			if(s1.isEmpty()){
				System.out.println("Queue is empty");
				return Integer.MIN_VALUE;
			}else{
				while(!s1.isEmpty()){
					s2.push(s1.pop());
				}
			}
		}
		
		return (int)s2.pop();
	}
}
