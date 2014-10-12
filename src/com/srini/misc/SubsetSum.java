package com.srini.misc;

public class SubsetSum {
	
	public static void main(String args[]){
		
		findSubsetSum(new int[]{1, 1, 1, 2, 3, 4, 1, 5, 1}, 5);
		
	}
	
	public static void findSubsetSum(int set[], int target){
		
		int tempSum = 0;
		int[] sumUntil = new int[set.length];
		for(int i = 0; i < set.length; i++){
			tempSum += set[i];
			sumUntil[i] = tempSum;
		}
		
		for(int i = 0; i < sumUntil.length; i++){
			if(sumUntil[i] == target){
				U.pl("0 - " + i);
			}
			for(int j = i; j < sumUntil.length; j++){
					if(Math.abs(sumUntil[i] - sumUntil[j]) == target){
						U.pl((i + 1) + " - " + (j));
					}
			}
		}
		
	}
	
}
