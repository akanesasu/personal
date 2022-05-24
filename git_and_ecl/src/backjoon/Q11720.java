package backjoon;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q11720 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());
		String numStr = br.readLine();
		br.close();
		
		int[] numArr = new int[count];
		int sum=0;
		
		for(int i=0;i<count;i++) {
			numArr[i] = Integer.parseInt(numStr.split("")[i]);
			sum += numArr[i];
		}
		
		System.out.println(sum);		
	} // end main
} // end class