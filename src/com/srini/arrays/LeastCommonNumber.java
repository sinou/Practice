package com.srini.arrays;

public class LeastCommonNumber {
	
	public static void main(String args[]){
		System.out.println(getMetheLeastCommonNumber(new int[]{6, 7, 10, 25, 30, 63, 64}, 
				new int[]{-1, 4, 5, 6, 7, 8, 50}, new int[]{1, 6, 10, 14}));
	}
	
	public static int getMetheLeastCommonNumber(int[] a, int[] b, int[] c){
		int i = 0, j = 0, k = 0;
		while(i < a.length && j < b.length && k < c.length){
			if(a[i] == b[j] && b[j] == c[k]){
				return a[i];
			}
			if(a[i] <= b[j] && a[i] <= c[k]){
				i++;
			}else if(b[j] <= a[i] && b[j] <= c[k]){
				j++;
			}else if(c[k] <= a[i] && c[k] <= b[j]){
				k++;
			}
		}
		return Integer.MIN_VALUE;
	}
	
}
