package backjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Q6996 {

    private static boolean solveAnagrams(String first, String second ) {
        final int alphabet = 26;
        char[] alphabetArr = new char[alphabet];
	  	char[] firstArr = first.toCharArray();
        char[] secondArr = second.toCharArray();
        int[] firstAlphabet = new int[alphabet];
        int[] secondAlphabet = new int[alphabet];
        
        for(int i=0;i<alphabet;i++) {
        	alphabetArr[i] = (char) (i+'a');
        }
        
        for(int j=0;j<alphabet;j++) {
        	for(int i=0;i<firstArr.length;i++) {
        		if(alphabetArr[j]==firstArr[i]) {
        			firstAlphabet[j]++;
        		}
        	}
        }
        
        for(int j=0;j<alphabet;j++) {
        	for(int i=0;i<secondArr.length;i++) {
        		if(alphabetArr[j]==secondArr[i]) {
        			secondAlphabet[j]++;
        		}
        	}
        }
        
        return Arrays.equals(firstAlphabet, secondAlphabet);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numTests = sc.nextInt();

        for (int i = 0; i < numTests; i++) {
            String first = sc.next().toLowerCase();
            String second = sc.next().toLowerCase();

            System.out.println(first + " & " + second + " are " + (solveAnagrams(first, second) ? "anagrams." : "NOT anagrams."));
        }
        sc.close();
    }
}