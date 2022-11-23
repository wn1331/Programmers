package dev;

import java.util.ArrayList;

public class LV0_87_숨어있는_숫자의_덧셈_2 {

	public static void main(String[] args) {
		String my_string = "aAb1B2cC34oOp";
		
		
		int answer = 0;
		ArrayList<String> stAL = new ArrayList<>();
		char[] chs = my_string.toCharArray();
		//아스키코드로 문자만 공백으로 변환
		for(int i = 0; i<chs.length;i++) if((int)chs[i]>64&&(int)chs[i]<123)chs[i] = ' ';
		String str = String.valueOf(chs);
		String[] st_arr = str.split(" ");
		for(String st : st_arr) if(!st.equals(" ")&&!st.equals("")) {
			stAL.add(st);
			answer+=Integer.parseInt(st);
		}
		
		
	}

}
