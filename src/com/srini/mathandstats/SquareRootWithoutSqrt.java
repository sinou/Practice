package com.srini.mathandstats;

public class SquareRootWithoutSqrt {
	private static final double EPSILON = 0.00001;
	public static void main(String args[]){
		
	}
	public static double sqrt(double num){
		double low = 0;
		double high = 1 + num / 2;
		double mid = 0, sqr = 0, diff = 0, answer = 0;
		while(low < high){
			mid = (low + high) / 2;
			sqr = mid * mid;
			diff = Math.abs(num - sqr);
			if(diff < EPSILON){
				return mid;
			}
			if(sqr < num){
				low = mid;
			}else{
				high = mid;
			}
		}
		return 0D;
	}
}
