package com.srini.mathandstats;

public class StringPermutation {
	
	public static void main(String args[]){
		permuteMe(new char[]{'a', 'b', 'c'}, 0, 3);
	}
	
	public static void permuteMe(char[] string, int start, int end){
		if(string.length == 0){
			return;
		}
		if(start == end){
			System.out.println(string);
		}
		for(int i = start; i < end; i++){
			string = swapChars(string, start, i);
			permuteMe(string, start + 1, end);
			string = swapChars(string, start, i);
		}
	}
	
	public static char[] swapChars(char[] string, int i, int j){
		char temp = string[i];
		string[i] = string[j];
		string[j] = temp;
		return string;
	}
	
}
