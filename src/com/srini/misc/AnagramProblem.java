package com.srini.misc;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class AnagramProblem {
	
	public static void main(String args[]){
		printArray(moveAnagramsToFront(new String[]{"sada", "hgfd", "dfgh", "", "", "epic", "pice"}));
	}

    public static String[] moveAnagramsToFront(String[] words){
    	int anagramTracker[] = new int[words.length];
    	int counter = 0;
    	//int trailingPointer = 0;
    	for(int i = 0; i < words.length; i++){
    		for(int j = i + 1; j < words.length; j++){
    			if(areAnagrams(words[i], words[j])){
    				anagramTracker[i] = 1;
    				anagramTracker[j] = 1;
    			}
    		}
    	}
    	for(int i = 0; i < words.length; i++){
    		if(anagramTracker[i] == 1){
    			String temp = words[i];
    			words[i] = words[counter];
    			words[counter] = temp;
    			
    			counter++;
    		}
    	}
    	return words;
    }
	
	public static boolean areAnagrams(String a, String b){
		if(a.length() != b.length()){
			return false;
		}
		HashMap<Character, Integer> test = new HashMap<Character, Integer>();
		
		for(int i = 0; i < a.length(); i++){
			if(!test.containsKey(a.charAt(i))){
				test.put(a.charAt(i), 1);
			}else{
				test.put(a.charAt(i), test.get(a.charAt(i)) + 1);
			}
			if(!test.containsKey(b.charAt(i))){
				test.put(b.charAt(i), - 1);
			}else{
				test.put(b.charAt(i), test.get(b.charAt(i)) - 1);
			}
		}
		
		Collection c = test.values();
		Iterator it = c.iterator();
		
		while(it.hasNext()){
			if((int)it.next() != 0){
				return false;
			}
		}
		
		return true;
	}
	
	public static void printArray(String words[]){
		for(int i = 0; i < words.length; i++){
			System.out.println(words[i]);
		}
	}
}
