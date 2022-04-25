package Free;

public class Grouping {

	public static void main(String[] args) {
		int userNum = 59; // 전체 인원수
		int[] userArr = new int[userNum];
		int temp=0;
		
		int groupMem = 8; // 조당 인원수
	
		for(int i=0;i<userArr.length;i++) {		
			while(true) {
				int count=0;
				int rand = ((int)(Math.random()*userNum)+1); // 1부터 인원수까지의 난수 생성
				
				for(int j=0;j<=i;j++) {
					if(userArr[j]==rand) {
						count++; // 중복이 있으면 count 올림
					}
				}
				
				if(count==0) {
					temp=rand;
					break;
				} // 중복이 없어서 count가 0이면 대입하고 탈출, 있으면 난수 다시 생성
			}
			
			userArr[i]=temp; // 대입
		}
		
		for(int i=0;i<userArr.length;i++) {
			if(i%groupMem==0) System.out.printf("%d조 : ", (i/groupMem)+1);
			System.out.printf("%2d ", userArr[i]);
			if(i%groupMem==(groupMem-1)) System.out.println();
		} // for
		
	} // main
	
} // end class