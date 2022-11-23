package dev;

public class LV0_84_공_던지기 {

	public static void main(String[] args) {
		
		int[] numbers = {1, 2, 3, 4, 5, 6};
		int k = 5;
		int[] numbers_new = new int[numbers.length*k];
		
		for(int i = 0; i<numbers_new.length;i++) numbers_new[i] = (i)%numbers.length+1;
		for(int i = 0, count=1; i<numbers_new.length;i+=2, count++) {
			if(count==k) {
				System.out.println(numbers_new[i]);
				break;
			}
		}
		
		
		
		
	}

}
