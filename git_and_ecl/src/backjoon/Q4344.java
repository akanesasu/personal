package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q4344 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int countCase = Integer.parseInt(br.readLine());
		String[] strArr = new String[countCase];
		for(int i=0;i<countCase;i++) strArr[i] = br.readLine();
		br.close();
		
		double avg =0;
		double temp = 0;
		double[] avgArr = new double[countCase];
		
		for(int i=0;i<countCase;i++) {
			String[] ansArr = new String[strArr[i].length()];
			ansArr = strArr[i].split(" ");
			
			for(int j=1;j<ansArr.length;j++) {
				temp += Integer.parseInt(ansArr[j]);
				avg = temp/(Double.parseDouble(ansArr[0]));
			}

			int count=0;
			for(int j=1;j<ansArr.length;j++) if((Double.parseDouble(ansArr[j]))>avg) count++;
			
			avgArr[i] = count*100/(Double.parseDouble(ansArr[0]));
			avg=0;
			temp=0;
		}
		
		for(int i=0;i<countCase;i++) System.out.printf("%.3f%%\n", avgArr[i]);
	} // end main
} // end class