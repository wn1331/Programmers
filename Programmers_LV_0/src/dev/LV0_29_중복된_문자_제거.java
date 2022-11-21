package dev;

import java.util.Arrays;

public class LV0_29_중복된_문자_제거 {

	public static void main(String[] args) {
		String my_string = "We are the world";
		String answer = "";
		String[] arr = my_string.split("");
		arr = Arrays.stream(arr).distinct().toArray(String[]::new);;
		for(String st : arr)answer+=st;
		
		System.out.println(answer);
	}

}
