package com.srini.misc;

public class AllPalindromes {
	
	public static void main(String args[]){
		getAllPalindromes("aababcdcbabaapqp");
	}
	
	public static void getAllPalindromes(String word){
		for(int i = 0; i < word.length(); i++){
			for(int j = i + 2; j < word.length(); j++){
				if(isPalindrome(word, i, j)){
					U.pl(word.substring(i, j+1));//there is a dynamic programming solution
					//hiding in here. will update soon
				}
			}
		}
	}
	
	public static boolean isPalindrome(String word, int start, int end){//index starts at 0
		
		while(end > start){
			if(word.charAt(start) != word.charAt(end)){
				return false;
			}
			start++;
			end--;
		}
		return true;
		
	}
	
}
