package HackerRank;

import java.math.*; 
import java.util.*;
public class Solution{ 
  public static void main(String args[]){ 
       Scanner in = new Scanner(System.in); 
       int range = in.nextInt(); 
       String []input = new String[range*2];
       int temp = 0;
       for(int i = 0; i < input.length; i++){
         input[i] = in.next();
       }
       int output[] = new int[100];
       for(int i = 0; i < range; i++){
         output[Integer.parseInt(input[i])] += 1;
       }
       for(int i = 0; i < 100; i++){
         temp += output[i];
         System.out.print(output[i] + " ");
       }
  }
  
}