package com.srini.misc;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class NPatientsMDiseases {
	
	public static Map<Integer, String> diseaseList = new HashMap<Integer, String>();
	
	public static void main(String args[]){
		diseaseList.put(1, "A");
		diseaseList.put(2, "B");
		diseaseList.put(3, "C");
		diseaseList.put(4, "D");
		diseaseList.put(5, "E");
		System.out.println(count1Bits(3));
	}
	
	public static boolean hasX(int n, Patient oPatient){
		
		int offset = n/31;
		int position = n % 31;
		return ((oPatient.diseaseBitStream.get(offset))&(int)(Math.pow(2, n))) > 0? true: false;
	}
	
	public static boolean hasMoreThanNDiseases(int n, Patient oPatient){
		int count = 0;
		for(Integer i: oPatient.diseaseBitStream){
			count += count1Bits(i);
			if(count > n){
				return true;
			}
		}
		return false;
	}
	
	public static int count1Bits(int number){
		int count = 0;
		while(number > 0){
			count += number&1;
			number = number >> 1;
		}
		return count;
	}
	
	public static int getNumberOfDiseases(Patient oPatient){
		int count = 0;
		for(Integer i: oPatient.diseaseBitStream){
			count += count1Bits(i);
		}
		return count;
	}
	
}

class Patient{
	
	long iD;
	String name;
	List<Integer> diseaseBitStream;
	
	public Patient(long iD, String name, LinkedList<Integer> diseaseBitStream){
		this.iD = iD;
		this.name = name;
		this.diseaseBitStream = diseaseBitStream;
	}
	
}