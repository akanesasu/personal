package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1065 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		br.close();
		
		int count=0;
		for(int i=1;i<=num;i++) if(ap(i)==true) count++;
		System.out.println(count);
	} // end main
	
	public static boolean ap(int num) {
		int num100 = (num/100)%10;
		int num10 = (num/10)%10;
		int num1 = num%10;
		if(num<100) {
			return true;
		} else if(num==1000) {
			return false;
		} else if((num1-num10)==(num10-num100)) {
			return true;
		} else {
			return false;
		}// end if
	} // end self
} // end class