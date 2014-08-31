package HackerRank;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Set;

public class Solution9 {

 public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
     int numberOfTestCases = Integer.parseInt(in.nextLine());
     for(int count = 0; count < numberOfTestCases; count++){
	     long number = Integer.parseInt(in.nextLine());
	     int counter = 0;
	     String numString = number+"";
	     for(int i = 0; i < numString.length();i++){
	    	 int tempDivider = Integer.parseInt(numString.charAt(i)+"");
	    	 if(tempDivider != 0 && number % Integer.parseInt(numString.charAt(i)+"") == 0){
	    		 counter++;
	    	 }
	     }
	     System.out.println(counter);
     }
   }
}