package com.srini.arrays;

public class Range {
	int start;
	int end;
	public Range(int start, int end){
		this.start = start;
		this.end = end;
	}
	
	public String toString(){
		return ("(" + this.start + ", " + this.end + ")");
	}
}
