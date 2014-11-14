package com.srini.CodeCon;

//Problem        : Gators Win!
//Language       : Java
//Compiled Using : javac
//Version        : Java 1.7.0_65
//Input for your program will be provided from STDIN
//Print out all output from your program to STDOUT

import java.util.Arrays;
import java.util.Scanner;
//Your submission should *ONLY* use the following class name
public class Problem4
{
  public static void main(String[] args)
  {
	 int W = 0, N = 0;
	 
     Scanner stdin = new Scanner(System.in);
     W = Integer.parseInt(stdin.nextLine());
     N = Integer.parseInt(stdin.nextLine());
     double[] pos = new double[N];
     for(int i = 0; i < N; i++){
    	 pos[i] = Double.parseDouble(stdin.nextLine());
     }
     stdin.close();
     Arrays.sort(pos);
     double max = 0D;
     double mNum = 0;
     for(int i = 0; i < N; i++){
    	 double temp = findCount(pos[i], pos, ((double)pos[i] + W));
    	 if(max < temp){
    		 max = temp;
    		 mNum = pos[i];
    	 }
     }
     System.out.println(mNum);
     }
  
  public static int findCount(double start, double[] pos, double end){
	  int count = 0;
	  for(int i = 0; i < pos.length; i++){
		  if(pos[i] >= start && pos[i] <= end){
			  count++;
		  }
	  }
	  return count;
  }

}
