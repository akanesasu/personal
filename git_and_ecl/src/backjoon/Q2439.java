package backjoon;
import java.util.Scanner;

public class Q2439 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        for(int i=1;i<=num;i++){
            for(int k=num;k>i;k--){
                System.out.print(" ");
            }
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}