package com.srini.arrays;

public class MergeIntervals {
	
	public static void main(String args[]){
		Range r1 = new Range(1, 2);
		Range r2 = new Range(3, 7);
		Range r3 = new Range(4, 6);
		Range r4 = new Range(6, 8);
		Range r5 = new Range(10, 12);
		Range r6 = new Range(11, 15);
		Range[] test = new Range[]{r1, r2, r3, r4, r5 , r6};
		test = mergeIntevals(test);
		int i = 0;
		while(test[i] != null){
			System.out.println(test[i]);
			i++;
		}
	}
	
	public static Range[] mergeIntevals(Range[] intervalArray){
		Range[] output = new Range[intervalArray.length];
		output[0] = intervalArray[0];
		for(int i = 1, j = 0; i < intervalArray.length; i++){
			if(output[j].end >= intervalArray[i].start){
				output[j].end = intervalArray[i].end;
			}else{
				j++;
				output[j] = intervalArray[i];
			}
		}
		return output;
		
	}
	
}
