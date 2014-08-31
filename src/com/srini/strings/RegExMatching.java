package com.srini.strings;

public class RegExMatching {
	
	public static void main(String args[]){
		match("aabbbbbcdda", ".*b*c*d*a*");
	}
	
	public static boolean match(String text, String pattern){
		return match(text, pattern, 0, 0);
	}
	
	public static boolean match(String text, String pattern, int i, int j){
		if(text.length() == i && pattern.length()== j){
			return true;
		}
		
		if(j < pattern.length() - 1 && pattern.charAt(j + 1) == '*'){
			for(int k = i; k <= text.length(); ++k){
				if(match(text, pattern, k, j + 2)){
					return true;
				}if(k >= text.length()){
					return false;
				}
				if(pattern.charAt(j) != '.' && text.charAt(k) != pattern.charAt(j)){
					return false;
				}
			}
		}else if(i < text.length() && j < pattern.length() &&
				(pattern.charAt(j) == '.' || pattern.charAt(j) == text.charAt(i))){
			return match(text, pattern, i + 1, j + 1);
		}
		return false;	
	}
}
