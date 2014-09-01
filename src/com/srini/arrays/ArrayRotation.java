package com.srini.arrays;

public class ArrayRotation {
	
	public static void main(String args[]){
		rotateMeByN(new int[]{1, 2, 3, 4, 5, 6, 7}, 3);
	}
	
	public static int[] rotateMeByN(int[] a, int n){
		a = reverseFromXToY(a, 0, a.length - 1);
		a = reverseFromXToY(a, 0, n - 1);
		return reverseFromXToY(a, n, a.length - 1);
		
	}
	
	public static int[] reverseFromXToY(int[] a, int x, int y){
		int temp = 0;
		while(x < y){
			temp = a[x];
			a[x] = a[y];
			a[y] = temp;
			x++;
			y--;
		}
		return a;
	}
}
