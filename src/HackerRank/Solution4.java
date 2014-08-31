package HackerRank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Solution4 {

	public static void main(String[] args) throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      
      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
      String s;
      s = in.readLine();
      int numberOfCuts = 0;
      BigInteger answer = new BigInteger("0");
      while ((s = in.readLine()) != null && s.length() != 0){
    	  numberOfCuts = Integer.parseInt(s);
    	  if(numberOfCuts % 2 != 0){
    		  answer = BigInteger.valueOf((numberOfCuts/2)).multiply(BigInteger.valueOf((numberOfCuts/2)+1));
    	  }else{
    		  answer = BigInteger.valueOf((numberOfCuts/2)).multiply(BigInteger.valueOf(numberOfCuts/2));
    	  }
    	  System.out.println(answer);
      }
	}
	
}
