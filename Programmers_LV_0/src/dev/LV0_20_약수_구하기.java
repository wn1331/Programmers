package dev;

import java.util.ArrayList;

public class LV0_20_약수_구하기 {

	public static void main(String[] args) {
		int n = 24;
		ArrayList<Integer> arr = new ArrayList<>();
		for(int i = 1;i<=n;i++) {
			if(n%i==0) {
				arr.add(i);
			}
		}
		;
		int[] answer = arr.stream()
                .mapToInt(Integer::intValue)
                .toArray();
		
	}

}
