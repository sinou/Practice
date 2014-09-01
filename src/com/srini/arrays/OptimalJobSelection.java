package com.srini.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class OptimalJobSelection {
	
	public static void main(String args[]){
		Job a = new Job(1, 11, 14);
		Job b = new Job(2, 3, 12);
		Job c = new Job(3, 1, 4);
		Job d = new Job(4, 7, 10);
		Job e = new Job(5, 4, 10);
		ArrayList<Job> jobs = new ArrayList<Job>();
		jobs.add(a);
		jobs.add(b);
		jobs.add(c);
		jobs.add(d);
		jobs.add(e);
		System.out.println(getOptimalJobs(jobs));
	}
	
	public static ArrayList<Job> getOptimalJobs(ArrayList<Job> jobs){
		ArrayList<Job> doableJobs = new ArrayList<Job>();
		Collections.sort(jobs, new Comparator<Job>(){
			public int compare(Job a, Job b){
				return a.end - b.end;
			}
		});
		
		int i = 1, curr= 0;
		doableJobs.add(jobs.get(0));
		while(i < jobs.size()){
			if(jobs.get(i).start > jobs.get(curr).end){
				doableJobs.add(jobs.get(i));
				curr = i;
			}
			i++;
		}
		
		return doableJobs;
	}
	
}
