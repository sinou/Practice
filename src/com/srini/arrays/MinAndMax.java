package com.srini.arrays;

public class MinAndMax {
	public static void main(String args[]){
		System.out.println( findLowIndexOfN(new int[]{1, 2, 3, 4, 5, 5, 5, 5, 5, 
				5, 5, 5, 5, 5, 6, 7, 8, 9}, 5) );
		System.out.println( findHighIndexOfN(new int[]{1, 2, 3, 4, 5, 5, 5, 5, 5, 
				5, 5, 5, 5, 5, 6, 7, 8, 9}, 5) );
	}
	public static int findLowIndexOfN(int[] a, int key){
		int low = 0;
		int high = a.length - 1;
		int mid = high / 2;
		while(low <= high){
			int midVal = a[mid];
			if(midVal < key){
				low = mid + 1;
			}else{
				high = mid - 1;
			}
			mid = low + (high - low) / 2;
		}
		
		if(a[low] == key){
			return low;
		}
		return -1;
	}
	
	public static int findHighIndexOfN(int[] a, int key){
		int low = 0;
		int high = a.length - 1;
		int mid = high / 2;
		while(low <= high){
			int midVal = a[mid];
			if(midVal <= key){
				low = mid + 1;
			}else{
				high = mid - 1;
			}
			mid = low + (high - low) / 2;
		}
		
		if(a[high] == key){
			return high;
		}
		return -1;
	}
	
	
}
