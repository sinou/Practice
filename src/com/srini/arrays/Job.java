package com.srini.arrays;

public class Job {
	
	int start;
	int end;
	int jobId;
	
	public Job(int jobId, int start, int end){
		this.start = start;
		this.end = end;
		this.jobId = jobId;
	}
	
	public String toString(){
		return this.jobId + "(" + this.start + " - " + this.end + ")";
	}
	
}
