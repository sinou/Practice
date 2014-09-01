package com.srini.arrays;

public class QuickSort {
	static int[] arr = {2, 3, 234, 23, 324, 234, 2, 422, 3};
	public static void main(String args[]){
		quickSort(arr);
	}
	public static void quickSort(int[] arr){
		quickSortRec(arr, 0, arr.length - 1);
	}
	public static void quickSortRec(int[] arr, int low, int high){
		if(high > low){
			int pivot = partition(arr, low, high);
			quickSortRec(arr, low, pivot - 1);
			quickSortRec(arr, pivot + 1, high);
		}
	}
	public static int partition(int[] arr, int low,int high){
		int pivotValue = arr[low];
		int i = low;
		int j = high;
		while(i < j){
			while(arr[i] <= pivotValue && i <=high)i++;
			while(arr[j] > pivotValue) j--;
			
			if(i < j){
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}else{
				break;
			}
			
		}
		arr[low] = arr[j];
		arr[j] = pivotValue;
		return j;
	}
}
