package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1003 {
	private static int one;
	private static int zero;

	public static void main(String[] args) throws Exception, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());

		for(int i=0;i<count;i++) {
			fibo(Integer.parseInt(br.readLine()));
			System.out.println(zero + " " + one);
			zero=0; one=0;
		}

		br.close();
	}
	
	public static void fibo(int n) {
		int first = 0;
		int second = 1;
		int temp = 0;
		
		if (n == 0) {
			zero++;
	    } else if (n == 1) {
	    	one++;
	    } else {
	        for(int i=1;i<n;i++) {
	        	temp = first + second;
	        	first = second;
	        	second = temp;
	        }
	        
	        zero = first;
	        one = second;
	    }
	}
}