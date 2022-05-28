package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10809 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		br.close();

		char[] inputArr = input.toCharArray();
		int[] resultArr = new int[26];

		for(char i='a';i<='z';i++) {
			for(int j=0;j<inputArr.length;j++) {
				if(inputArr[j] == i) {
					resultArr[i-'0'-49] = j;
					break;
				} else resultArr[i-'0'-49] = -1;
			} // inner for
		} // outer for

		for(int i=0;i<resultArr.length;i++) System.out.print(resultArr[i] + " ");
	} // end main
} // end class