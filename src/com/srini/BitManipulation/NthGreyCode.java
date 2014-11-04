package com.srini.BitManipulation;

import com.srini.misc.U;

public class NthGreyCode {
	
	public static void main(String args[]){
		U.pl(Integer.toBinaryString(getNth(7)));
	}
	
	public static int getNth(int n){
		n--;
		return (n^(n/2));
	}
	
}
