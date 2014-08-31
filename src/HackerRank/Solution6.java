package HackerRank;

import java.math.BigInteger;
import java.util.Scanner;

public class Solution6 {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] temp = in.nextLine().split(" ");
        long N, M, start, end;
        N = Long.parseLong(temp[0].trim());
        M = Long.parseLong(temp[1].trim());
        BigInteger a = new BigInteger("0");
        BigInteger number = new BigInteger("0");
        BigInteger avg = new BigInteger("0");
        for(int i = 0; i < M; i++){
        	temp = in.nextLine().split(" ");
        	start = Long.parseLong(temp[0].trim());
        	end = Long.parseLong(temp[1].trim());
        	number = new BigInteger(temp[2].trim());
        		a = a.add(number.multiply(new BigInteger((end - start + 1) + ""))); 
        	
        }
        
        avg = a.divide(new BigInteger(N+""));
        System.out.println(avg);
	}
	
}
