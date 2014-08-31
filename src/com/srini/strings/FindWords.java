package com.srini.strings;

import java.util.HashSet;

public class FindWords {
	public static void main(String args[]){
		HashSet<String> dictionary = new HashSet<String>();
		dictionary.add("apple");
		dictionary.add("pie");
		dictionary.add("pear");
		System.out.println(areAllWords("applepiepearapple", dictionary));
	}
	public static boolean areAllWords(String bunchOfLetters, HashSet<String> dictionary){
		HashSet<String> alreadyDiscovered = new HashSet<String>();
		return  areAllWords(bunchOfLetters, dictionary, alreadyDiscovered);
	}
	public static boolean areAllWords(String bunchOfLetters, HashSet<String> dictionary,
			HashSet<String> alreadyDiscovered){
		for(int i = 0; i <= bunchOfLetters.length(); i++){
			String first = bunchOfLetters.substring(0, i);
			if(dictionary.contains(first)){
				alreadyDiscovered.add(first);
				String second = bunchOfLetters.substring(i);
				if(second == null || second.length() == 0 ){
					return true;
				}
				if(!alreadyDiscovered.contains(second)){
					if(areAllWords(second, dictionary, alreadyDiscovered)){
						return true;
					}
				}else{
					return true;
				}
			}
		}
		return false;
	}
}
