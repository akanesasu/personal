package homework;

// 과제 3 : 버블정렬 구현하기

import java.util.Arrays;

public class Homework03 {

	public static void main(String[] args) {
		
		int[] arr = { 13, 8, 6, 19, 23, 52, 23, 17, 4, 1, 7 };
		
		int epoch = 0;
		int swap = 0;
		
		for(int i=0;i<arr.length-1;i++) {
			
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					arr[j] = arr[j] + arr[j+1];
					arr[j+1] =	arr[j] - arr[j+1];
					arr[j] = arr[j] - arr[j+1];
					swap++;
				} //if
				
			} //inner for
			
			epoch++;
			
		} //outer for
		
		System.out.println(Arrays.toString(arr));
		System.out.println("swap = " + swap);
		System.out.println("epoch = " + epoch);
		
	} //main
	
} //end class