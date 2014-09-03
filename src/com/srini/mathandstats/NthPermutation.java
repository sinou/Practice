package com.srini.mathandstats;

import java.util.LinkedList;
import java.util.List;

public class NthPermutation {
	static List<Character> answer = new LinkedList<Character>();
	public static void main(String args[]){
		List<Character> input = new LinkedList<Character>();
		input.add('1');
		input.add('2');
		input.add('3');
		input.add('4');
		findNthPermutation(input, 8, new LinkedList<Character>());
		System.out.println(answer);
	}
	
	public static void findNthPermutation(List<Character> input, int n, List<Character> output){
		int size = input.size();
		if(size == 0){
			answer = output;
			return;
		}
		int thisManyTimes = factorial(size - 1);
		int importantNumber = (n - 1) / thisManyTimes;
		output.add(input.get(importantNumber));
		input.remove(importantNumber);
		n = n - (thisManyTimes * importantNumber);
		findNthPermutation(input, n, output);
	}
	
	public static int factorial(int n){
		if(n == 0 || n == 1){
			return 1;
		}
		return n * factorial(n - 1);
	}
	
}
