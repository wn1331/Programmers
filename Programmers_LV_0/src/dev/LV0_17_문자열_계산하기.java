package dev;

public class LV0_17_문자열_계산하기 {

	public static void main(String[] args) {
		String my_string = "1 + 2 - 1 + 5";//답 7
		
		String[] str_arr = my_string.split(" ");
		int result = Integer.parseInt(str_arr[0]);
		for(int i = 0; i<str_arr.length; i++) {
			if(str_arr[i].equals("+")) {
				result+=Integer.parseInt(str_arr[i+1]);
			}
			else if(str_arr[i].equals("-")) {
				result-=Integer.parseInt(str_arr[i+1]);

			}
		}
		System.out.println(result);
		
	}

}
