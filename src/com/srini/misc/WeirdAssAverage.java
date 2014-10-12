package com.srini.misc;

import java.util.Arrays;

public class WeirdAssAverage {//find the average of all but top 3 numbers

	public static int topDogs[]  = new int[3];
	
	public static void main(String args[]){
		calculateWeirdAverage(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13});
	}
	
	public static void calculateWeirdAverage(int[] input){
		if(input.length < 3){
			return;
		}
		if(input.length == 3){
			U.pl("0");
			return;
		}
		topDogs[0] = input[0];
		topDogs[1] = input[1];
		topDogs[2] = input[2];
		sortUs(topDogs);
		
		for(int i = 3; i < input.length; i++){
			replaceIfNecessary(input[i]);//easier would be to use a max heap
		}
		U.pl("" + ((float)(getOurSum(input) - getOurSum(topDogs))/(input.length - 3)));
		
	}
	
	public static int getOurSum(int[] input){
		int sum = 0;
		for(int i = 0; i < input.length; i++){
			sum += input[i];
		}
		return sum;
	}
	
	public static void replaceIfNecessary(int num){
		if(num > topDogs[2]){
			topDogs[0] = topDogs[1];
			topDogs[1] = topDogs[2];
			topDogs[2] = num;
		}else if(num > topDogs[1]){
			topDogs[0] = topDogs[1];
			topDogs[1] = num;
		}else if(num > topDogs[0]){
			topDogs[0] = num;
		}
	}
	
	public static void sortUs(int [] topDogs){
		Arrays.sort(topDogs);
	}
	
}
