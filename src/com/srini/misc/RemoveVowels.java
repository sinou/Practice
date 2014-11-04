package com.srini.misc;

public class RemoveVowels {
	
	public static void main(String args[]){
		U.pl(removeVowels("abacsdfrtertswa svddaeb"));
	}
	
	static String removeVowels(String input){
		
		char str[] = input.toCharArray();
		int trailingPtr = 0;
		int leadingPtr = 0;
		for(int i = 0; i < str.length; i++){
			if(!isVowel(Character.toLowerCase(str[i]))){
				str[trailingPtr] = str[leadingPtr];
				trailingPtr++;
			}
			leadingPtr++;
		}
		return String.valueOf(str).substring(0, trailingPtr);
		
	}
	
	static boolean isVowel(char c){
		if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
			return true;
		}
		return false;
	}
	
}
