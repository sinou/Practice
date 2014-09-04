package com.srini.dynamic;

public class MaximumSumSubarray {
	
	public static void main(String args[]){
		findMaxSumSubArray(new int[]{-4, 2, -5, 1, 2, 3, 6, -5, 1});
	}
	
	public static int findMaxSumSubArray(int[] input){
		
		int globalSum = input[0];
		int localSum = input[0];
		for(int i = 1; i < input.length; i++){
			if(localSum < 0 ){
				localSum = input[i];
			}else{
				localSum += input[i];
			}
			if(localSum > globalSum){
				globalSum = localSum;
			}
		}
		return globalSum;
		
	}
	
}
