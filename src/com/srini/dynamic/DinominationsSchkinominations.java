package com.srini.dynamic;

import java.util.ArrayList;
import java.util.List;

public class DinominationsSchkinominations {
	
	public static void main(String args[]){
		List<Integer> denominations = new ArrayList<Integer>();
		denominations.add(1);
		denominations.add(2);
		denominations.add(5);
		List<Integer> currentCombo = new ArrayList<Integer>();
		allCombinations(denominations, currentCombo, 7, 0);
	}
	
	public static void allCombinations(List<Integer> denominations, List<Integer> currentCombo, int sumTo, int currentSum){
		for(int i = 0; i < denominations.size(); i++){
			if(currentSum == sumTo){
				System.out.println(currentCombo);
			}
			if(currentSum + denominations.get(i) <= sumTo){
				currentSum += denominations.get(i);
				currentCombo.add(denominations.get(i));
				allCombinations(denominations, currentCombo, sumTo, currentSum);
				currentCombo.remove(denominations.get(i));
				currentSum -= denominations.get(i);
			}
			
		}
	}
	
}
