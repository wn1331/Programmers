package dev;

public class LV0_48_배열의_평균값 {

	public static void main(String[] args) {
		double[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		double answer = 0;
		for(int i = 0; i<numbers.length;i++) answer+=numbers[i];
		answer/=numbers.length;
		
	}

}
