package com.srini.graph;

import java.util.LinkedList;
import java.util.List;

// tell if the list of words can form a cycle; a word can be joined with another word if the last letter 
//of the first word and the first letter of the second word are the same.
public class CycleCheck {
	
	public static void main(String args[]){
		List<String> input = new LinkedList<String>();
		input.add("eve");
		input.add("eat");
		input.add("ripe");
		input.add("tear");
		System.out.println(canFormCycle(input));
	}
	
	public static boolean canFormCycle(List<String> stringList){
		int startCount[] = new int[26];
		int endCount[] = new int[26];
		for(String word: stringList){
			char startChar = word.charAt(0);
			char endChar = word.charAt(word.length() - 1);
			startCount[startChar - 'a']++;
			endCount[endChar - 'a']++;
		}
		
		for(int i = 0; i < startCount.length; i++){
			if(startCount[i] - endCount[i] != 0){
				return false;
			}
		}
		return true;
		
	}
	
}
