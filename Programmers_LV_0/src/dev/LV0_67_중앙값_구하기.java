package dev;

import java.util.Arrays;

public class LV0_67_중앙값_구하기 {

	public static void main(String[] args) {
		int[] arr = {1, 2, 7, 10, 11};
		
		Arrays.sort(arr);
		
		int answer = arr[arr.length/2];
		System.out.println(answer);
		
		
	}

}
