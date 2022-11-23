package dev;

import java.util.ArrayList;

public class LV0_64_짝수가_싫어요 {

	public static void main(String[] args) {
		int n = 100;
		ArrayList<Integer> arr = new ArrayList<>();
		for(int i = 1;i<=n;i+=2)arr.add(i);
		int[] answer = new int[arr.size()];
		for(int i = 0; i<arr.size();i++)answer[i] = arr.get(i);
		
	}

}
