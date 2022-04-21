package backjoon;

import java.io.*;

public class Q15552 {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
    	int loop = Integer.parseInt(br.readLine());
    	for(int i=0;i<loop;i++) {
    		String str = br.readLine();
    		int num1 = Integer.parseInt(str.split(" ")[0]);
    		int num2 = Integer.parseInt(str.split(" ")[1]);
    		bw.write(num1+num2+"\n");
    	}
    	bw.flush();
    }
}