package com.srini.mathandstats;

public class ParanthesisProblemo {
	public static void main(String args[]){
		solveForN(4, 0, 0, "");
	}
	public static void solveForN(int n, int leftCount, int rightCount, String output){
		if(n == 0){
			return;
		}
		
		if(n == leftCount && n == rightCount){
			System.out.println(output);
		}
		if(leftCount < n ){
			output += '{';
			solveForN(n, leftCount + 1, rightCount, output);
			output = output.substring(0, output.length() - 1);
		}
		if(rightCount < leftCount){
			output += '}';
			solveForN(n, leftCount, rightCount + 1, output);
			output = output.substring(0, output.length() - 1);
		}
	}
}
