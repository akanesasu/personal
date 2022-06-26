package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class Q1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        char[] arr = input.toUpperCase().toCharArray();

        Integer[] result = new Integer[26];

        int max = 0;
        boolean isDup = false;

        for(int i=0;i< result.length;i++) {
            result[i]=0;
        }

        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<26;j++) {
                if(arr[i]==(char)(j+65)) {
                    result[j]+=1;
                }
            }
        }

        List<Integer> list = Arrays.asList(result);

        for(int i=0;i<list.size();i++) {
            if (max <= list.get(i)) {
                if (max == list.get(i)) {
                    isDup = true;
                } else {
                    max = list.get(i);
                    isDup = false;
                }
            }
        }

        if(!isDup) {
            System.out.println((char)(list.indexOf(max)+65));
        } else {
            System.out.println("?");
        }
    }
}