package com.srini.arrays;

public class ZeroesInArray {
	public static void main(String args[]){
		System.out.println(moveZeroesToLeft(new int[]{0, 1, 2, 3, 5, 0, 0, 7, 0, 7, 0}));
	}
	
	public static int[] moveZeroesToLeft(int[] arrayWithZeroes){
		int read = arrayWithZeroes.length - 1;
		int write = arrayWithZeroes.length - 1;
		for(int i = read; i >= 0; i--){
			if(arrayWithZeroes[i] != 0){
				arrayWithZeroes[write] = arrayWithZeroes[i];
				write--;
			}
		}
		for(int i = write; i >= 0; i--){
			arrayWithZeroes[i] = 0;
		}
		return arrayWithZeroes;
	}
}
