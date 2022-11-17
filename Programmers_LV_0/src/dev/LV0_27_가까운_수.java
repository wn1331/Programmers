package dev;

public class LV0_27_가까운_수 {

	public static void main(String[] args) {
		int[] array = {3,10,28};
		int n = 20;
		
		int answer=0;
		int min = 100;
		for(int i=0;i<array.length;i++) {
			if(min>Math.abs(n-array[i])) {
				min = Math.abs(n-array[i]);
				answer = array[i];
			}
		}
		System.out.println(answer);
		
	}

}
