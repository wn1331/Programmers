package dev;

import java.util.Arrays;

public class LV0_21_한_번만_등장한_문자 {

	public static void main(String[] args) {
		
		String s = "abcabcadc";
		
		char[] c_arr = s.toCharArray();
		
		Arrays.sort(c_arr);
		
		String answer = String.valueOf(c_arr);
		
		for(int i = 0; i<c_arr.length;i++) {
			if(i!=c_arr.length-1) {
				if(c_arr[i]==c_arr[i+1]) {
					answer = answer.replaceAll(Character.toString(c_arr[i]), "");
				}
			}
		}
		System.out.println(answer);
		
	}

}
