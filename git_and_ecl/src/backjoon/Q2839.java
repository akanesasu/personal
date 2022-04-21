package backjoon;
import java.util.*;

public class Q2839 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    	int num = sc.nextInt();
    	int n1 = 0;
    	int n2 = 0;
    	int sum = 0;
    	
    	if(num>=8 || (num%3==0 || num%5==0)) {
    		Outer:
    		for(n1=0;n1<=num/3;n1++) {
        		for(n2=0;n2<=num/5;n2++) {
        			sum = 3*n1+5*n2;
        			if(sum==num) {
        				System.out.println(n1+n2);
        				break Outer;
        			}		
        		}
    		}
    	} else {
 			System.out.println(-1);
    	}
    }
}