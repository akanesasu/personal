package homework;

// 과제 2 : 팩토리얼 재귀안쓰고

public class Homework02 {

	public static void main(String[] args) {
		double num = 1;
		double temp = 1;
		int loop = 100;
		
		for(int i=1;i<=loop;i++) {
			temp = num;
			num = temp*i;
			System.out.printf("%d! = %.2E\n", i, num);
		} //for
		
	} //main
	
} //end class