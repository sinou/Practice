package HackerRank;

import java.io.*;
public class Solution2 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String s;
		s = in.readLine();
		int temp, temp1;
        StringBuffer answer = new StringBuffer("");
		while ((s = in.readLine()) != null && s.length() != 0) {
			temp = Integer.parseInt(s);
			temp1 = temp;

			while (temp1 % 3 != 0) {
				temp1 = temp1 - 5;
			}
			if (temp1 < 0) {
				System.out.print("-1");
			} else {
				for (int i = 0; i < temp1; i++) {
					answer.append("5");

				}
				for (int i = 0; i < temp - temp1; i++) {
					answer.append("3");
				}
			}
			System.out.println(answer);
            answer = new StringBuffer("");
            System.gc();
		}
	}

}
