package homework;

public class Homework01 {
	
	public static void main(String[] args) {
		
		final int caveHeight = 300;
		final int slippery = 17;
		final int dayClimb = 40;
		
		int days = 1;
		int leftHeight = caveHeight;
		
		for(;;) {
			
			if(leftHeight>0) {
				leftHeight -= dayClimb;
				if(leftHeight<0) break;
				leftHeight += slippery;
				System.out.println(days + "일차 올라간 높이: " + (caveHeight-leftHeight) + "m");
				days++;
			} //if
			
		} //for
		
		System.out.println("걸린 일수 : " + days +"일");
		
	} //main
	
} //end class