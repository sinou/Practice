package com.srini.misc;

public class BinaryRotated {
	
	public static void main(String args[]){
		System.out.println(startSearch(new int[]{8, 9, 1, 2, 3, 4, 5, 6, 7}, 4));
	}
	
	static int startSearch(int[] input, int key){
		return searchBinary(input, key, 0, input.length - 1);
	}
	
	static int searchBinary(int[] input, int key, int low, int high){
		
		if(low > high){
			return -1;
		}
		
		int mid = low + (high - low)/2;
		if(input[mid] == key){
			return mid;
		}
		
		if(input[low] <= key && input[mid] > key && input[low] < input[mid]){
			return searchBinary(input, key, low, mid - 1);
		}else if(input[mid] < key && input[high] >= key && input[mid] < input [high]){
			return searchBinary(input, key, mid + 1, high);
		}else if(input[low] > input[mid]){
			searchBinary(input, key, low, mid - 1);
		}else if(input[mid] > input[high]){
			searchBinary(input, key, mid + 1, high);
		}
		
		return -1;
		
	}
	
}
