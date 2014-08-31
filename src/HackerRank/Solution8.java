package HackerRank;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Set;

public class Solution8 {


    
   
 public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
     int numberOfTestCases = Integer.parseInt(in.nextLine());
     int stoneCount = 0, a = 0, b = 0, combinatoricsStuff = 0, bitHolder = 0, combination = 0,
         possibility = 0;
     Set printThis;
     List key;
     for(int i = 0; i < numberOfTestCases; i++){
    	 key = new ArrayList();
    	 printThis = new HashSet();
         stoneCount = Integer.parseInt(in.nextLine());
         a = Integer.parseInt(in.nextLine());
         b = Integer.parseInt(in.nextLine());
         for(int j = 0; j < stoneCount ; j++){
        	 possibility = j*a + (stoneCount - j - 1)*b;
        	 printThis.add(possibility);
             possibility = 0;
        }
         Iterator iter = printThis.iterator();
         while(iter.hasNext()){
        	 key.add(iter.next());
         }
         printThis = new HashSet();
         Collections.sort(key);
         System.out.println(key.toString().replace("]", "").replace("[", "").replace(", ", " "));
     }
   }
}