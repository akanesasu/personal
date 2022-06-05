package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Q2675 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());

		List<String> list = new ArrayList<String>();
		list.add("");
		String[] strArr = null;
		
		for(int i=0;i<testCase;i++) {
			StringTokenizer stk = new StringTokenizer(br.readLine(), " ");
			while(stk.hasMoreTokens()) {
				list.add(stk.nextToken());
			}	
		}
		
		for(int i=1;i<=testCase;i++) {
			strArr = list.get(2*i).split("");
			int repeat = Integer.parseInt(list.get((2*i)-1));
			
			StringBuilder result = new StringBuilder();
			
			for(int j=0;j<strArr.length;j++) {
				for(int k=0;k<repeat;k++) {
					result.append(strArr[j]);
				}
			}
			System.out.println(result);
		}
		br.close();
	}
}