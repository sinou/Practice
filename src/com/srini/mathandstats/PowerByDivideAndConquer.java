package com.srini.mathandstats;

public class PowerByDivideAndConquer {
	
	public static void main(String args[]){
		recursePower(4, 3);
	}
	
	public static double power(double a, int n){
		boolean isNegative = false;
		if(n < 0){
			isNegative = true;
			n *= -1;
		}
		double result = recursePower(a, n);
		if(!isNegative){
			return result;
		}
		return 1/result;
	}
	
	public static double recursePower(double a, int n){
		if(n == 0) return 1;
		if(n == 1) return a;
		
		double temp = recursePower(a, n / 2);
		if(n % 2 == 0){
			return temp * temp;
		}else{
			return temp * temp * a;
		}
	}
	
}
