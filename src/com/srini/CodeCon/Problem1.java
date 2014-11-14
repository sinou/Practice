package com.srini.CodeCon;

//Problem        : Sum Those Primes
//Language       : Java
//Compiled Using : javac
//Version        : Java 1.7.0_65
//Input for your program will be provided from STDIN
//Print out all output from your program to STDOUT

import java.util.Scanner;
//Your submission should *ONLY* use the following class name
public class Problem1
{
  public static void main(String[] args)
  {
	  int min = 0, max = 0, sum = 0;
     Scanner stdin = new Scanner(System.in);
     
    	 min = Integer.parseInt(stdin.nextLine());
    	 max = Integer.parseInt(stdin.nextLine());
    	 sum = min + max;
     stdin.close();
     for(int i = min + 1; i < max; i++){
    	 if(isPrime(i)){
    		 sum += i;
    	 }
     }
     System.out.println(sum);
  }
  
  public static boolean isPrime(int num){
	  for(int i = 2; i < num/2 + 1; i++){
		  if(num % i == 0){
			  return false;
		  }
	  }
	  return true;
  }

}
