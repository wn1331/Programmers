package dev;

import java.util.ArrayList;
import java.util.Arrays;

public class LV0_70_문자열_정렬하기 {

	public static void main(String[] args) {
		String my_string = "hi12392";
		ArrayList<Integer> arr = new ArrayList<>();
		char[] chs = my_string.toCharArray();
		for(char ch : chs) {
			if(ch>=48&&ch<=57) {
				arr.add(Integer.parseInt(Character.toString(ch)));
			}
		}
		int[] answer = new int[arr.size()];
		for(int i = 0;i<answer.length;i++)answer[i] = arr.get(i);
		Arrays.sort(answer);
	}

}
