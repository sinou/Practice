package com.srini.BitManipulation;

import java.util.LinkedList;
import java.util.List;

import com.srini.misc.U;

public class GreyCodeNumbers {
	
	static LinkedList<Integer> beginning = new LinkedList<Integer>();
	
	public static void main(String args[]){
		beginning.add(0);
		beginning.add(1);
		generateGreyCode(3, 1);
		for(Integer i: beginning){
			U.pl(Integer.toBinaryString(i));
		}
	}
	
	public static void generateGreyCode(int binaryDigits, int current){
		
		if(binaryDigits == 1){
			return;
		}
		binaryDigits--;
		for(int i = beginning.size() - 1; i >= 0; i--){
			beginning.add(mask(beginning.get(i), current));
		}
		current++;
		generateGreyCode(binaryDigits, current);
	}
	
	public static int mask(int num, int pos){
		
		return (num|((int)Math.pow(2, pos)));
		
	}
	
}
