package com.srini.CodeCon;

//Problem        : It's Good to Be the King
//Language       : Java
//Compiled Using : javac
//Version        : Java 1.7.0_65
//Input for your program will be provided from STDIN
//Print out all output from your program to STDOUT

import java.util.Scanner;
//Your submission should *ONLY* use the following class name
public class Problem3
{
  public static void main(String[] args)
  {

     Scanner stdin = new Scanner(System.in);
     int n = Integer.parseInt(stdin.nextLine());
     boolean []bitArray = new boolean[n];
     stdin.close();
     for(int i = 0; i < n; i++){
    	 bitArray[i] = false;
     }
     
     for(int i = 1 ; i <= n; i++){
    	 bitArray = flipDoors(bitArray, i, n);
     }
     String str = "";
     for(int i = 0; i < n; i++){
    	 if(bitArray[i]){
    		 str += (i+1) + ",";
    	 }
     }
     System.out.println(str.substring(0, str.length()-1));
  }
  
  public static boolean[] flipDoors(boolean bitArray[], int visit, int n){
	  for(int i = 1; i <= n; i++){
		  if(i % visit == 0){
			  if(bitArray[i - 1] == false){
				  bitArray[i - 1] = true;
			  }else{
				  bitArray[i - 1] = false;
			  }
		  }
	  }
	  return bitArray;
  }

}
