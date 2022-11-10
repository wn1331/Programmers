package dev;

import java.util.Arrays;

public class LV0_08_문자열_정렬하기_2 {

	public static void main(String[] args) {
		String my_string = "hNoAPtfy";
		//모두 소문자로 변경.
		my_string = my_string.toLowerCase();
		//char 배열로 변경.
		char[] char_Arr = my_string.toCharArray();
		//위 배열과 길이가 같은 int배열 생성.
		int[] int_Arr = new int[char_Arr.length];
		//반복문으로 char배열을 아스키코드로 변환후 int배열에 대입.
		for(int i = 0; i<char_Arr.length;i++) {
			int_Arr[i] = (int)char_Arr[i];
		}
		//StringBuffer생성.
		StringBuffer sb = new StringBuffer();
		//정렬.
		Arrays.sort(int_Arr);
		//for문으로 아스키코드값을 다시 char로 변환 후 StringBuffer에 값 추가.
		for(int i = 0; i<char_Arr.length;i++) {
			char_Arr[i] = (char)int_Arr[i];
			sb.append(char_Arr[i]);
		}
		String result = sb.toString();
		
	}

}
