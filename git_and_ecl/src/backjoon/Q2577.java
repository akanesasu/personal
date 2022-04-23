package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//세 개의 자연수 A, B, C가 주어질 때 A × B × C를 계산한 결과에 
//0부터 9까지 각각의 숫자가 몇 번씩 쓰였는지를 구하는 프로그램을 작성하시오.

public class Q2577 {
    public static void main(String[] args) throws IOException {
    	final int number = 10;
        int[] numberArr = new int[number];
        int[] resultArr = new int[number];
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int A = Integer.parseInt(br.readLine());
    	int B = Integer.parseInt(br.readLine());
    	int C = Integer.parseInt(br.readLine());
    	
    	br.close();
    	
    	int num = A*B*C;
    	String[] strNum = Integer.toString(num).split("");
        int[] inputArr = new int[strNum.length];
    	
    	for(int i=0;i<number;i++) {
        	numberArr[i] = i;
        }
        
        for(int i=0;i<inputArr.length;i++) {
        	inputArr[i]=Integer.parseInt(strNum[i]);
        }
        
        for(int j=0;j<numberArr.length;j++) {
        	for(int i=0;i<inputArr.length;i++) {
        		if(numberArr[j]==inputArr[i]) {
        			resultArr[j]++;
        		}
        	}
        	
        	System.out.println(resultArr[j]);
        }       
    }
}