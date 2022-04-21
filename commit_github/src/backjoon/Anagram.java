package backjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

  static boolean isAnagram(String a, String b) {
	  	//발상 : 단어 a와 b를 이루고 있는 알파벳 개수를 각자 세서 같으면 애너그램으로 판정 
	  	//엑셀의 countif 생각하였음
	  
	  	final int alphabet = 26;
        char[] alphabetArr = new char[alphabet];
	  	char[] aArr = a.toCharArray();
        char[] bArr = b.toCharArray();
        int[] aAlphabet = new int[alphabet];
        int[] bAlphabet = new int[alphabet];
        
        for(int i=0;i<alphabet;i++) {
        	alphabetArr[i] = (char) (i+'a');
        } // char 배열에 알파벳을 하나씩 담음
        
        for(int j=0;j<alphabet;j++) {
        	for(int i=0;i<aArr.length;i++) {
        		if(alphabetArr[j]==aArr[i]) {
        			aAlphabet[j]++;
        		}
        	}
        } // 이중 for문으로 a가 몇갠지, b가 몇갠지 별도의 배열에 저장
        
        for(int j=0;j<alphabet;j++) {
        	for(int i=0;i<bArr.length;i++) {
        		if(alphabetArr[j]==bArr[i]) {
        			bAlphabet[j]++;
        		}
        	}
        }
        
        return Arrays.equals(aAlphabet, bAlphabet); // 같은지 판별하여 같으면 t 아니면 f
        
  } // isAnagram


  public static void main(String[] args) {    
        Scanner scan = new Scanner(System.in);

        String a = scan.next();
        String b = scan.next();

        scan.close();

        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
  } // main

} // end class