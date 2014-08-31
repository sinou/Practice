package HackerRank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Solution3 {
	
	public static void main(String args[]) throws IOException{
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String s;
		int N = 0;
		s = in.readLine();
		N = Integer.parseInt(s.split(" ")[0].trim());
		s = in.readLine();
		String temp1[] = s.split(" ");
		int width[] = new int[temp1.length];
		int i = 0;
		int begin, end, smallest = 1;
		for(String temp: temp1){
			width[i++] = Integer.parseInt(temp.trim());
		}
		while ((s = in.readLine()) != null && s.length() != 0){
			temp1 = s.split(" ");
			begin = Integer.parseInt(temp1[0].trim());
			end = Integer.parseInt(temp1[1].trim());
			smallest = width[begin];
			if(smallest != 1){
			for(int j = begin; j <= end; j++){
				if(width[j] < smallest){
					smallest = width[j];
				}
			}
			}
			System.out.println(smallest);
		}
	}

}
