package com.srini.misc;

import java.util.LinkedList;

public class Triangle {
	
	public static void main(String args[]){
		LinkedList<Integer> input = new LinkedList<Integer>();
		input.add(1);
		input.add(2);
		input.add(3);
		input.add(4);
		input.add(5);
		buildTriangle(input);
	}
	
	public static void buildTriangle(LinkedList<Integer> input){
		
		if(!doPrint(input)){
			return;
		}else{
			buildTriangle(reduceMe(input));
		}
		
	}
	
	public static LinkedList<Integer> reduceMe(LinkedList<Integer> input){
		LinkedList<Integer> output = new LinkedList<Integer>();
		for(int i = 0; i < input.size() - 1; i++){
			output.add(input.get(i) + input.get(i + 1));
		}
		return output;
	}
	
	public static boolean doPrint(LinkedList<Integer> input){
		for(Integer i: input){
			System.out.print(i + ", ");
		}
		System.out.println();
		if(input.size() < 2){
			return false;
		}else{
			return true;
		}
	}
	
}
