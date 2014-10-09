package com.srini.misc;

public class MaximumSubsequence {
	public static void main(String args[]){
		getMaxSubSeq(new int[]{-1, -2, 3, 5, 6, -15, 4, 6, -25, 36, 23, 34, -2, -4});
	}
    public static void getMaxSubSeq(int input []){
    	int globalMax = input[0];
    	int localMax = input[0];
    	for(int i = 1; i < input.length; i++){
    		if(localMax < 0){
    			localMax = 0;
    		}
    		localMax += input[i];
    		if(localMax > globalMax){
    			globalMax = localMax;
    		}
    	}
    	
    	System.out.println(globalMax);
    }
}
