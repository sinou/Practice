package com.srini.strings;

import java.util.HashSet;

public class RemoveDuplicateCharacters {
	public static void main(String args[]){
		System.out.println(removeDuplicates(new char[]{'a', 'a', 'a', 'b', 'a',
				'a', 'd', 'a', 'c', 'b'}));
	}
	
	public static char[] removeDuplicates(char[] input){
		HashSet charSet = new HashSet();
		int write = 0;
		for(int i = 0; i < input.length; i++){
			if(!charSet.contains(input[i])){
				charSet.add(input[i]);
				input[write] = input [i];
				write++;
			}
		}
		input[write] = '\0';
		return input;
	}
}
