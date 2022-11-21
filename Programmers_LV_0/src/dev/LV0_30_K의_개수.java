package dev;

import java.util.ArrayList;

public class LV0_30_K의_개수 {

	public static void main(String[] args) {
		//i 부터 j 까지 k의 개수 구하기.
		int i = 10, j = 50, k = 5;
		String str = "";
		int answer = 0;
		for(int start=i;start<=j;start++)str+=start;
		System.out.println(str);
		String[] arr = str.split("");
		for(String result : arr)if(result.equals(Integer.toString(k)))answer++;
		System.out.println(answer);
	}

}
