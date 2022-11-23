package dev;

public class LV0_78_최대값_만들기_2 {

	public static void main(String[] args) {
		int[] numbers = {0, -31, 24, 10, 1, 9};
		int answer = -99999999;
		//테스트 케이스 7번 -> 최대값이 음수일 때.
		for(int i = 0; i<numbers.length;i++) {
			for(int j = 0; j<numbers.length;j++) {
				if(i!=j&&answer<numbers[i]*numbers[j]) {
					System.out.println(numbers[i]*numbers[j]);
					answer = numbers[i]*numbers[j];
				}
				
			}
		}
		System.out.println();
		
		
		
	}

}
