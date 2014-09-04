package com.srini.dynamic;

public class MaximumSumNonAdjacent {
	
	public static void main(String args[]){
		
	}
	
	public static int getMaxSumNonContiguous(int[] input){
		
		int [] result = new int[input.length];
		for(int i = 1; i < input.length; i++){
			result[i] = Math.max(input[i], result[i - 1]);
			if(i >= 2){
				result[i] = Math.max(result[i], input[i] + result[i - 2]);
			}
			
		}
		return result[input.length - 1];
	}
	
}
