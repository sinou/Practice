package com.srini.mathandstats;

public class DivisionWithoutDivision {
	
	public static void main(String args[]){
		System.out.println(lookMaNoHands(5, 2));
	}
	
	public static int lookMaNoHands(int a, int b){
		int answer = 0;
		int temp = b;
		if(b > a){
			return answer;
		}
		while(temp <= a){
			temp += b; 
			answer++;
		}
		
		return answer;
	}
	
}
