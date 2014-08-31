package com.srini.strings;

public class SubsetPalindromes {
	
	public static void main(String args[]){
		System.out.println(findSubsetPalindromes("aaabbbaaa"));
	}
	
	public static int findSubsetPalindromes(String str){
		int count = 0;
		for(int i = 0; i < str.length();i++){
			count += findPalindromesInRange(str, i - 1, i + 1);
			count += findPalindromesInRange(str, i, i + 1);
		}
			
		return count;
	}
	
	public static int findPalindromesInRange(String str, int i, int j){
		int count = 0;
		for(;i >= 0 && j < str.length(); i--, j++){
			if(str.charAt(i) != str.charAt(j)){
				break;
			}
			System.out.println(str.substring(i, j + 1));
			count++;
		}
		return count;
	}
	
}
