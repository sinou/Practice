package com.srini.arrays;

import java.util.ArrayDeque;

public class FindMaxInSlidingWindow {
	public static void main(String args[]){
		findMaxSlidingWindow(new int[]{-4, 2, -5, 1, -1, 6}, 3);
	}
	public static void findMaxSlidingWindow(int[] a,
			int windowSize){
		
		if(a.length < windowSize){
			return;
		}
		
		ArrayDeque<Integer> window = new ArrayDeque<Integer>();
		
		for(int i = 0; i < windowSize; i++){
			while(!window.isEmpty() && a[i] >= a[window.peekLast()]){
				window.removeLast();
			}
			window.addLast(i);
		}
		System.out.println(a[window.peekFirst()]);
		
		for(int i = windowSize; i < a.length; i++){
			while(!window.isEmpty() && a[i] > a[window.peekLast()]){
				window.removeLast();
			}
			
			if(!window.isEmpty() && window.peekFirst() <= i - windowSize){
				window.removeFirst();
			}
			window.addLast(i);
			System.out.println(a[window.peekFirst()]);
		}
		
	}
}
