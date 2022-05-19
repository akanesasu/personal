package backjoon;

public class Q4673 {
	public static void main(String[] args) {
		int count = 10000;
		int[] tempNumArr = new int[count];
		int[] selfNumArr = new int[count];
		
		for(int i=0;i<count;i++) {
			if(self(i+1)<count) tempNumArr[self(i+1)-1] = self(i+1);
		}
		
		for(int i=0, j=0;i<selfNumArr.length;i++) {
			if(tempNumArr[i]!=i+1) {
				selfNumArr[j] = i+1;
				j++;
			}
		}

		for(int i=0;i<selfNumArr.length;i++) {
			if(selfNumArr[i]==0 || selfNumArr[i]==count) break;
			System.out.println(selfNumArr[i]);
		}
	} // end main
	
	public static int self(int num) {
		int num1000 = num/1000;
		int num100 = (num/100)%10;
		int num10 = (num/10)%10;
		int num1 = num%10;
		int sum = num1000 + num100 + num10 + num1 + num; 
		return sum;
	} // end self
} // end class