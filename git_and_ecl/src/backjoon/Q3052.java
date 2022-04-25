package backjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q3052 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean[] arr = new boolean[42];
		int count=0;
		
		for(int i=0;i<10;i++) {
			arr[Integer.parseInt(br.readLine())%42] = true;
		}

		for(int i=0;i<42;i++) {
			if(arr[i]==true) count++;
		}
		
		System.out.println(count);
		
		br.close();
	}
}