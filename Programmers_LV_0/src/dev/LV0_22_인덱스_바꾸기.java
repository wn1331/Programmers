package dev;

import java.util.Arrays;

public class LV0_22_인덱스_바꾸기 {

	public static void main(String[] args) {
		String my_string = "hello";
		int num1 = 1, num2 = 4; 
		String[] arr = my_string.split("");
		String temp = arr[4];
		temp = arr[num2];
		arr[num2] = arr[num1];
		arr[num1] = temp;
		String str = "";
		for(String ar : arr)str+=ar;
		System.out.println(str);
	}

}
