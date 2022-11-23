package dev;

public class LV0_69_숨어있는_숫자의_덧셈 {

	public static void main(String[] args) {
		String my_string = "aAb1B2cC34oOp";
		int answer = 0;
		char[] chs = my_string.toCharArray();
		for(char ch : chs) {
			if(ch>=48&&ch<=57) {
				answer+=Integer.parseInt(Character.toString(ch));
			}
		}
		System.out.println(answer);
		
	}

}
