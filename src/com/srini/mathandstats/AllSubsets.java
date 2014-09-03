package com.srini.mathandstats;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class AllSubsets {
	
	public static void main(String args[]){
		List set = new LinkedList();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		findAllSubsets(set);
	}
	public static void findAllSubsets(List<Integer> set){
		int size = set.size();
		int numberOfSubsets = 1 << size;
		List<Integer> temp = new LinkedList<Integer>();
		for(int i = 0; i < numberOfSubsets; i++){
			HashSet tempSet = new HashSet();
			for(int j = 0; j < set.size(); j++){
				if(getIthBit(i, j) > 0){
					tempSet.add(set.get(j));
				}
			}
			System.out.println(tempSet);
		}
	}
	
	public static int getIthBit(int n, int i){
		int mask = 1 << i;
		
		return (n & mask) ;
	}
	
}
