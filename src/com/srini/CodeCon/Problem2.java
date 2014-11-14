package com.srini.CodeCon;

//Problem        : Giga Ball
//Language       : Java
//Compiled Using : javac
//Version        : Java 1.7.0_65
//Input for your program will be provided from STDIN
//Print out all output from your program to STDOUT

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;
//Your submission should *ONLY* use the following class name
public class Problem2
{
  public static void main(String[] args)
  {
	  int L = 0, M = 0, N = 0;
     Scanner stdin = new Scanner(System.in);
     String tempS[] = stdin.nextLine().split(" ");
     L = Integer.parseInt(tempS[0]);
     M = Integer.parseInt(tempS[1]);
     N = Integer.parseInt(tempS[2]);
     int [] A = new int[L];
     int [] B = new int[M];
     int [] C = new int[N];
     for(int i = 0; i < L; i++){
    	 A[i] = Integer.parseInt(stdin.nextLine());
     }
     for(int i = 0; i < M; i++){
    	 B[i] = Integer.parseInt(stdin.nextLine());
     }
     for(int i = 0; i < N; i++){
    	 C[i] = Integer.parseInt(stdin.nextLine());
     }
     stdin.close();
     Map<Integer, Integer> holder = new HashMap<Integer, Integer>();
     ArrayList<Integer> test = new ArrayList<Integer>();
     for(int i = 0; i < L; i++){
    	 for(int j = 0; j < M; j++){
    		 for(int k = 0; k < N; k++){
    			 int temp = A[i] + B[j] + C[k];
    			 test.add(temp);
    			 if(!holder.containsKey(temp)){
    				 holder.put(temp, 1);
    			 }else{
    				 holder.put(temp, holder.get(temp) + 1);
    			 }
    		 }
    	 }
     }
     int max = 0;
     int realDeal = 0;
     for(Integer i: holder.keySet() ){
    	 if(holder.get(i) > max){
    		 max = holder.get(i);
    		 realDeal = i;
    	 }
     }
     int prev = test.get(0);
     int maxOccur = 0;
     int tempOccur = 0;
     int theNum = 0;
     Collections.sort(test);
     for(Integer i: test){
    	 if(prev != i){
    		 tempOccur = 1;
    		 prev = i;
    	 }else{
    		 tempOccur++;
    	 }
    	 if(tempOccur > maxOccur){
    		 maxOccur = tempOccur;
    		 theNum = i;
    	 }
     }
     System.out.println(theNum);
     //System.out.println(realDeal);
  }

}
