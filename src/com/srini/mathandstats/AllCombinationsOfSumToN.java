package com.srini.mathandstats;

import java.util.LinkedList;
import java.util.List;

public class AllCombinationsOfSumToN {
	
	public static void main(String args[]){
		sumToN(4, 0, 1, new LinkedList<Integer>());
	}
	
	public static void sumToN(int target, int curr, int start, List<Integer> answer){
		if(target == curr){
			System.out.println(answer);
		}
		
		for(int i = start; i < target; ++i){
			int temp = curr + i;
			if(temp <= target){
				answer.add(i);
				sumToN(target, temp, i, answer);
				answer.remove(answer.size() - 1);
			}else{
				return;
			}
		}
		
	}
	
}
