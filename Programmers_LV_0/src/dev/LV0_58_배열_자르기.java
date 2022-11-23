package dev;

import java.util.ArrayList;

public class LV0_58_배열_자르기 {

	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 5};
		int num1 = 1, num2 = 3;

		ArrayList<Integer> arr = new ArrayList<>();
		for(int i = num1;i<num2+1;i++)arr.add(numbers[i]);
		int[] answer = new int[arr.size()];
		for(int i = 0;i<arr.size();i++)answer[i] = arr.get(i);
		
		
		
	}

}
