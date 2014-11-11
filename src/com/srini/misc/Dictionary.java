package com.srini.misc;

import com.srini.misc.TrieNode;
// fitting a dictionary in a try
public class Dictionary {
	static TrieNode[] dictionary = new TrieNode[26];
	public static void main(String args[]){
		// a few words to add to the dictionary
		String [] words = {"dictionary", "public", "library", "university", "boss", "work", "bicycle" };
		addWords(words);
		System.out.println(isAWord("boss"));
		System.out.println(isAWord("bosd"));
		
	}
	
	public static void addWords(String words[]){
		for(String word: words){
			addWordRecursively(word.toCharArray(), 0, dictionary);
		}
	}
	
	public static void addWordRecursively(char word[], int charNum, TrieNode[] curr){
		if(charNum == word.length){
			return;
		}
		if(curr[word[charNum] - 'a'] == null){
			curr[word[charNum] - 'a'] = new TrieNode();
		}
		addWordRecursively(word, charNum + 1, curr[word[charNum] - 'a'].children);
	}
	
	public static boolean isAWord(String word){
		
		char[] temp = word.toCharArray();
		
		return findWord(temp, 0, dictionary);
		
	}
	
	public static boolean findWord(char word[], int charNum, TrieNode[] curr){
		
		if(charNum == word.length){
			return true;
		}
		if(curr[word[charNum] - 'a'] == null){
			return false;
		}
		return findWord(word, charNum + 1, curr[word[charNum] - 'a'].children);
	}
	
}
