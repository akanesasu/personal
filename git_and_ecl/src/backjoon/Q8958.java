package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q8958 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int countCase = Integer.parseInt(br.readLine());
		String[] strArr = new String[countCase];
		for(int i=0;i<countCase;i++) strArr[i] = br.readLine();
		br.close();
		
		int score=0;
		int sumOfScore=0;
		int[] sumScoreArr = new int[countCase];
		
		for(int i=0;i<countCase;i++) {
			String[] ansArr = new String[strArr[i].length()];
			ansArr = strArr[i].split("");
			
			for(int j=0;j<ansArr.length;j++) {
				if(ansArr[j].equals("O")) {
					score++;
					sumOfScore += score;
				} else {
					score = 0;
				} // if-else
			} // inner for
			
			sumScoreArr[i] = sumOfScore;
			sumOfScore = 0;
			score = 0;
		} // outer for
		
		for(int i=0;i<countCase;i++) System.out.println(sumScoreArr[i]);
	} // end main
} // end class