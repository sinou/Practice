package HackerRank;

import java.math.BigInteger;
import java.util.Scanner;
import java.util.Arrays;

public class Solution7 {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int K = in.nextInt();
        BigInteger min = new BigInteger("0");
        BigInteger[] big = new BigInteger[N];
        for(int i = 0; i < N; i++){
        	big[i] = new BigInteger(in.nextInt()+"");
        }
        Arrays.sort(big);
        min = big[K - 1].subtract(big[0]);
        
        for(int i = 0; i < N - K; i++){
        	
        	if((big[i + K - 1].subtract(big[i])).compareTo(min) < 0){
        		min = big[i + K - 1].subtract(big[i]); 
        	}
        }
        System.out.println(min);
	}
}
