package com.srini.misc;

public class LookAndSay {
	
	public static void main(String[] args){
		String num = "1"; 
	 
		for (int i=1;i<=10;i++) {
			U.pl(num);
			num = doLookAndSay(num);             
		}
	}

	public static String doLookAndSay(String number){
		StringBuilder result = new StringBuilder();
		char trailing = number.charAt(0);
		number = number.substring(1) + " ";
		int times = 1;
		for(char leading: number.toCharArray()){
			if(trailing != leading){
				result.append(times + "" + trailing);
				times = 1;
				trailing = leading;
			}else{
				times++;
			}
		}
		return result.toString();
	}
	
}
