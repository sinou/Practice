package com.srini.strings;

public class LookAndSay {
	
	public static void main(String args[]){
		lookAndSay("1", 5);
	}
	
	public static String lookAndSay(String str, int n){
		
		StringBuilder output = new StringBuilder();
		while(n > 0){
			
			int len = 1;
			int currCount = 1;
			
			while(len <= str.length()){
				
				if(len < str.length() && str.charAt(len) == str.charAt(len - 1)){
					currCount++;
				}else{
					output.append(String.valueOf(currCount) + str.charAt(len - 1));
					currCount = 1;
				}
				len++;
			}
			
			System.out.println(output);
			
			str = output.toString();
			
			output = new StringBuilder();
			--n;
			
		}
		return str;
	}
		
	
}
