package backjoon;
import java.util.*;

public class Q1193 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int num = sc.nextInt();
    	int count = 1;
    	int prevSum = 0;
    	
    	while(true) {
    		if(num<=count+prevSum) {
    			if(count%2!=0) {
    				System.out.println((count-(num-prevSum-1))+"/"+(num-prevSum));
    				break;
    			} else {
    				System.out.println((num-prevSum)+"/"+(count-(num-prevSum-1)));
    				break;
    			}
    		} else {
    			prevSum += count;
    			count++;
    		}
    	}
    	
    	sc.close();
    }
}