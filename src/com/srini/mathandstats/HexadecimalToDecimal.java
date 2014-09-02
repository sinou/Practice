package com.srini.mathandstats;

public class HexadecimalToDecimal {
	
	public static void main(String args[]){
		System.out.println(hexToDec("A"));
		System.out.println(hexToDec("f"));
		System.out.println(hexToDec("1A"));
		System.out.println(hexToDec("2f"));
		System.out.println(hexToDec("2f"));
	}
	
	public static int hexToDec(String hex){
		
		char current = Character.toUpperCase(hex.charAt(0));
		int temp = 0;
		if(current >= 48 && current <= 57){
			temp = current - '0';
		}else if(current >= 65 && current <= 70){
			temp = current - 'A' + 10;
		}else{
			return Integer.MIN_VALUE;
		}
		for(int i = 1; i < hex.length(); i++){
			temp = temp*16;
			current = Character.toUpperCase(hex.charAt(i));
			if(current >= 48 && current <= 57){
				temp += current - '0';
			}else if(current >= 65 && current <= 70){
				temp += current - 'A' + 10;
			}
		}
		return temp;
		
	}
	
}
