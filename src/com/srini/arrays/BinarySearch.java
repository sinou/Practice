package com.srini.arrays;

public class BinarySearch {
	
	
	public static void main(String args[]){
		
	}
	
	public static int doRecursiveBinarySearch(int [] array, int key, int begin, int end){
		if(begin > end){
			return -1;
		}
		
		int mid = (begin + end) / 2;
		if(array[mid] == key){
			return mid;
		}else if(array[mid] < key){
			return doRecursiveBinarySearch(array, key, mid + 1, end);
		}else{
			return doRecursiveBinarySearch(array, key, begin, mid - 1);
		}
		
	}
	
}
