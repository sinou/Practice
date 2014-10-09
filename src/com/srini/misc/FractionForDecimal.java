package com.srini.misc;

import com.srini.misc.U;

public class FractionForDecimal {//works for upto 4 decimal places
	
	public static void main(String args[]){
		U.prtl(getGCD(36, 48) + "");
		getFraction(0.4F);
	}
	
	public static void getFraction(float number){
		int x = (int)(number * 10000);
		int y = 10000;
		int GCD = getGCD(x, y);
		U.prtl((x/GCD) + "/" + (y/GCD) );
	}
	
	
	public static int getGCD(int num1, int num2){
		
		if(num2 == 0){
			return num1;
		}
		return getGCD(num2, num1 % num2);
		
	}
	
}
