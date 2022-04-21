package backjoon;
import java.util.Scanner;
public class Q2525 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int min = sc.nextInt();
        int cookTime = sc.nextInt();
        
        int sumMin = min+cookTime;
        
        if(sumMin>59) {
            hour += sumMin/60;
            if(hour>23)
                hour -= 24;
            min = sumMin-60*(sumMin/60);
        } else {
            min = sumMin;
        }
        
        System.out.println(hour + " " + min);
    }
}