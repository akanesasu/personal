package backjoon;
import java.util.*;

public class Q2480 {
    public static void main(String[] args) {
        //같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다. 
        //같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다. 
        //모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다.
        Scanner sc = new Scanner(System.in);
        
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int money = 0;
        
        if(n1==n2 && n2 == n3 && n3 == n1) {
        	money = 10000 + n1*1000;
        } else if(n1==n2 || n1==n3) {
        	money = 1000 + n1*100;
        } else if(n2==n3) {
        	money = 1000 + n2*100;
        } else {
        	money = Math.max(n1, Math.max(n2, n3)) *100;
        }        
        
        System.out.println(money);
    }
}