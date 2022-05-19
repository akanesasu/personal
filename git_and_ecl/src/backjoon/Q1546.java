package backjoon;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1546 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int length = Integer.parseInt(br.readLine());
		int[] initScoreArr = new int[length];
		String tempStr = br.readLine();
		StringTokenizer stk = new StringTokenizer(tempStr," ");
		br.close();
		for(int i=0;i<length;i++) initScoreArr[i] = Integer.parseInt(stk.nextToken());
		double[] AfterScoreArr = new double[initScoreArr.length];
		
		//modified bubble sort
		for(int i=0;i<initScoreArr.length-1;i++) {
			int temp;
			if(initScoreArr[i]>initScoreArr[i+1]) {
				temp = initScoreArr[i+1];
				initScoreArr[i+1] = initScoreArr[i];
				initScoreArr[i] = temp;
			} // if
		} // for
		
		int maxScore = initScoreArr[initScoreArr.length-1];
		for(int i=0;i<AfterScoreArr.length;i++) AfterScoreArr[i] = initScoreArr[i]*100/(double)maxScore;

		double temp=0;
		for(int i=0;i<AfterScoreArr.length;i++) temp += AfterScoreArr[i];
		double afterAvg = temp/(double)(AfterScoreArr.length);
		
		System.out.println(afterAvg);
	} // end main
} // end class