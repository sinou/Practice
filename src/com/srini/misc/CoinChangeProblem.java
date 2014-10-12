package com.srini.misc;

import java.util.LinkedList;

public class CoinChangeProblem {
	
	public static LinkedList<Integer> denominations = new LinkedList<Integer>();
	
	public static void main(String args[]){
		
		denominations.add(1);
		denominations.add(2);
		denominations.add(5);
		denominations.add(10);
		//findAllCombinations(50, 0, 0, new LinkedList<Integer>());
		findBestSolution(58);
		U.pl("Finished execution");
		
	}
	
	public static void findAllCombinations(int target, int current, int index, LinkedList<Integer> answer){
		
		if(current == target){
			U.pl(answer.toString());
		}
		
		for(int i = index; i < denominations.size(); i++){
			int temp = current + denominations.get(i);
			if(current <= target){
				answer.add(denominations.get(i));
				findAllCombinations(target, temp, i, answer);
				answer.remove(answer.size() - 1);
			}else{
				return;
			}
		}
		
	}
	
	public static void findBestSolution(int target){
		
		int current = 0;
		LinkedList<Integer> answer = new LinkedList<Integer>();
		int temptarget = target;
		while(current <= target){
			if(current == target){
				U.pl(answer.toString());
				return;
			}
			int optimal = findLargestDinominationsThatFits(temptarget);
			int times = temptarget/optimal;
			current += (times * optimal);
			temptarget = temptarget - (times * optimal);
			answer = addToAnswer(optimal, times, answer);
		}
		return;
	}
	
	public static LinkedList<Integer> addToAnswer(int num, int times, LinkedList<Integer> answer){
		for(int i = 0; i < times; i++){
			answer.add(num);
		}
		return answer;
	}
	
	public static int findLargestDinominationsThatFits(int target){//assuming denominations are sorted in ascending order
		//otherwise, they have to be sorted before calling this method!
		int previous = denominations.get(0);
		for(Integer i: denominations){
			if(i <= target){
				previous = i;
			}
		}
		return previous;
	}
	
}
