package com.srini.misc;

public class Test{

    public static void main(String []args){
       int test = 31;
       while(test > 0){
    	   int x = (1 << 30);
           System.out.println((x&test));
       }
       
    }
}
