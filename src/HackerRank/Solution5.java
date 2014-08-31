package HackerRank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int N, C, M;
        int initWrapper, remainingWrapper, answer;
        for(int i = 0; i < t; i++){
            N = in.nextInt();
            C = in.nextInt();
            M = in.nextInt();
            initWrapper = N/C;
            remainingWrapper = initWrapper;
            answer = initWrapper;
            while(remainingWrapper>=M){
            	answer += remainingWrapper/M;
            	remainingWrapper = remainingWrapper%M + remainingWrapper/M;
            }
            System.out.println(answer);
            answer = 0;
        }
    }
}
