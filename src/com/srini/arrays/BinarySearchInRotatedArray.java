package com.srini.arrays;

public class BinarySearchInRotatedArray {
	public static void main(String args[]){
		System.out.println(binarySearch(new int[]{8, 9, 1, 2, 3, 4, 5, 6, 7}, 9));
	}
	
	public static int binarySearch(int[] a, int key){
		return binarySearchRecursive(a, key,  0, a.length - 1);
	}
	
	public static int binarySearchRecursive(int[] a, int key, int low, int high){
		if(low > high){
			return -1;
		}
		
		int mid = low + (high - low) / 2;
		if(key == a[mid]){
			return mid;
		}
		
		if(a[low] <= key && a[mid] < key && a[low] < a[mid]){
			return binarySearchRecursive(a, key, low, mid - 1);
		}else if(a[mid] <= key && a[high] > key && a[mid] < a[high]){
			return binarySearchRecursive(a, key, mid + 1, high);
		}else if(a[low] > a[mid]){
			return binarySearchRecursive(a, key, low, mid - 1);
		}else if(a[mid] > a[high]){
			return binarySearchRecursive(a, key, mid + 1, high);
		}
		
		return -1;
	}
}
