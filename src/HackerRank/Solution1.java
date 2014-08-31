package HackerRank;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.Math;
import java.util.regex.*;

public class Solution1 {

    public static void main(String[] args) throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      int T = 0;
      int N = 0;
      int answer = 1;
      int temp = 0;
      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
      String s;
      s = in.readLine();
      while ((s = in.readLine()) != null && s.length() != 0){
          temp = Integer.parseInt(s);
          	  for(int j = 0; j < temp/2; j++){
        		  	answer = (int) (answer*2 + 1);
        	  }
          
        if(temp % 2 != 0){
        	answer *= 2;
        }
          System.out.println(answer);
          answer = 1;
        }
      }
 }